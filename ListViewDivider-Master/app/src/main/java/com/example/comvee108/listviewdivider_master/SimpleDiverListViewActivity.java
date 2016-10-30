package com.example.comvee108.listviewdivider_master;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

/**
 * 简单的listView分割线
 */
public class SimpleDiverListViewActivity extends Activity {
    /**
     * listView中的数据
     */
    private String[] names = {"小米", "小陈", "小张", "小赵", "小金", "小赵", "小林", "小红", "小明"};


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smiple_listview_divider);
        ListView listView = (ListView) findViewById(R.id.list_view);
        ListViewDividerAdapter adapter = new ListViewDividerAdapter(this, names);
        listView.setAdapter(adapter);
    }

}
