package com.example.duan1.customview;

import android.content.Context;

import androidx.annotation.NonNull;

import com.example.duan1.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class FoattingButton extends FloatingActionButton {
    public FoattingButton(@NonNull Context context) {
        super(context);
    }

    @Override
    public void setBackgroundColor(int color) {
        super.setBackgroundColor(getResources().getColor(R.color.fb_color));
    }
}
