package com.example.listdetail;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class Disease1Corona extends AppCompatActivity {
private int Deletenumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disease1_corona);
    }
    @Override
    //메뉴 바  생성
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(Menu.NONE,1,Menu.NONE,"관련영상보기");
        menu.add(Menu.NONE,2,Menu.NONE,"삭제하기");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case 1:
                Intent intent = new Intent(getApplicationContext(), Disease1CoronaVideo.class);
                startActivity(intent);
                return true;
            case 2:
                onDestroy();
                Intent intentN = new Intent(getApplicationContext(), MainActivity.class);
                Deletenumber= 0;
                intentN.putExtra("Deletenumber",Deletenumber);
                startActivity(intentN);
        }
        return super.onOptionsItemSelected(item);
    }

}
