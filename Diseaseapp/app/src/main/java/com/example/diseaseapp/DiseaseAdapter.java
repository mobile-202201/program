package com.example.diseaseapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class DiseaseAdapter extends BaseAdapter {
    private Context ctx;
    private DiseaseMyData[] data;

    public DiseaseAdapter(Context ctx, DiseaseMyData[] data){
        this.ctx = ctx;
        this.data = data;
    }

    //총 몇개인가 세는거
    @Override
    public int getCount() {
        return data.length;
    }
    // 데이터 보내는거
    @Override
    public Object getItem(int i) {
        return i;
    }
    // 어디에 있는지
    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view ==null){
            LayoutInflater inflater = LayoutInflater.from(ctx);
            view = inflater.inflate(R.layout.customlist,viewGroup, false);
        }
        ImageView image = (ImageView) view.findViewById(R.id.Iv);
        image.setImageResource(data[i].icon);
        TextView tv = (TextView) view.findViewById(R.id.tvname);
        tv.setText(data[i].name);
        TextView tv2 = (TextView) view.findViewById(R.id.tvsource);
        tv2.setText(data[i].source);
        TextView tv3 = (TextView) view.findViewById(R.id.tvlocation);
        tv3.setText(data[i].location);

        return view;
    }
}
