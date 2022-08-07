package nigerindia.app.activities;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

import nigerindia.app.R;
import nigerindia.app.activities.ui.ColorTheme;

public class SplashScreenActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        applyColorTheme();



        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreenActivity.this, SignInActivity.class);
                startActivity(intent);
                finish();


            }
        },3000);



    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    private void applyColorTheme() {
        ColorTheme.setColorTheme(getApplicationContext());
        ColorTheme.window(getApplicationContext(), getWindow());


    }
}