package com.android.mylviv;

public enum ComplaintType {
    LIGHT {
        public String toString(){
            return "Освітлення";
        }
    },
    VANDALISM {
        public String toString(){
            return "Вандалізм";
        }
    },
    ROAD {
        public String toString(){
            return "Дорога";
        }
    },
    ANIMAL {
        public String toString(){
            return "Тварини";
        }
    },
    OTHER {
        public String toString(){
            return "Інше";
        }
    }
}
