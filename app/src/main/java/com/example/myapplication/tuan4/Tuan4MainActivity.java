package com.example.myapplication.tuan4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.myapplication.R;

public class Tuan4MainActivity extends AppCompatActivity {

    Button btnGetData;

    TextView TvKQ;

    Context context=this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan4_main);
        Tuan4VolleyFn volleyFn=new Tuan4VolleyFn();
        TvKQ=findViewById(R.id.tuan4TvQK);
        btnGetData=findViewById(R.id.tuan4Btn);
        btnGetData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                volleyFn.getJsonArrayOfObject(context,TvKQ);
            }
        });


    }
}