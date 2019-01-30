package com.xunhaifeng.annotationdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.xunhaifeng.apt_annotation.BindView;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.tv_content)
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
