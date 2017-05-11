package one.rdj.com.smartnetworkdictionary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class HelpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        WebView webView = (WebView)findViewById(R.id.webview);
        webView.loadUrl("file:///android_asset/html/help.html");

    }
}
