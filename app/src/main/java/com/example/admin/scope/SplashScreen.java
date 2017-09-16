package com.example.admin.scope;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SplashScreen extends AppCompatActivity {

    ImageView logo;
    TextView tagLine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Hide status bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //hide action bar
        getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_splash_screen);

        logo = (ImageView)findViewById(R.id.logoimage);
        tagLine = (TextView) findViewById(R.id.taglinetv);

        new android.os.Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                logo.animate().translationYBy(-200f).setDuration(2000);
                tagLine.animate().alpha(1f).setDuration(4500);

            }
        },500);

    }
}
