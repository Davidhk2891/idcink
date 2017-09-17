package idcink.davidrajchenberg.com.idcink;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView cWebViewIdc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cWebViewIdc = (WebView) findViewById(R.id.webViewIdc);

        cWebViewIdc.loadUrl("http://www.idcink.com");

        cWebViewIdc.getSettings().setJavaScriptEnabled(true);

        cWebViewIdc.setWebViewClient(new WebViewClient());

    }
}
