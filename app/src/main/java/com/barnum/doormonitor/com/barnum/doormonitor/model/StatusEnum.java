package com.barnum.doormonitor.com.barnum.doormonitor.model;

/**
 * Created by davebarnum on 2/18/15.
 */

    public enum StatusEnum {
        Unlocked(1), Locked(0), Unknown(-1);

    private int value;

        private StatusEnum(int value) {
            this.value = value;
        }

        public static StatusEnum fromInteger(int v) {
            StatusEnum rVal = null;
            switch(v) {
                case 0:
                    rVal = StatusEnum.Locked;
                    break;
                case 1:
                    rVal =  StatusEnum.Unlocked;
                    break;
                case -1:
                    rVal=  StatusEnum.Unknown;
                    break;
                default:
                    rVal= StatusEnum.Unknown;
                    break;
            }
            return rVal;
        }
    }
