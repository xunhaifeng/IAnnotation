package com.xunhaifeng.annotationdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.xunhaifeng.apt_annotation.BindView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @BindView(R.id.tv_content)
    public TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
//        MainActivityViewBinding.bind(this);
        Log.v(TAG, "onCreate: v");
        Log.d(TAG, "onCreate: d");
        Log.i(TAG, "onCreate: i");
        Log.w(TAG, "onCreate: w");
        Log.e(TAG, "onCreate: e");
        textView.setText("北京第三区交通委提醒你，\n 道路千万条，\n安全第一条，\n行车不规范\n亲人泪两行");
    }
}
