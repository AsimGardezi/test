package com.disappears.android.util;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.SingleTransformer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;

public class RxUtil {
    private static final String TAG = RxUtil.class.getName();

    public static <T> Observable<T> applyRetryScheme(Observable<T> o, final int maxTries, final int periodInSeconds) {
        return o.retryWhen(new Function<Observable<Throwable>, ObservableSource<?>>() {
            @Override
            public ObservableSource<?> apply(@NonNull Observable<Throwable> throwableObservable) throws Exception {
                return throwableObservable.zipWith(Observable.range(1, maxTries), new BiFunction<Throwable, Integer, Object>() {
                    @Override
                    public Object apply(@NonNull Throwable throwable, @NonNull Integer integer) throws Exception {
                        DLog.INSTANCE.d("RxUtil", "Reconnect: " + integer);
                        return integer;
                    }
                }).flatMap(new Function<Object, ObservableSource<?>>() {
                    @Override
                    public ObservableSource<?> apply(@androidx.annotation.NonNull Object o) throws Exception {
                        return Observable.timer((int) o * periodInSeconds, TimeUnit.SECONDS);
                    }
                });
            }
        });
    }

    public static <T> Observable<T> executePeriodically(final Observable<T> o, final int periodInSeconds) {
        return Observable.interval(0, periodInSeconds, TimeUnit.SECONDS).flatMap(new Function<Long, ObservableSource<T>>() {
            @Override
            public ObservableSource<T> apply(@NonNull Long aLong) throws Exception {
                DLog.INSTANCE.d(TAG, "Executing observable scheduled for periodic runs " + o.toString());
                return o;
            }
        }).retryWhen(new Function<Observable<Throwable>, ObservableSource<?>>() {
            @Override
            public ObservableSource<?> apply(@NonNull Observable<Throwable> throwableObservable) throws Exception {
                return throwableObservable.zipWith(Observable.range(1, 10), new BiFunction<Throwable, Integer, Object>() {
                    @Override
                    public Object apply(@NonNull Throwable throwable, @NonNull Integer integer) throws Exception {
                        return integer;
                    }
                }).flatMap(new Function<Object, ObservableSource<?>>() {
                    @Override
                    public ObservableSource<?> apply(@NonNull Object o) throws Exception {
                        return Observable.timer((int) o * periodInSeconds, TimeUnit.SECONDS);
                    }
                });
            }
        });
    }

    public static final SingleTransformer<Object, Object> UI_IO = new SingleTransformer<Object, Object>() {
        @Override
        public SingleSource<Object> apply(Single<Object> upstream) {
            return upstream.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        }
    };

    public static <T> SingleTransformer<T, T> UiIo() {
        //noinspection unchecked
        return (SingleTransformer<T, T>) UI_IO;
    }
}
