package com.kingpei.as.badger.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;

import com.kingpei.as.androidstudy.R;

/**
 * Created by Administrator on 2015/2/11.
 */
public class BadgerView extends TextView{

    private String badgerText;

    private boolean showBadger;

    private int badgerTextSize;

    private int badgerWidth;

    private int badgerHeight;


    private Bitmap bitmap;

    private final int badgerPaddingHorizontal = 2;

    public BadgerView(Context context) {
        this(context, null);
    }

    public BadgerView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public BadgerView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public String getBadgerText() {
        return badgerText;
    }

    public void setBadgerText(String badgerText) {
        this.badgerText = badgerText;
    }

    public boolean isShowBadger() {
        return showBadger;
    }

    public void setShowBadger(boolean showBadger) {
        this.showBadger = showBadger;
    }

    public void init(){
       Drawable drawable = getResources().getDrawable(R.drawable.attent);
       badgerWidth = drawable.getIntrinsicWidth();
       badgerHeight = drawable.getIntrinsicHeight();

        bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.attent);
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {

        super.onLayout(changed, left + 200, top, right + 200, bottom);

    }



    @Override
    public void layout(int l, int t, int r, int b) {
        //View是根据mLeft等来layout自身的，TextView没有对layout方法进行处理。
        super.layout(l, t, r, b);

        setLeft(l + 200);
        setRight(r + 200);
    }



    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.save();
        canvas.translate(getWidth() - badgerPaddingHorizontal - badgerWidth, (badgerHeight-getHeight())/2);
        canvas.drawBitmap(bitmap, 0, 0, new Paint());
        canvas.restore();
    }
}
