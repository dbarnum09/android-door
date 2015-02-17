package barnum.com.doormonitor;

import android.os.AsyncTask;
import android.util.Log;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;

import barnum.com.doormonitor.tasks.AsyncTaskResult;

/**
 * Created by davebarnum on 2/13/15.
 */
public class StatusAsyncTask extends AsyncTask<AsyncTaskResult,Void,DigitalPinStatus> {

    private final OkHttpClient okClient = new OkHttpClient();
    private static final  String url = "http://10.0.1.151/digital/6";
    private AsyncTaskResult resultHandler = null;


    @Override
    protected DigitalPinStatus doInBackground(AsyncTaskResult... params) {
        Response response = null;
        DigitalPinStatus dpin = null;
        resultHandler = params[0];
        Request request = new Request.Builder()
                .url(url)
                .build();
        try {
            response = okClient.newCall(request).execute();
            String resString = response.body().string();
            ObjectMapper mapper = new ObjectMapper();
            dpin = mapper.readValue(resString,DigitalPinStatus.class);
            Log.e(this.getClass().getName(), "Response: " + resString);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dpin;
    }

    @Override
    protected void onPostExecute(DigitalPinStatus o) {
        resultHandler.onResult(o);
        //super.onPostExecute(o);
    }
}
