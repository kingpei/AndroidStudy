package com.kingpei.as.touchevent.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.Button;

/**
 * Created by Administrator on 2015/2/11.
 */
public class TestView extends Button {

    private static final String TAG = TestView.class.getName();

    public TestView(Context context) {
        super(context);
    }

    public TestView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TestView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
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

}
