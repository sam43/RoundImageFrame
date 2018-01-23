package com.module.sayem.roundimageframe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    String img_URL = "http://my.bdjobs.com/photos/225001-250000/10241028k4f5j.jpg";
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.iv_cir_img);

        final float scale = getResources().getDisplayMetrics().density;
        int dpWidthInPx  = (int) (150 * scale);
        int dpHeightInPx = (int) (150 * scale);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(dpWidthInPx, dpHeightInPx);
        layoutParams.addRule(RelativeLayout.CENTER_IN_PARENT);
        imageView.setLayoutParams(layoutParams);

        Picasso.with(getApplicationContext()).load(img_URL).placeholder(R.drawable.g_user).transform(new CircularTransform()).into(imageView);
    }
}
