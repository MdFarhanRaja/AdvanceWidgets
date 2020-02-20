package com.farhan.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

/**
 * Created by Md Farhan Raja on 3/8/2017.
 */

public class AdvanceTextView extends AppCompatTextView {
    private TypedArray array;
    private int color;
    private float cornerRadius, topLeftCornerRadius, topRightCornerRadius, bottomLeftCornerRadius, bottomRightCornerRadius;
    private int borderColor;
    private float borderWidth;
    private boolean borderEnable;
    private boolean allCornerRadius = true;
    private String path;
    private GradientDrawable drawable;

    public AdvanceTextView(Context context) {
        super(context);
    }

    public AdvanceTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initTextView(context, attrs);
    }

    public AdvanceTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initTextView(context, attrs);
    }

    private void initTextView(Context context, AttributeSet attrs) {
        array = context.obtainStyledAttributes(attrs, R.styleable.AdvanceTextView);
        color = array.getColor(R.styleable.AdvanceTextView_atv_backgroundColor, getResources().getColor(R.color.colorNone));
        allCornerRadius = array.getBoolean(R.styleable.AdvanceTextView_atv_customCornerRadius, false);
        cornerRadius = array.getDimension(R.styleable.AdvanceTextView_atv_cornerRadius, 0.0f);
        topLeftCornerRadius = array.getDimension(R.styleable.AdvanceTextView_atv_topLeftCornerRadius, 0.0f);
        topRightCornerRadius = array.getDimension(R.styleable.AdvanceTextView_atv_topRightCornerRadius, 0.0f);
        bottomLeftCornerRadius = array.getDimension(R.styleable.AdvanceTextView_atv_bottomLeftCornerRadius, 0.0f);
        bottomRightCornerRadius = array.getDimension(R.styleable.AdvanceTextView_atv_bottomRightCornerRadius, 0.0f);
        borderColor = array.getColor(R.styleable.AdvanceTextView_atv_borderColor, getResources().getColor(R.color.colorNone));
        borderWidth = array.getDimension(R.styleable.AdvanceTextView_atv_borderWidth, 1.0f);
        borderEnable = array.getBoolean(R.styleable.AdvanceTextView_atv_borderEnable, false);
        path = array.getString(R.styleable.AdvanceTextView_atv_fontPath);
        drawable = new GradientDrawable();
        float[] r = {topLeftCornerRadius, topLeftCornerRadius, topRightCornerRadius, topRightCornerRadius, bottomRightCornerRadius, bottomRightCornerRadius, bottomLeftCornerRadius, bottomLeftCornerRadius};
        if (allCornerRadius) {
            drawable.setCornerRadii(r);
        } else {
            drawable.setCornerRadius(cornerRadius);
        }
        drawable.setColor(color);
        if (borderEnable) {
            drawable.setStroke((int) borderWidth, borderColor);
        }
        setBackground(drawable);
        if (path != null) {
            if (!isInEditMode()) {
                Typeface t = Typeface.createFromAsset(context.getAssets(), path);
                setTypeface(t);
            }
        }
    }

    public void setBackgroundColor(int colorCode) {
        drawable.setColor(colorCode);
        setBackground(drawable);
    }

    public void setBorderColor(int colorCode) {
        if(borderEnable)
        {
            drawable.setStroke((int) borderWidth,colorCode);
            setBackground(drawable);
        }
    }

    public void setBorderColor(int borderWidth,int colorCode) {
        if(borderEnable)
        {
            drawable.setStroke(borderWidth,colorCode);
            setBackground(drawable);
        }
    }
}
