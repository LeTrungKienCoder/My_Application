package com.example.myapplication.tuan3;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.myapplication.R;


public class Tuan3ListAdapter extends BaseAdapter {

    String countryList[];
    int imgList[];
    LayoutInflater inflater;  //for inflate layout items

    public Tuan3ListAdapter(Context context,String countryList[],int imgList[])
    {
        this.countryList=countryList;
        this.imgList=imgList;
        inflater=(LayoutInflater.from(context));
    }

    @Override
    public int getCount() {
        return countryList.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        view=inflater.inflate(R.layout.activity_tuan3_list_item_main,viewGroup,false);
        ImageView imgCountry=view.findViewById(R.id.img_country);
        TextView txtName=view.findViewById(R.id.txt_name);

        imgCountry.setImageResource(imgList[position]);
        txtName.setText(countryList[position]);

        return view;
    }
}