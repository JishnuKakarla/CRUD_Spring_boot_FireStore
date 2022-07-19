package com.jishnu.Items.model;

import com.google.cloud.firestore.GeoPoint;

public class LatLng {
    public GeoPoint value;

    public LatLng() {
    }
    public LatLng(GeoPoint value) {
        this.value = value;
    }
    
    public GeoPoint getValue() {
        return value;
    }
    public void setValue(GeoPoint value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return "latLng [value=" + value + "]";
    }

    
}
