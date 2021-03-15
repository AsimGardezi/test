package com.disappears.android.service

//class CallService : Service(), AGEventHandler {
//
//    interface CallEndCallback {
//        fun callShouldEnd()
//    }
//
//    private val workerThread: WorkerThread = (application as DisappearsApp).workerThread
//
//    private var binder = CallServiceBinder()
//
//    private var uids = mutableListOf<Int>()
//
//    private var callEndCallback: CallEndCallback? = null
//
//    override fun onFirstRemoteVideoDecoded(uid: Int, width: Int, height: Int, elapsed: Int) {
//    }
//
//    override fun onJoinChannelSuccess(channel: String?, uid: Int, elapsed: Int) {
//        uids.add(uid)
//    }
//
//    override fun onUserOffline(uid: Int, reason: Int) {
//        uids.remove(uid)
//        if (uids.size < 2) {
//            workerThread.leaveChannel(workerThread.engineConfig?.mChannel)
//            callEndCallback?.callShouldEnd()
//            stopSelf()
//        }
//    }
//
//    override fun onExtraCallback(type: Int, vararg data: Any?) {
//    }
//
//    override fun onBind(p0: Intent?): IBinder {
//        return binder
//    }
//
//    override fun onCreate() {
//        super.onCreate()
//        workerThread.start()
//        workerThread.waitForReady()
//        workerThread.eventHandler().addEventHandler(this)
//    }
//
//    override fun onDestroy() {
//        super.onDestroy()
//        workerThread.exit()
//    }
//
//    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
//        return START_STICKY
//    }
//
//    inner class CallServiceBinder : Binder() {
//        fun getService() : CallService {
//            return this@CallService
//        }
//    }
//
//    fun registerAGHandler(handler: AGEventHandler) {
//        workerThread.eventHandler().addEventHandler(handler)
//    }
//
//    fun registerCallEndedCallback(cb: CallEndCallback) {
//        callEndCallback = cb
//    }
//
//    fun unregisterAGHandler(handler: AGEventHandler) {
//        workerThread.eventHandler().removeEventHandler(handler);
//    }
//
//    fun getCallWorkerThread() : WorkerThread {
//        return workerThread
//    }
//
//    fun moveToForeground(channelId: String, callMembers: ArrayList<String>, video: Boolean) {
//
//        val intent = ChatActivity.newIntent(this, channelId, callMembers, video)
//
//        val pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT)
//        val notification = NotificationCompat.Builder(this)
//                .setContentTitle(TextUtils.join(",", callMembers))
//                .setContentText(getString(R.string.call_in_progress))
//                .setSmallIcon(R.mipmap.ic_launcher)
//                .setContentIntent(pendingIntent)
//                .build()
//        startForeground(1, notification)
//    }
//
//    fun cancelForeground() {
//        stopForeground(true)
//    }
//
//
//
//}