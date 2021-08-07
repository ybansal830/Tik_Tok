package com.myfirst.tiktok;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    private ViewPager2 viewPager;
    private ArrayList<String> urls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        viewPager = findViewById(R.id.viewPager);
        setList();
        setPager();
    }

    private void setList() {
        urls = new ArrayList<>();
        for(int i=0;i<10;i++){
            urls.add("https://assets.mixkit.co/videos/preview/mixkit-girl-in-neon-sign-1232-large.mp4");
            urls.add("https://assets.mixkit.co/videos/preview/mixkit-man-under-multicolored-lights-1237-large.mp4");
            urls.add("https://assets.mixkit.co/videos/preview/mixkit-woman-decorates-christmas-tree-at-home-2721-large.mp4");
            urls.add("https://assets.mixkit.co/videos/preview/mixkit-man-runs-past-ground-level-shot-32809-large.mp4");
            urls.add("https://assets.mixkit.co/videos/preview/mixkit-woman-posing-for-the-camera-in-the-middle-of-a-34404-large.mp4");
        }
    }

    private void setPager() {
        Adapter adapter = new Adapter(urls);
        viewPager.setAdapter(adapter);
    }
}