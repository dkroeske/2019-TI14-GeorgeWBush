package com.appsfromholland.georgebush;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class GeorgeBushDetailedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_george_bush_detailed);

        GeorgeBush gwb = (GeorgeBush) getIntent().getSerializableExtra("GWB_OBJECT");

        ImageView iv = findViewById(R.id.gbw_big_image);

        int resid = getResources().getIdentifier(
                gwb.getImageUrl(),
                "drawable",
                getPackageName()
        );

        iv.setImageResource(resid);

    }
}
