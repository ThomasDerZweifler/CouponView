package com.veyron.www.couponview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.Arrays;
/**
 * Created by Veyron on 2017/2/20.
 * Function：主页面，加载视图
 */
public class MainActivity extends AppCompatActivity {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.list);
        BaseAdapter arrayAdapter = new ArrayAdapter(this,R.layout.item_list,R.id.name,
                Arrays.asList("优惠劵","优惠劵","优惠劵","优惠劵","优惠劵"));
        listView.setAdapter(arrayAdapter);
    }
}
