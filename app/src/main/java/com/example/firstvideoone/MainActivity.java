package com.example.firstvideoone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText ed1,ed2;
    Button btnAdd;
    TextView text4_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = (EditText)findViewById(R.id.ed1);
        ed2=(EditText)findViewById(R.id.ed2);
        btnAdd =(Button)findViewById(R.id.btnAdd);
        text4_result=(TextView)findViewById(R.id.text4);
    }

    public void methodAdd(View view) {
        String s1 = ed1.getText().toString(); //value da amra string a conbver korlam,
        String s2 = ed2.getText().toString();

        double num1 = Double.parseDouble(s1); //string thaka abr double a convert korlam
        double num2 = Double.parseDouble(s2);

        double answer = num1+num2;

        text4_result.setText(Double.toString(answer));



    }
}