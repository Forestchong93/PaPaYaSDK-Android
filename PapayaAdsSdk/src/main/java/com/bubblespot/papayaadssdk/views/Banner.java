package com.bubblespot.papayaadssdk.views;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.bubblespot.papayaadssdk.R;
import com.bubblespot.papayaadssdk.models.Ads;

import java.util.List;

public class Banner extends FrameLayout {

    private ImageButton btnBannerButton;
    private OnClickListener onClickListener;
    private List<Ads> adsList;
    private int index = 0;

    public Banner(Context context) {
        super(context);
        init(context);
    }

    public Banner(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public Banner(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    public Banner(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context);
    }
    private void setImage(){
        btnBannerButton.setImageResource(adsList.get(index).getAdsImage());
    }
    private void init(final Context context){
        inflate(context, R.layout.banner, this);
        btnBannerButton = this.findViewById(R.id.btnBannerButton);
        onClickListener = new OnClickListener() {
            @Override
            public void onClick(View view) {
                Ads ads = adsList.get(index);
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(ads.getUrl()));
                context.startActivity(browserIntent);
            }
        };
        btnBannerButton.setOnClickListener(onClickListener);
        adsList = Ads.getDummys();



        final Handler mHandler = new Handler();
        final Runnable mStatusChecker = new Runnable() {
            @Override
            public void run() {
                mHandler.postDelayed(this, 10000);
                index += 1;
                if(index >= 3){
                    index = 0;
                }
                setImage();
            }
        };
        mStatusChecker.run();

    }
}
