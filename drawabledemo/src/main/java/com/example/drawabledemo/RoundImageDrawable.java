package com.example.drawabledemo;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PixelFormat;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/**
 * Description:
 * Author: qiubing
 * Date: 2017-06-06 16:18
 */
public class RoundImageDrawable extends Drawable {
    private Paint mPaint;
    private Bitmap mBitmap;

    private RectF rectF;

    public RoundImageDrawable(Bitmap bitmap){
        mBitmap = bitmap;
        BitmapShader shader = new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        mPaint = new Paint();
        mPaint.setAntiAlias(true);
        mPaint.setShader(shader);
    }
    @Override
    public void draw(Canvas canvas) {
        canvas.drawRoundRect(rectF,60f,60f,mPaint);
    }

    @Override
    public int getOpacity() {
        return PixelFormat.TRANSLUCENT;
    }

    @Override
    public void setAlpha(int i) {
        mPaint.setAlpha(i);
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        mPaint.setColorFilter(colorFilter);
    }

    @Override
    public int getIntrinsicHeight() {
        return mBitmap.getHeight();
    }

    @Override
    public int getIntrinsicWidth() {
        return mBitmap.getWidth();
    }

    @Override
    public void setBounds(int i, int i1, int i2, int i3) {
        super.setBounds(i, i1, i2, i3);
        rectF = new RectF(i,i1,i2,i3);
    }
}
