package com.example.diseaseapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    public ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                return FragSuduSA.newInstance("","");
            case 1:
                return FragSuduSB.newInstance("","");
            case 2:
                return FragSuduSC.newInstance("","");
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
