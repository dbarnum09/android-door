package barnum.com.doormonitor.tasks;

import barnum.com.doormonitor.DigitalPinStatus;

/**
 * Created by davebarnum on 2/15/15.
 */
public interface AsyncTaskResult {

      public void onResult(DigitalPinStatus status);
}
