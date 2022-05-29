package com.example.diseaseapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.tabs.TabLayout;

public class DiseaseSuduS extends AppCompatActivity {

    private Button button;
    private FragmentPagerAdapter fragmentPagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disease_sudus);

        ViewPager viewPager = findViewById(R.id.viewPager);
        fragmentPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());

        TabLayout tabLayout = findViewById(R.id.tabLayout);
        viewPager.setAdapter(fragmentPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
        button = (Button) findViewById(R.id.btn);
    }
    public void mOnClick(View v){
        switch(v.getId()) {
            case R.id.btn:
                //이 밑에 3줄로 인해 프레그먼트를 붙는걸 바꿀수 있음.동적응용가능.
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.jongno.go.kr/healthMain.do"));
                startActivity(intent);
                break;
//            case R.id.secondfrag:
//                final FragmentTransaction ft2 = getSupportFragmentManager().beginTransaction();
//                ft2.replace(R.id.container, new SecondFragment());
//                ft2.commit();
//                break;
        }
        }

}