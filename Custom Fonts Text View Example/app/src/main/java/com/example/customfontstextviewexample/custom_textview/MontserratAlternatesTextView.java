package com.example.customfontstextviewexample.custom_textview;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

public class MontserratAlternatesTextView extends AppCompatTextView {
    public MontserratAlternatesTextView(Context context) {
        super(context);
        setFontsTextView();
    }
    public MontserratAlternatesTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setFontsTextView();
    }
    public MontserratAlternatesTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setFontsTextView();
    }
    private void setFontsTextView() {
        Typeface typeface = Utils.getMontserratAlternatesTypeface(getContext());
        setTypeface(typeface);
    }
}
