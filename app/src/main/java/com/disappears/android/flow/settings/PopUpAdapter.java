package com.disappears.android.flow.settings;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.disappears.android.R;

import org.w3c.dom.Text;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

public class PopUpAdapter extends PagerAdapter {
    Context context;
    List<PopUpPageModel> pageArr;
    LayoutInflater inflater;

    public PopUpAdapter(Context context, List<PopUpPageModel> pageArr) {
        this.context = context;
        this.pageArr = pageArr;
        inflater = ((Activity) context).getLayoutInflater();
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return false;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view = inflater.inflate(R.layout.pop_pager_list, container, false);
        TextView title = view.findViewById(R.id.title);
        TextView description = view.findViewById(R.id.subtitle);
        ImageView image = view.findViewById(R.id.imageOnBoarding);
        view.setTag(position);
        ((ViewPager) container).addView(view);
        PopUpPageModel model = pageArr.get(position);
        title.setText(model.getTitle());
        description.setText(model.getDescription());
        image.setImageResource(model.getImage());
        return view;
    }
}
