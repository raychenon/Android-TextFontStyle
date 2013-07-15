package com.raychenon;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * User: raychenon
 * Date: 15/7/13
 * Time: 9:00 PM
 */
public class TextViewStyle extends TextView {

    public TextViewStyle(Context context) {
        super(context);
    }

    public TextViewStyle(Context context, AttributeSet attrs) {
        super(context, attrs);

        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.com_textfontstyle_fontstyle);
        CharSequence s = a.getString(R.styleable.com_textfontstyle_fontstyle_typeFace);
        if (s != null) {
            Typeface typeface = Typeface.createFromAsset(context.getAssets(), s.toString());
            this.setTypeface(typeface);

        }
        a.recycle();
    }

    public TextViewStyle(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

}
