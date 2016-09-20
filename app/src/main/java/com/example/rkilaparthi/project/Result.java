package com.example.rkilaparthi.project;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by rkilaparthi on 9/2/2016.
 */
public class Result extends Activity {
    TextView t2;
    Button b12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);
        b12=(Button)findViewById(R.id.btn);
        t2=(TextView)findViewById(R.id.t2);
        t2.setText("your result is:"+Quiz.correct+"/"+Quiz.questions.length);
    }
    public void click(View view) {
        if (view == b12) {
            Intent i=new Intent(getApplicationContext(),MainActivity.class);
            startActivity(i);
        }
    }
}
