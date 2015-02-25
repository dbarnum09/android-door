package com.barnum.doormonitor.com.barnum.doormonitor.model;

import java.util.Observable;

/**
 * Created by davebarnum on 2/23/15.
 */
public class DoorManager extends Observable {

    private static  String TAG = DoorManager.class.getSimpleName();
    private static DoorManager instance;
    private StatusEnum status = StatusEnum.Unknown;


    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
        setChanged();
    }

    private DoorManager() {

    };

    public static DoorManager getInstance() {
        if (instance == null) {
            synchronized (DoorManager.class) {
                if (instance == null) {
                    instance = new DoorManager();
                }
            }
        }
        return instance;
    }
}
