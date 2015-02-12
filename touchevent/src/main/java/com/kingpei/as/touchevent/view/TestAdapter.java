package com.kingpei.as.touchevent.view;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.kingpei.as.touchevent.R;

import java.util.ArrayList;

/**
 * Created by Administrator on 2015/2/11.
 */
public class TestAdapter extends BaseAdapter {

    private Context context;

    private ArrayList<String> test = new ArrayList<String>();

    public TestAdapter(Context context){
        this.context = context;

    }

    public void setTest(){
        test.add("hello");
//        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
//        Log.v("cao", "" + test.size());
        return  test.size();
    }

    @Override
    public Object getItem(int position) {
        return test.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.item_test, null);
        }

        TextView btn = ViewHolder.get(convertView, R.id.test_btn);

//        final String str = test.get(position);
//        btn.setText(str);

        return convertView;
    }
}
