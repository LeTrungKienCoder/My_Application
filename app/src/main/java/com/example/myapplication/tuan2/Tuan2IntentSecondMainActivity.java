package com.example.myapplication.tuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;
import android.widget.Button;
import com.example.myapplication.R;

public class Tuan2IntentSecondMainActivity extends AppCompatActivity {

    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan2_intent_second_main);

        resultTextView = findViewById(R.id.resultTextView);
        Button backButton = findViewById(R.id.backButton);

        Intent intent = getIntent();
        int num1 = intent.getIntExtra("num1", 0);
        int num2 = intent.getIntExtra("num2", 0);
        int sum = num1 + num2;

        resultTextView.setText("Tổng: " + sum);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create an Intent to go back to MainActivity
                Intent intent = new Intent(Tuan2IntentSecondMainActivity.this, Tuan2IntentFirstMainActivity.class);
                startActivity(intent);
            }
        });
    }
}