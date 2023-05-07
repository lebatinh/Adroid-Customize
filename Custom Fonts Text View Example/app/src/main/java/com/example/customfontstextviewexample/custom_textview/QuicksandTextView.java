package com.example.customfontstextviewexample.custom_textview;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

public class QuicksandTextView extends AppCompatTextView {
    public QuicksandTextView(Context context) {
        super(context);
        setFontsTextView();
    }
    public QuicksandTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setFontsTextView();
    }
    public QuicksandTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setFontsTextView();
    }
    private void setFontsTextView() {
        Typeface typeface = Utils.getQuicksandTypeface(getContext());
        setTypeface(typeface);
    }
}
