package com.example.comvee108.listviewdivider_master;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_simple_listview_divider).setOnClickListener(mOnClickListener);
        findViewById(R.id.btn_listview_margin_left).setOnClickListener(mOnClickListener);
        findViewById(R.id.btn_listview_dash).setOnClickListener(mOnClickListener);

    }

    private View.OnClickListener mOnClickListener = new View.OnClickListener() {


        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.btn_simple_listview_divider://简单的自定义高度，颜色的listView分割线
                    Intent intent = new Intent(MainActivity.this, SimpleDiverListViewActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn_listview_margin_left://自定义距离左边一点距离的listView分割线
                    Intent intent2 = new Intent(MainActivity.this, MarginLeftActivity.class);
                    startActivity(intent2);

                    break;
                case R.id.btn_listview_dash://自定义虚线的listView分割线
                    Intent intent3 = new Intent(MainActivity.this, DashActivity.class);
                    startActivity(intent3);
                    break;
            }
        }
    };
}
