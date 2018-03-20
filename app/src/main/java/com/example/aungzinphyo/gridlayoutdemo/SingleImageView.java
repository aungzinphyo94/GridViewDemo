package com.example.aungzinphyo.gridlayoutdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

/**
 * Created by aungzinphyo on 3/20/2018.
 */

public class SingleImageView extends Activity {

    public void onCreate(Bundle savedInsatanceState) {

        super.onCreate(savedInsatanceState);

        setContentView(R.layout.single_item_view);

        Intent i = getIntent();

        int position = i.getExtras().getInt("id");

        ImageAdapter imageAdapter = new ImageAdapter(this);

        ImageView imageView = (ImageView) findViewById(R.id.image);

        imageView.setImageResource(imageAdapter.mThumbIds[position]);
    }

}
