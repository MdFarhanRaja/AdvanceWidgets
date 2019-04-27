package com.farhan.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.RelativeLayout;


/**
 * Created by Md Farhan Raja on 3/15/2017.
 */

public class AdvanceRelativeLayout extends RelativeLayout
{
    private TypedArray array;
    private int color;
    private float cornerRadius, topLeftCornerRadius, topRightCornerRadius, bottomLeftCornerRadius, bottomRightCornerRadius;
    private boolean allCornerRadius = false;
    private int borderColor;
    private float borderWidth;
    private boolean borderEnable;
    private GradientDrawable drawable;

    public AdvanceRelativeLayout(Context context)
    {
        super(context);
    }

    public AdvanceRelativeLayout(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        init(context,attrs);
    }

    public AdvanceRelativeLayout(Context context, AttributeSet attrs, int defStyleAttr)
    {
        super(context, attrs, defStyleAttr);
        init(context,attrs);
    }

/*    public AdvanceRelativeLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes)
    {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context,attrs);
    }*/

    private void init(Context context, AttributeSet attributeSet)
    {
        array=context.obtainStyledAttributes(attributeSet, R.styleable.AdvanceRelativeLayout);
        color=array.getColor(R.styleable.AdvanceRelativeLayout_arl_backgroundColor,getResources().getColor(R.color.colorNone));
        cornerRadius=array.getDimension(R.styleable.AdvanceRelativeLayout_arl_cornerRadius,0.0f);
        allCornerRadius = array.getBoolean(R.styleable.AdvanceRelativeLayout_arl_customCornerRadius, false);

        topLeftCornerRadius = array.getDimension(R.styleable.AdvanceRelativeLayout_arl_topLeftCornerRadius, 0.0f);
        topRightCornerRadius = array.getDimension(R.styleable.AdvanceRelativeLayout_arl_topRightCornerRadius, 0.0f);
        bottomLeftCornerRadius = array.getDimension(R.styleable.AdvanceRelativeLayout_arl_bottomLeftCornerRadius, 0.0f);
        bottomRightCornerRadius = array.getDimension(R.styleable.AdvanceRelativeLayout_arl_bottomRightCornerRadius, 0.0f);

        borderColor=array.getColor(R.styleable.AdvanceRelativeLayout_arl_borderColor,getResources().getColor(R.color.colorNone));
        borderWidth=array.getDimension(R.styleable.AdvanceRelativeLayout_arl_borderWidth,1.0f);
        borderEnable=array.getBoolean(R.styleable.AdvanceRelativeLayout_arl_borderEnable,false);

        drawable=new GradientDrawable();
        float[] r = {topLeftCornerRadius, topLeftCornerRadius, topRightCornerRadius, topRightCornerRadius, bottomRightCornerRadius, bottomRightCornerRadius, bottomLeftCornerRadius, bottomLeftCornerRadius};
        if (allCornerRadius) {
            drawable.setCornerRadii(r);
        } else {
            drawable.setCornerRadius(cornerRadius);
        }
        //drawable.setCornerRadius(cornerRadius);
        drawable.setColor(color);
        if(borderEnable)
        {
            drawable.setStroke((int) borderWidth,borderColor);
        }
        setBackground(drawable);
    }

    public void setBackgroundColor(int colorCode) {
        drawable.setColor(colorCode);
        setBackground(drawable);
    }
}
