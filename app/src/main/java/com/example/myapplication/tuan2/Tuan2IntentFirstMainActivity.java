package com.example.myapplication.tuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;

import com.example.myapplication.R;

public class Tuan2IntentFirstMainActivity extends AppCompatActivity {

    private EditText num1EditText, num2EditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan2_intent_first_main);

        num1EditText = findViewById(R.id.number1EditText);
        num2EditText = findViewById(R.id.number2EditText);

        Button calcButton = findViewById(R.id.calcButton);
        calcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(num1EditText.getText().toString());
                int num2 = Integer.parseInt(num2EditText.getText().toString());

                Intent intent = new Intent(Tuan2IntentFirstMainActivity.this, Tuan2IntentSecondMainActivity.class);
                intent.putExtra("number1", num1);
                intent.putExtra("number2", num2);
                startActivity(intent);
            }
        });
    }
}