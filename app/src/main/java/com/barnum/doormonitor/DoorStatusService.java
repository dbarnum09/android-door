package com.barnum.doormonitor;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

import com.barnum.doormonitor.com.barnum.doormonitor.model.DoorManager;
import com.barnum.doormonitor.com.barnum.doormonitor.model.StatusEnum;
import com.barnum.doormonitor.tasks.AsyncTaskResult;


public class DoorStatusService extends Service implements AsyncTaskResult {

    private final static String LOG_TAG = DoorStatusService.class.getSimpleName();
    private final static  DoorManager mDManager = DoorManager.getInstance();
    public DoorStatusService() {

    }

    public class LocalBinder extends Binder {
        DoorStatusService getService() {
            return  DoorStatusService.this;
        }
    };





    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        StatusAsyncTask dStatus = new StatusAsyncTask();
        dStatus.execute(this);
        return Service.START_NOT_STICKY;
    }

    @Override
    public void onResult(DigitalPinStatus status) {
         Log.i(LOG_TAG,"status:" + status.toString());
         mDManager.setStatus(StatusEnum.fromInteger(status.getReturnValue()));
    }
}
