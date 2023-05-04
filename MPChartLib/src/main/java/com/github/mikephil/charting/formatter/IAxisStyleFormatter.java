package com.github.mikephil.charting.formatter;

import android.graphics.Typeface;

import com.github.mikephil.charting.components.AxisBase;

public interface IAxisStyleFormatter {
    /**
     * Called when a value from an axis is to be formatted visually ( typeface, textSize, color, etc. ).
     * before being drawn. For performance reasons, avoid excessive calculations
     * and memory allocations inside this method.
     *
     * @param value the value to be formatted
     * @param axis  the axis the value belongs to
     * @return
     */
    Typeface getTypefaceForAxisValue(float value, AxisBase axis);

    /**
     * Called when a value from an axis is to be formatted visually ( typeface, textSize, color, etc. ).
     * before being drawn. For performance reasons, avoid excessive calculations
     * and memory allocations inside this method.
     *
     * @param value the value to be formatted
     * @param axis  the axis the value belongs to
     * @return
     */
    int getTextColorForAxisValue(float value, AxisBase axis);
}

