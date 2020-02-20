package com.farhan.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;


/**
 * Created by Md Farhan Raja on 3/15/2017.
 */

public class AdvanceFrameLayout extends FrameLayout {
    private TypedArray array;
    private int color;
    private float cornerRadius, topLeftCornerRadius, topRightCornerRadius, bottomLeftCornerRadius, bottomRightCornerRadius;
    private boolean allCornerRadius = false;
    private int borderColor;
    private float borderWidth;
    private boolean borderEnable;
    private GradientDrawable drawable;

    public AdvanceFrameLayout(Context context) {
        super(context);
    }

    public AdvanceFrameLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public AdvanceFrameLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

/*    public AdvanceRelativeLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes)
    {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context,attrs);
    }*/

    private void init(Context context, AttributeSet attributeSet) {
        array = context.obtainStyledAttributes(attributeSet, R.styleable.AdvanceFrameLayout);
        color = array.getColor(R.styleable.AdvanceFrameLayout_afl_backgroundColor, getResources().getColor(R.color.colorNone));
        cornerRadius = array.getDimension(R.styleable.AdvanceFrameLayout_afl_cornerRadius, 0.0f);
        allCornerRadius = array.getBoolean(R.styleable.AdvanceFrameLayout_afl_customCornerRadius, false);

        topLeftCornerRadius = array.getDimension(R.styleable.AdvanceFrameLayout_afl_topLeftCornerRadius, 0.0f);
        topRightCornerRadius = array.getDimension(R.styleable.AdvanceFrameLayout_afl_topRightCornerRadius, 0.0f);
        bottomLeftCornerRadius = array.getDimension(R.styleable.AdvanceFrameLayout_afl_bottomLeftCornerRadius, 0.0f);
        bottomRightCornerRadius = array.getDimension(R.styleable.AdvanceFrameLayout_afl_bottomRightCornerRadius, 0.0f);

        borderColor = array.getColor(R.styleable.AdvanceFrameLayout_afl_borderColor, getResources().getColor(R.color.colorNone));
        borderWidth = array.getDimension(R.styleable.AdvanceFrameLayout_afl_borderWidth, 1.0f);
        borderEnable = array.getBoolean(R.styleable.AdvanceFrameLayout_afl_borderEnable, false);

        drawable = new GradientDrawable();

        float[] r = {topLeftCornerRadius, topLeftCornerRadius, topRightCornerRadius, topRightCornerRadius, bottomRightCornerRadius, bottomRightCornerRadius, bottomLeftCornerRadius, bottomLeftCornerRadius};
        if (allCornerRadius) {
            drawable.setCornerRadii(r);
        } else {
            drawable.setCornerRadius(cornerRadius);
        }
        //drawable.setCornerRadius(cornerRadius);
        drawable.setColor(color);
        if (borderEnable) {
            drawable.setStroke((int) borderWidth, borderColor);
        }
        setBackground(drawable);
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
