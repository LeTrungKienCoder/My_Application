package com.example.myapplication.tuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.ListView;

import com.example.myapplication.R;

import android.widget.AdapterView;

import android.view.View;

import android.widget.Toast;

public class Tuan3ListViewCustomMainActivity extends AppCompatActivity {

    ListView customList;
    String countryList[]={"Viet Nam ","India","China","Australia","America","New Zealand","Portugal"};
    int imgList[]={R.drawable.vn,R.drawable.india,R.drawable.china,R.drawable.australia,R.drawable.america,R.drawable.new_zealand,R.drawable.portugle};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan3_list_view_custom_main);

        customList=findViewById(R.id.list);
        Tuan3ListAdapter adapter=new Tuan3ListAdapter(Tuan3ListViewCustomMainActivity.this,countryList,imgList);
        customList.setAdapter(adapter);

        customList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Toast.makeText(Tuan3ListViewCustomMainActivity.this, countryList[position], Toast.LENGTH_SHORT).show();
            }
        });


    }
}