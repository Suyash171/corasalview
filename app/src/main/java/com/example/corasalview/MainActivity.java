package com.example.corasalview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private KKViewPager mPager;
    boolean toggle = true;
    protected static final String[] CONTENT1 = new String[]{"Pager Carousel 1", "Pager Carousel 2",
            "Pager Carousel 2", "Pager Carousel 4"};
    protected static final String[] CONTENT2 = new String[]{"Pager Carousel", "Title 2",
            "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initKKViewPager();
    }


    private void initKKViewPager() {
        mPager = (KKViewPager) findViewById(R.id.kk_pager);
        mPager.setAdapter(new TestFragmentAdapter(getSupportFragmentManager(),
                MainActivity.this, CONTENT2));
        mPager.setAnimationEnabled(true);
        mPager.setFadeEnabled(true);
        mPager.setFadeFactor(0.6f);


    }
}