package com.jishnu.Items.model;

import com.google.cloud.Timestamp;

public class DateTime {
    public Timestamp value;

    public DateTime() {
    }

    public DateTime(Timestamp value) {
        this.value = value;
    }

    public Timestamp getValue() {
        return value;
    }

    public void setValue(Timestamp value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "DateTime [value=" + value + "]";
    }
    
    
}
