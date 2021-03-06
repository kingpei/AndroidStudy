package com.kingpei.as.touchevent.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.ListView;

/**
 * Created by Administrator on 2015/2/11.
 */
public class TestGroup extends LinearLayout {

    private static final String TAG = TestGroup.class.getName();

    public TestGroup(Context context) {
        super(context);
    }

    public TestGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TestGroup(Context context, AttributeSet attrs, int defStyleAttr) {
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

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        boolean result = super.onInterceptTouchEvent(ev);

        //        if (ev.getAction() == MotionEvent.ACTION_MOVE){
//            result = true;
//        }
        Log.v(TAG, "onInterceptTouchEvent consumed:" + result);
        Log.v(TAG, "event:" + ev.getAction());
        return result;
    }
}
