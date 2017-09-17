package idcink.davidrajchenberg.com.idcink;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import gr.net.maroulis.library.EasySplashScreen;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        EasySplashScreen config = new EasySplashScreen(SplashScreenActivity.this)
                .withFullScreen()
                .withTargetActivity(MainActivity.class)
                .withSplashTimeOut(6000)
                .withBackgroundColor(Color.parseColor("#64b5f6"))
                .withLogo(R.drawable.idclogosplash)
                .withAfterLogoText("Your tech articles on the go");

        config.getAfterLogoTextView().setTextColor(Color.parseColor("#3F508E"));

        //Set To View
        View view = config.create();

        //Set View to content view
        setContentView(view);

    }
}
