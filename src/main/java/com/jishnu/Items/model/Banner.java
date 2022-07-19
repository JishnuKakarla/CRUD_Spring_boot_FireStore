package com.jishnu.Items.model;

import java.util.List;

import com.google.cloud.firestore.GeoPoint;

public class Banner {

    List<banner> banners; 
    public int timerInMs;
    GeoPoint latLng;
    
    public Banner() {
    }

    public Banner(List<banner> banners, int timerInMs, GeoPoint latLng) {
        System.out.println("Hello");
        this.banners = banners;
        this.timerInMs = timerInMs;
        this.latLng = latLng;
    }

    public List<banner> getBanners() {
        return banners;
    }

    public void setBanners(List<banner> banners) {
        System.out.println("Hello");
        this.banners = banners;
    }

    public int getTimerInMs() {
        return timerInMs;
    }

    public void setTimerInMs(int timerInMs) {
        System.out.println("Hello");
        this.timerInMs = timerInMs;
    }
    
    public GeoPoint getLatLng() {
        return latLng;
    }

    public void setLatLng(GeoPoint latLng) {

        System.out.println(latLng);
        System.out.println("Hello");
        this.latLng = latLng;
    }

    @Override
    public String toString() {
        System.out.println("Hello");
        return "Banner [banners=" + banners + ", latLng=" + latLng + ", timerInMs=" + timerInMs + "]";
    }

    
}
