package com.example.myapplication.tuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.widget.Toast;

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
                String num1Str = num1EditText.getText().toString();
                String num2Str = num2EditText.getText().toString();

                if (num1Str.isEmpty() || num2Str.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Please enter both numbers", Toast.LENGTH_SHORT).show();
                    return;
                }

                int num1 = Integer.parseInt(num1Str);
                int num2 = Integer.parseInt(num2Str);

                Intent intent = new Intent(Tuan2IntentFirstMainActivity.this, Tuan2IntentSecondMainActivity.class);
                intent.putExtra("num1", num1);
                intent.putExtra("num2", num2);
                startActivity(intent);
            }
        });
    }

}