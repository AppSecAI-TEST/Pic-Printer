package com.appbuilders.tsjprinter.Controller;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.appbuilders.libraries.Rester.ReSTCallback;
import com.appbuilders.libraries.Rester.ReSTClient;
import com.appbuilders.libraries.Rester.ReSTRequest;
import com.appbuilders.libraries.Rester.ReSTResponse;
import com.appbuilders.tsjprinter.Credentials;
import com.appbuilders.tsjprinter.R;
import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class Splash extends AppCompatActivity {

    public ImageView logo;
    public EditText user;
    public EditText password;
    public Button login;
    public TextView credential;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        this.logo = (ImageView) findViewById(R.id.logo);
        this.user = (EditText) findViewById(R.id.user);
        this.password = (EditText) findViewById(R.id.pass);
        this.login = (Button) findViewById(R.id.login);
        this.credential = (TextView) findViewById(R.id.credential);

        this.animateLogo(this.logo, 800, -threeRuleY(500), false);


        //////////// CALLBACKS

        this.login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ReSTClient rest = new ReSTClient(Credentials.getInstance(Splash.this).getUrl() + "ConsultaFolio");
                ReSTRequest request = new ReSTRequest(ReSTRequest.REST_REQUEST_METHOD_POST, "");
                request.addField("usuario", "su");
                request.addField("password", "supervisor123");
                rest.execute(request, new ReSTCallback() {
                    @Override
                    public void onSuccess(ReSTResponse response) {
                        Log.d("AB_DEV", "RESPUESTA [" + response.statusCode + "]:  " + response.body);
                        //webView.loadData(response.body, "text/html; charset=utf-8", "UTF-8");
                    }

                    @Override
                    public void onError(ReSTResponse response) {

                        Log.d("AB_DEV", "RESPUESTA [" + response.statusCode + "]:  " + response.body);
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
        });
    }

    private void animateLogo(ImageView logo, int duration, float yTransition, final boolean callback) {

        logo.animate().translationY(yTransition).alpha(1.0f).setDuration(duration).setStartDelay(800).setListener(new AnimatorListenerAdapter() {

            @Override
            public void onAnimationEnd(Animator animation) {
                super.onAnimationEnd(animation);
                //this.logo.setVisibility(View.GONE);
                Log.d("AB_DEV", "Termine de animar logo splash");

                if (!callback) {

                    // Animate text edits
                    animate(user, 1100);
                    animate(password, 1100);
                    animate(login, 1100);
                    animate(credential, 1100);

                } else {

                    /*Intent intent = new Intent(Splash.this, Test.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);
                    finish();*/
                }
            }
        });
    }

    private void animate(View input, int duration) {

        input.setVisibility(View.VISIBLE);
        YoYo.with(Techniques.SlideInLeft).duration(duration).playOn(input);
    }

    private float threeRuleY(float value) {

        Display display = this.getWindowManager().getDefaultDisplay();
        Point size = new Point();
        Log.d("AB_DEV", "Screen: " + size.x + " - " + size.y);
        display.getSize(size);
        return ( size.y * value ) / 2560;
    }
}
