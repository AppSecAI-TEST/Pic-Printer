package com.appbuilders.testprinter;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import android.widget.TextView;
import android.widget.Toast;

import com.appbuilders.testprinter.Rester.ReSTCallback;
import com.appbuilders.testprinter.Rester.ReSTClient;
import com.appbuilders.testprinter.Rester.ReSTRequest;
import com.appbuilders.testprinter.Rester.ReSTResponse;

import java.io.BufferedReader;

public class Splash extends AppCompatActivity {

    WebView webView;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        this.webView = (WebView) findViewById(R.id.webView);
        this.text = (TextView) findViewById(R.id.textView);
        //this.webView.loadUrl("http://www.google.com");

        this.callMe("http://192.168.56.1/rws/service/copy/capability");
        //this.callMe("http://www.google.com");
        //this.callMe("http://localhost");

    }

    public String getRequest() {

        StringBuffer stringBuffer = new StringBuffer("");
        BufferedReader bufferedReader = null;



        return "";
    }

    public void callMe(String url) {

        ReSTClient rest = new ReSTClient(url);
        ReSTRequest request = new ReSTRequest(ReSTRequest.REST_REQUEST_METHOD_GET, "");
        rest.execute(request, new ReSTCallback() {
            @Override
            public void onSuccess(ReSTResponse response) {
                Log.d("AB_DEV", "RESPUESTA = " + response.body);

                text.setText(response.body);
                //webView.loadData(response.body, "text/html; charset=utf-8", "UTF-8");
            }

            @Override
            public void onError(ReSTResponse response) {

                String errorMessage;
                if (response.statusCode == 404) {
                    errorMessage = "HUMAN used SEARCH\nBut, it failed!";
                } else {
                    errorMessage = "Error " + Integer.toString(response.statusCode);
                }
                Toast.makeText(getBaseContext(), errorMessage, Toast.LENGTH_LONG).show();
                //Toast.makeText(getBaseContext(), "Servidores ocupados o placa incrrecta, intentalo de nuevo", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
