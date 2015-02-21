package com.barnum.doormonitor.com.barnum.doormonitor.model;

import com.barnum.doormonitor.DigitalPinStatus;

/**
 * Created by davebarnum on 2/15/15.
 */
public class DoorStatus {

    private DigitalPinStatus pinStatus;

    public DoorStatus(DigitalPinStatus dStatus ) {
        pinStatus = dStatus;
    }


}
