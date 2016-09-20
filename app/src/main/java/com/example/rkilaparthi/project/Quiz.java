package com.example.rkilaparthi.project;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

/**
 * Created by rkilaparthi on 9/2/2016.
 */
public class Quiz extends Activity {
    TextView t1;
    RadioGroup rg;
    RadioButton rd1,rd2,rd3;
    public static String questions []={"6*1=?","4*5=?","6*6=?"};
    String answers []={"6","20","36"};
    String opts []={"6","7","8","12","21","20","35","36","37"};
    int position=0;
    public static int correct=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz);
        t1=(TextView)findViewById(R.id.t1);
        rg=(RadioGroup)findViewById(R.id.rg);
        rd1=(RadioButton)findViewById(R.id.rd1);
        rd2=(RadioButton)findViewById(R.id.rd2);
        rd3=(RadioButton)findViewById(R.id.rd3);
        t1.setText(questions[position]);
        rd1.setText(opts[position]);
        rd2.setText(opts[position+1]);
        rd3.setText(opts[position+2]);
        rd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RadioButton selectedans=(RadioButton)findViewById(rg.getCheckedRadioButtonId());
                String selectedansText=selectedans.getText().toString();
                if(selectedansText==answers[position]){
                    correct++;
                }
                position++;
                if(position<questions.length){
                    t1.setText(questions[position]);
                    rd1.setText(opts[position*3]);
                    rd2.setText(opts[position*3+1]);
                    rd3.setText(opts[position*3+2]);
                }
                else{
                    Intent i=new Intent(getApplicationContext(),Result.class);
                    startActivity(i);
                }
            }
        });
        rd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RadioButton selectedans=(RadioButton)findViewById(rg.getCheckedRadioButtonId());
                String selectedansText=selectedans.getText().toString();
                if(selectedansText==answers[position]){
                    correct++;
                }
                position++;
                if(position<questions.length){
                    t1.setText(questions[position]);
                    rd1.setText(opts[position*3]);
                    rd2.setText(opts[position*3+1]);
                    rd3.setText(opts[position*3+2]);
                }
                else{
                    Intent i=new Intent(getApplicationContext(),Result.class);
                    startActivity(i);
                }
            }
        });
        rd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RadioButton selectedans=(RadioButton)findViewById(rg.getCheckedRadioButtonId());
                String selectedansText=selectedans.getText().toString();
                if(selectedansText==answers[position]){
                    correct++;
                }
                position++;
                if(position<questions.length){
                    t1.setText(questions[position]);
                    rd1.setText(opts[position*3]);
                    rd2.setText(opts[position*3+1]);
                    rd3.setText(opts[position*3+2]);
                }
                else{
                    Intent i=new Intent(getApplicationContext(),Result.class);
                    startActivity(i);
                }
            }
        });
    }
}
