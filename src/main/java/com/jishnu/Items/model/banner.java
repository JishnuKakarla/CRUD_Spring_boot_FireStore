package com.jishnu.Items.model;

public class banner {
    public String aspectRatio;
    public String imgPath;
    public bizBannerInfo bizBannerInfo;
    

    public banner() {
    }

    public banner(String aspectRatio, String imgPath, com.jishnu.Items.model.bizBannerInfo bizBannerInfo) {
        this.aspectRatio = aspectRatio;
        this.imgPath = imgPath;
        this.bizBannerInfo = bizBannerInfo;
    }

    public String getAspectRatio() {
        return aspectRatio;
    }

    public void setAspectRatio(String aspectRatio) {
        this.aspectRatio = aspectRatio;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public bizBannerInfo getBizBannerInfo() {
        return bizBannerInfo;
    }

    public void setBizBannerInfo(bizBannerInfo bizBannerInfo) {
        this.bizBannerInfo = bizBannerInfo;
    }

    @Override
    public String toString() {
        return "banner [aspectRatio=" + aspectRatio + ", bizBannerInfo=" + bizBannerInfo + ", imgPath=" + imgPath + "]";
    }
    
}
