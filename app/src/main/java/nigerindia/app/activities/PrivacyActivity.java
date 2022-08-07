package nigerindia.app.activities;

import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

import nigerindia.app.R;
import nigerindia.app.activities.ui.ColorTheme;

public class PrivacyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privacy);
        applyColorTheme();


        PDFView pdfView = findViewById(R.id.pdfPrivacy);

        pdfView.fromAsset("privacypolicy.pdf").load();




    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    private void applyColorTheme() {
        ColorTheme.setColorTheme(getApplicationContext());
        ColorTheme.window(getApplicationContext(), getWindow());


    }
}