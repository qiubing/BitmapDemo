package com.example.drawabledemo;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.mm);
        ImageView one = (ImageView) findViewById(R.id.id_one);
        ImageView two = (ImageView) findViewById(R.id.id_two);
        TextView three = (TextView) findViewById(R.id.id_three);
        //one.setImageDrawable(new RoundImageDrawable(bitmap));
        //two.setImageDrawable(new RoundImageDrawable(bitmap));
        //three.setBackgroundDrawable(new RoundImageDrawable(bitmap));
        one.setImageDrawable(new CircleImageDrawable(bitmap));
        two.setImageDrawable(new CircleImageDrawable(bitmap));
        three.setBackgroundDrawable(new CircleImageDrawable(bitmap));

    }
}
