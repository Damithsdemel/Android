package com.example.damithz.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * This method is called when the order button is clicked.
     */
    int a=0;
    int b=0;
    public void a1(View view) {
        //int a=0;
        a+=3;
        display(a);
    }

    public void a2(View view) {
        //int a=0;
        a+=2;
        display(a);
    }
    public void a3(View view) {
       // int a=0;
        a+=1;
        display(a);
    }
    public void b1(View view) {
        //int a=0;
        b+=3;
        display2(b);
    }

    public void b2(View view) {
        //int a=0;
        b+=2;
        display2(b);
    }
    public void b3(View view) {
        // int a=0;
        b+=1;
        display2(b);
    }
    public void ab(View view) {
        a=0;
        display(a);
        b=0;
        display2(b);
    }

    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.sc);
        quantityTextView.setText(""+number);
    }
    private void display2(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.sc2);
        quantityTextView.setText(""+number);
    }



}
