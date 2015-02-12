package com.kingpei.as.touchevent;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;

import com.kingpei.as.touchevent.view.GeofencePointAdapter;
import com.kingpei.as.touchevent.view.SampleDataManager;
import com.kingpei.as.touchevent.view.TestAdapter;


public class MainActivity extends Activity implements AdapterView.OnItemClickListener{

    private static final String TAG = MainActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        GeofencePointAdapter adapter = new GeofencePointAdapter(this);
//        adapter.setGeoFencePoints(SampleDataManager.getXmGeoFencePoints());
//        TestAdapter adapter = new TestAdapter(this);
//        adapter.setTest();
//        getListView().setAdapter(adapter);
//        getListView().setOnItemClickListener(this);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        boolean result = super.onTouchEvent(event);
        Log.v(TAG, "onTouchEvent consumed: " + result);
        Log.v(TAG, "event:" + event.getAction());
        return result;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        boolean result = super.dispatchTouchEvent(ev);
        Log.v(TAG, "dispatchTouchEvent consumed:" + result);
        Log.v(TAG, "event:" + ev.getAction());
        return result;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Log.v("onItemClick", "" + position);
    }
}
