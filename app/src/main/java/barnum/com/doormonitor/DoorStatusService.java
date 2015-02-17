package barnum.com.doormonitor;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import barnum.com.doormonitor.tasks.AsyncTaskResult;


public class DoorStatusService extends Service implements AsyncTaskResult{

    private final static String LOG_TAG = DoorStatusService.class.getSimpleName();

    public DoorStatusService() {

    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        StatusAsyncTask dStatus = new StatusAsyncTask();
        dStatus.execute(this);
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onResult(DigitalPinStatus status) {
         Log.i(LOG_TAG,"status:" + status.toString());

    }
}
