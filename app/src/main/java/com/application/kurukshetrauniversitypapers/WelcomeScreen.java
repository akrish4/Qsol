package com.application.kurukshetrauniversitypapers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class WelcomeScreen extends AppCompatActivity {
ImageView imageView;
TextView textView, textView2;
Animation top, bottom;
//FirebaseAuth mAuth;
    private  static  int SPLASH_SCREEN =2500;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //mAuth=FirebaseAuth.getInstance();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_welcome_screen);

        textView2 = findViewById(R.id.textView2);
        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.textView);


        top = AnimationUtils.loadAnimation(this, R.anim.top);
        bottom = AnimationUtils.loadAnimation(this, R.anim.bottom);
        imageView.setAnimation(top);
        textView.setAnimation(bottom);
        textView2.setAnimation(bottom);
        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run() {
                    Intent intent = new Intent(WelcomeScreen.this, MainActivity.class);
                    startActivity(intent);
                    finish();

            }
        },SPLASH_SCREEN);


    }

    @Override
    public void onBackPressed() {
        System.exit(0);
        super.onBackPressed();
    }
}
