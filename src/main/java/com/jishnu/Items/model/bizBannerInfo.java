package com.jishnu.Items.model;

public class bizBannerInfo {
    public Object actionType;
    public String bizId; 
    public String offeringCategory;
    public String url;
    
    public bizBannerInfo() {
    }

    public bizBannerInfo(Object actionType, String bizId, String offeringCategory, String url) {
        this.actionType = actionType;
        this.bizId = bizId;
        this.offeringCategory = offeringCategory;
        this.url = url;
    }

    public Object getActionType() {
        return actionType;
    }

    public void setActionType(Object actionType) {
        this.actionType = actionType;
    }

    public String getBizId() {
        return bizId;
    }

    public void setBizId(String bizId) {
        this.bizId = bizId;
    }

    public String getOfferingCategory() {
        return offeringCategory;
    }

    public void setOfferingCategory(String offeringCategory) {
        this.offeringCategory = offeringCategory;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "bizBannerInfo [actionType=" + actionType + ", bizId=" + bizId + ", offeringCategory=" + offeringCategory
                + ", url=" + url + "]";
    }  

    
}
