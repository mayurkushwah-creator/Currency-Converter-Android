package com.example.currencyconverter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText dollarInput;
    Button convertButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dollarInput = findViewById(R.id.dollarInput);
        convertButton = findViewById(R.id.convertButton);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String numstr = dollarInput.getText().toString();

                if(numstr.isEmpty()){
                    Toast.makeText(MainActivity.this,
                            "Please enter amount",
                            Toast.LENGTH_SHORT).show();
                    return;
                }

                double num = Double.parseDouble(numstr);

                double rate = 83.0;
                double result = num * rate;

                String strnum = String.format("%.2f", result);

                Toast.makeText(MainActivity.this,
                        "INR: ₹ " + strnum,
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}