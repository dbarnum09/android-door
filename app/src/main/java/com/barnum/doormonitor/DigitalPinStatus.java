package com.barnum.doormonitor;


import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by davebarnum on 2/12/15.
 */
public class DigitalPinStatus {
//    {
//        return_value: 0,
//                id: "008",
//            name: "status",
//            connected: true
//    }

    public int getReturnValue() {
        return returnValue;
    }

    public void setReturnValue(int returnValue) {
        this.returnValue = returnValue;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isConnected() {
        return connected;
    }

    public void setConnected(boolean connected) {
        this.connected = connected;
    }

    @JsonProperty("return_value")
    private int returnValue;
    private String id;
    private String name;
    private boolean connected;

}
