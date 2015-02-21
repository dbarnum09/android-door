package com.barnum.doormonitor.com.barnum.doormonitor.model;

/**
 * Created by davebarnum on 2/18/15.
 */

    public enum StatusEnum {
        Unlocked(-1), Locked(0), Unknown(1);
        private int value;

        private StatusEnum(int value) {
            this.value = value;
        }
    }
