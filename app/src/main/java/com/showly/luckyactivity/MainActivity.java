package com.showly.luckyactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.showly.luckyactivity.view.LuckyView;

public class MainActivity extends AppCompatActivity {

    private LuckyView luckyView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initData();
        initListener();
    }

    private void initView() {
        luckyView = findViewById(R.id.lucky_view);
    }

    private void initData() {

    }

    private void initListener() {
        luckyView.setLuckAnimationEndListener(new LuckyView.OnLuckAnimationEndListener() {
            @Override
            public void onLuckAnimationEnd(int pos, String msg) {
                Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
