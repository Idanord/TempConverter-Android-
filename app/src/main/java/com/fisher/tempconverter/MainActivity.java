package com.fisher.tempconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //declare variables
    private EditText fahrenhietEditText;
    private EditText celciusEditText;
    private TextView convertionTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get references
        fahrenhietEditText = (EditText) findViewById(R.id.fahrenheitEditText);
        celciusEditText = (EditText) findViewById(R.id.celsiusEditView);
        convertionTextView = (TextView)findViewById(R.id.convertionTextView);

    }

    public static float convertFahenheitToCelsius(float fahrenheit){
        return ((fahrenheit - 32)* 5/9);
    }

    public static float convertCelsiusToFahengeit(float celsius){
        return ((celsius * 9)/5) + 32;
    }
}
