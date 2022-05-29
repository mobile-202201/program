package com.example.diseaseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

//main 이 diseaselist라고생각
public class MainActivity extends AppCompatActivity {

    private DiseaseMyData[] data = {
            new DiseaseMyData(R.raw.sudusp,"수두","종로구 보건소 관리자","서울특별시 종로구"),
            new DiseaseMyData(R.raw.sudugp,"수두","과천시 보건소 관리자","경기도 과천시 중앙동"),
            new DiseaseMyData(R.drawable.ic_launcher_background,"수두","김해시 보건소 관리자","경상남도 김해시 외동")
    };

    private ListView mList;
    private DiseaseAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mList = (ListView) findViewById(R.id.list);
        mAdapter = new DiseaseAdapter(this,data);
        mList.setAdapter(mAdapter);


        mList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                switch (data[position].name){
                    case "수두":
                        if(data[position].source.equals("종로구 보건소 관리자")){
                            Intent intent = new Intent(getApplicationContext(), DiseaseSuduS.class);
                            startActivity(intent);
                        }else if(data[position].source.equals("과천시 보건소 관리자")){
                            Intent intent = new Intent(getApplicationContext(), DiseaseSuduG.class);
                            startActivity(intent);
                        }
                }

            }
        });

    }
}