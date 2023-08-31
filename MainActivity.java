package com.example.currencyconvertor;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextText;
    private EditText editTextText2;
    private ToggleButton toggleButton;
    private ToggleButton toggleButton2;
    private EditText editTextText4;
    private Button button;
    private Button button2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextText = findViewById(R.id.editTextText);
        toggleButton = findViewById(R.id.toggleButton);
        editTextText4 = findViewById(R.id.editTextText4);
        editTextText2=findViewById(R.id.editTextText2);
        toggleButton2=findViewById(R.id.toggleButton2);
        button=findViewById(R.id.button);
        button2=findViewById(R.id.button2);

        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String rupeesStr = editTextText.getText().toString();
                if (!rupeesStr.isEmpty()) {
                    double rupees = Double.parseDouble(rupeesStr);
                    double conversionRate = 0.014; // 1 INR = 0.014 USD
                    double dollars = rupees * conversionRate;
                    String result = String.format("%.2f USD", dollars);
                    editTextText4.setText(result);
                } else {
                    editTextText4.setText("Please enter a valid amount.");
                }
            }
        });

        toggleButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dollar1Str = editTextText2.getText().toString();
                if (!dollar1Str.isEmpty()) {
                    double dollar2 = Double.parseDouble(dollar1Str);
                    double conversionRate = 82.78; // 1 USD = 82.78 INR
                    double rupees1 = dollar2 * conversionRate;
                    String result = String.format("%.2f INR", rupees1);
                    editTextText4.setText(result);
                } else {
                    editTextText4.setText("Please enter a valid amount.");
                }
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView4= (ImageView) findViewById(R.id.imageView4);
                imageView4.setImageResource(R.drawable.graph);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView4= (ImageView) findViewById(R.id.imageView4);
                imageView4.setImageResource(R.drawable.currency);
            }
        });
    }
}
