package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.calculator.R;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    TextView tv1;
    EditText et1,et2;
    Button bt1,bt2;
    int count=-1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=findViewById(R.id.editText2);
        et2=findViewById(R.id.editText4);
        bt1=findViewById(R.id.button);
        bt2=findViewById(R.id.button2);
        tv1=findViewById(R.id.textView2);
    }



    public void onbuttonpressed(View view)
    {
        double num1 = "".equals(et1.getText().toString())?0:Double.parseDouble(et1.getText().toString());
        double num2 = "".equals(et2.getText().toString())?0:Double.parseDouble(et2.getText().toString());

        if("".equals(et1.getText().toString()) ||"".equals(et2.getText().toString()))
        {

            Toast.makeText(this, "Inadequate Entry ", Toast.LENGTH_SHORT).show();
        }
        if(count==0){
        double sum = num1 + num2;
        tv1.setText(Double.toString(sum));}

        else if(count==1){
            double sum = num1 - num2;
            tv1.setText(Double.toString(sum));}

        else if(count==2){
            double sum = num1 * num2;
            tv1.setText(Double.toString(sum));}

        else if(count==3){
            double sum = num1 / num2;
            tv1.setText(Double.toString(sum));}
    }

    public void mode(View view)
    {
        count=(count+1)%4;
        if(count==0)
            bt1.setText("Mode Addition");
        else if(count==1)
            bt1.setText("Mode Subtraction");
        else if(count==2)
            bt1.setText("Mode Multiplication");
        else if(count==3)
            bt1.setText("Mode Division");
    }
}
