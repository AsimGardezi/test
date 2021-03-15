package com.disappears.android.agora.openvcall;

import com.disappears.android.agora.openvcall.model.WorkerThread;

public interface WorkerThreadHolder {

    void initWorkerThread();

    WorkerThread getWorkerThread();

    void deInitWorkerThread();

}