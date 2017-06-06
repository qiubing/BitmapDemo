package com.example.drawabledemo;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PixelFormat;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/**
 * Description:
 * Author: qiubing
 * Date: 2017-06-06 16:39
 */
public class CircleImageDrawable extends Drawable {
    private Paint mPaint;
    private int mWidth;
    private Bitmap mBitmap;

    public CircleImageDrawable(Bitmap bitmap){
        mBitmap = bitmap;
        BitmapShader shader = new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        mPaint = new Paint();
        mPaint.setAntiAlias(true);
        mPaint.setShader(shader);
        mWidth = Math.min(bitmap.getWidth(),bitmap.getHeight());
    }


    @Override
    public void draw(Canvas canvas) {
        canvas.drawCircle(mWidth/2,mWidth/2,mWidth/2,mPaint);
    }

    @Override
    public int getIntrinsicWidth() {
        return mWidth;
    }

    @Override
    public int getIntrinsicHeight() {
        return mWidth;
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
}
