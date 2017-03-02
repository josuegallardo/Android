package com.example.mac.gruponfake.views;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;


/**
 * Created by MAC on 1/03/17.
 */

public class TextViewCustom extends TextView {
    public TextViewCustom(Context context) {
        super(context);
        init(context);
    }

    public TextViewCustom(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public TextViewCustom(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context){
        Typeface typeface=Typeface.createFromAsset(context.getAssets(), "fonts/ASMAN.TTF");
        setTypeface(typeface);
    }
}
