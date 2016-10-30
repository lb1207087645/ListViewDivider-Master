/**
 *
 */
package com.example.comvee108.listviewdivider_master;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * listView分割线的adapter
 */
public class ListViewDividerAdapter extends BaseAdapter {
    private Context context;
    private String[] names;
    public int index;

    public ListViewDividerAdapter(Context context, String[] names) {
        this.context = context;
        this.names = names;
    }

    @Override
    public int getCount() {
        return null != names ? names.length : null;
    }

    @Override
    public Object getItem(int arg0) {
        return null != names ? names[arg0] : null;
    }

    @Override
    public long getItemId(int arg0) {
        return arg0;
    }

    @Override
    public View getView(int arg0, View arg1, ViewGroup arg2) {
        ViewHolder viewHolder = null;
        if (arg1 == null) {
            arg1 = LayoutInflater.from(context).inflate(R.layout.listview_item,
                    null);
            viewHolder = new ViewHolder();
            viewHolder.tvName = (TextView) arg1.findViewById(R.id.tv_name);
            arg1.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) arg1.getTag();
        }

        viewHolder.tvName.setText(names[arg0]);
        return arg1;
    }

    class ViewHolder {
        TextView tvName;//listView item文本
    }
}
