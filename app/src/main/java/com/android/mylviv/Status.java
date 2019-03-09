package com.android.mylviv;

public enum Status {
    SENT {
        public String toString(){
            return "Надіслано";
        }
    },
    ACCEPTED {
        public String toString(){
            return "Прийнято";
        }
    },
    IN_PROGRESS {
        public String toString(){
            return "Вирішується";
        }
    },
    DONE {
        public String toString(){
            return "Вирішено";
        }
    }
}
