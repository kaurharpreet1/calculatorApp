package com.calculator.acer.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Integer.parseInt;

public class MainActivity extends AppCompatActivity {
Button b1,b2,b3,b4;
TextView t;
EditText e1,e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.button);
        b2=findViewById(R.id.button2);
        b3=findViewById(R.id.button3);
        b4=findViewById(R.id.button4);

        t=findViewById(R.id.textView3);
        e1=findViewById(R.id.editText);

        e2=findViewById(R.id.editText2);

    }

public void mul(View view){
    String s = e1.getText().toString();
    int x = parseInt(s);
    String s1 = e2.getText().toString();
    int y = parseInt(s1);

int ans= x*y;
t.setText(ans+"");
}
    public void add(View view){

        String s = e1.getText().toString();
        Double x = Double.parseDouble(s);
        String s1 = e2.getText().toString();
        int y = parseInt(s1);

        Double ans= x+y;
        t.setText(ans+"");
    }
    public void sub(View view){
        String s = e1.getText().toString();
        Double x = Double.parseDouble(s);
        String s1 = e2.getText().toString();
        Double y = Double.parseDouble(s1);

        Double ans= x-y;
        t.setText(ans+"");
    }
    public void div(View view){
        String s = e1.getText().toString();
        int x = parseInt(s);
        String s1 = e2.getText().toString();
        int y = parseInt(s1);

        int ans= x/y;
        t.setText(ans+"");
    }

}

