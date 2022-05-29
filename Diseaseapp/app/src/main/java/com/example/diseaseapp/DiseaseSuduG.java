package com.example.diseaseapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class DiseaseSuduG extends AppCompatActivity {

    private Button button;
    private FragmentPagerAdapter fragmentPagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disease_sudug);

        ViewPager viewPager = findViewById(R.id.viewPager1);
        fragmentPagerAdapter = new ViewPagerAdapter2(getSupportFragmentManager());

        TabLayout tabLayout = findViewById(R.id.tabLayout1);
        viewPager.setAdapter(fragmentPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
        button = (Button) findViewById(R.id.btn1);
    }
    public void mOnClick(View v){
        switch(v.getId()) {
            case R.id.btn1:
                //이 밑에 3줄로 인해 프레그먼트를 붙는걸 바꿀수 있음.동적응용가능.
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.gccity.go.kr/ghc/main.do"));
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