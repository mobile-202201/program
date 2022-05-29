package com.example.diseaseapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerAdapter2 extends FragmentPagerAdapter {
    public ViewPagerAdapter2(@NonNull FragmentManager fm) {
        super(fm);
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                return FragSuduGA.newInstance("","");
            case 1:
                return FragSuduGB.newInstance("","");
            case 2:
                return FragSuduGC.newInstance("","");
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "질병 정보";
            case 1:
                return "예방접종센터 정보";
            case 2:
                return "예방 영상";
            default:
                return null;
        }
    }
}
