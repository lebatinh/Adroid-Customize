package com.example.customfontstextviewexample.custom_textview;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

public class PacificoTextView extends AppCompatTextView {
    public PacificoTextView(Context context) {
        super(context);
        setFontsTextView();
    }
    public PacificoTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setFontsTextView();
    }
    public PacificoTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setFontsTextView();
    }
    private void setFontsTextView() {
        Typeface typeface = Utils.getPacificoTypeface(getContext());
        setTypeface(typeface);
    }
}
