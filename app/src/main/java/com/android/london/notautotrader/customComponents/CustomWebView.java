/**
 * TODO
 */

package com.android.london.notautotrader.customComponents;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebView;

public class CustomWebView extends WebView {

    /**
     * Creates instance of CustomWebView using given context
     * @param context: Given context
     */
    public CustomWebView(Context context) {
        this(context, null);
    }

    /**
     * Creates instance of CustomWebView using given context and attribute set
     * @param context: Given context
     * @param attrs: Given attribute set
     */
    public CustomWebView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    /**
     * Creates instance of CustomWebView using given context, attribute set, and definition style
     * @param context: TODO
     * @param attrs: TODO
     * @param defStyle: TODO
     */
    public CustomWebView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public boolean onCheckIsTextEditor()
    {
        return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev)
    {
        switch (ev.getAction())
        {
            case MotionEvent.ACTION_DOWN:
            case MotionEvent.ACTION_UP:
                if (!hasFocus()){
                    requestFocus();
                }
                break;
        }

        return super.onTouchEvent(ev);
    }


}