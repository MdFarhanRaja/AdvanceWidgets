package com.farhan.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.widget.AppCompatEditText;
import android.util.AttributeSet;


/**
 * Created by Md Farhan Raja on 3/8/2017.
 */

public class AdvanceEditText extends AppCompatEditText {
    private TypedArray array;
    private int color;
    private float cornerRadius, topLeftCornerRadius, topRightCornerRadius, bottomLeftCornerRadius, bottomRightCornerRadius;
    private int borderColor;
    private float borderWidth;
    private boolean borderEnable;
    private String path;
    private boolean allCornerRadius = false;
    private GradientDrawable drawable;

    public AdvanceEditText(Context context) {
        super(context);
    }

    public AdvanceEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public AdvanceEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attributeSet) {
        array = context.obtainStyledAttributes(attributeSet, R.styleable.AdvanceEditText);
        color = array.getColor(R.styleable.AdvanceEditText_aet_backgroundColor, getResources().getColor(R.color.colorNone));
        allCornerRadius = array.getBoolean(R.styleable.AdvanceEditText_aet_customCornerRadius, false);
        cornerRadius = array.getDimension(R.styleable.AdvanceEditText_aet_cornerRadius, 0.0f);

        topLeftCornerRadius = array.getDimension(R.styleable.AdvanceEditText_aet_topLeftCornerRadius, 0.0f);
        topRightCornerRadius = array.getDimension(R.styleable.AdvanceEditText_aet_topRightCornerRadius, 0.0f);
        bottomLeftCornerRadius = array.getDimension(R.styleable.AdvanceEditText_aet_bottomLeftCornerRadius, 0.0f);
        bottomRightCornerRadius = array.getDimension(R.styleable.AdvanceEditText_aet_bottomRightCornerRadius, 0.0f);

        borderColor = array.getColor(R.styleable.AdvanceEditText_aet_borderColor, getResources().getColor(R.color.colorNone));
        borderWidth = array.getDimension(R.styleable.AdvanceEditText_aet_borderWidth, 1.0f);
        borderEnable = array.getBoolean(R.styleable.AdvanceEditText_aet_borderEnable, false);

        path = array.getString(R.styleable.AdvanceEditText_aet_fontPath);
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
}
