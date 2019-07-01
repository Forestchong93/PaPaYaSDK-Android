package com.bubblespot.papayaadssdk.models;

import com.bubblespot.papayaadssdk.contants.Constants;

import java.util.ArrayList;
import java.util.List;

public class Ads  {
    int adsImage;
    String url;

    public int getAdsImage() {
        return adsImage;
    }

    public void setAdsImage(int adsImage) {
        this.adsImage = adsImage;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public static List<Ads> getDummys(){
        List<Ads> dummys = new ArrayList<>();
        for (int i = 0; i < Constants.bannerImages.length; i++) {
            Ads ads = new Ads();
            ads.setAdsImage(Constants.bannerImages[i]);
            ads.setUrl(Constants.bannerUrls[i]);
            dummys.add(ads);
        }
        return dummys;
    }
}
