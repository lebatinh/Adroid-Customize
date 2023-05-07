package com.example.bi9tablayoutviewpagerfragment;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.material.tabs.TabLayout;

public class CustomTabLayout extends TabLayout {
    public CustomTabLayout(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
    public CustomTabLayout(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }
    public CustomTabLayout(@NonNull Context context) {
        super(context);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        ViewGroup tabLayout = (ViewGroup) getChildAt(0);
        int childCount = tabLayout.getChildCount();

        if(childCount != 0) {
            DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
            //chia độ rộng bằng kích thước màn hình thực tế chia cho số tab
            int tabMinWidth = displayMetrics.widthPixels / childCount;

            for (int i = 0 ;  i < childCount; ++i){
                tabLayout.getChildAt(i).setMinimumWidth(tabMinWidth);
            }
        }

        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }
}
