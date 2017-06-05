package com.example.bitmapdemo;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

import java.util.ArrayList;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setContentView(new CustomView(this));
    }

    class CustomView extends View{

        Paint paint;
        private ArrayList<PointF> graphics = new ArrayList<PointF>();

        public CustomView(Context context) {
            super(context);
            paint = new Paint();
            paint.setColor(Color.GREEN);
            paint.setStrokeJoin(Paint.Join.ROUND);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeWidth(3);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            graphics.add(new PointF(motionEvent.getX(),motionEvent.getY()));
            invalidate();
            return true;
        }

        @Override
        protected void onDraw(Canvas canvas) {
            //绘制圆
            // canvas.drawCircle(100,100,90,paint);
            //绘制弧线区域
            /*RectF rect = new RectF(0,0,100,100);
            canvas.drawArc(rect,//弧线所使用的矩形区域大小
                    0,//开始角度
                    90,//扫过的角度
                    true,//是否使用中心
                    paint);*/
            //canvas.drawColor(Color.BLUE);
            //画线
            //canvas.drawLine(10,10,100,100,paint);

            //画椭圆
            // 定义一个矩形区域
            /*RectF oval = new RectF(0,0,200,300);
            // 在矩形区域内画椭圆
            canvas.drawOval(oval,paint);*/
            //按照既定点，绘制文本内容
            /*canvas.drawPosText("helloworld",new float[]{
                    10,10,
                    20,20,
                    30,30,
                    40,40,
                    50,50,
                    60,60,
                    70,70,
                    80,80,
                    90,90,
                    100,100
            },paint);*/

            //绘制矩形区域
            /*RectF rect = new RectF(50,50,200,200);
            canvas.drawRect(rect,paint);*/

            //绘制圆角矩阵
            /*RectF rect = new RectF(50,50,200,200);
            canvas.drawRoundRect(rect,
                    30,//x轴的半径
                    30,//y轴的半径
                    paint);*/

            //绘制路径
            /*Path path = new Path();
            path.moveTo(10,10);
            path.lineTo(50,60);
            path.lineTo(200,80);
            path.lineTo(10,10);
            //canvas.drawPath(path,paint);
            canvas.drawTextOnPath("hello world",path,10,10,paint);*/

            //位置转换方法
            /*paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            canvas.translate(canvas.getWidth()/2, 200); //将位置移动画纸的坐标点:150,150
            canvas.drawCircle(0, 0, 100, paint); //画圆圈

            //使用path绘制路径文字
            canvas.save();
            canvas.translate(-75, -75);
            Path path = new Path();
            path.addArc(new RectF(0,0,150,150), -180, 180);
            Paint citePaint = new Paint(paint);
            citePaint.setTextSize(14);
            citePaint.setStrokeWidth(1);
            canvas.drawTextOnPath("http://www.android777.com", path, 28, 0, citePaint);
            canvas.restore();

            Paint tmpPaint = new Paint(paint); //小刻度画笔对象
            tmpPaint.setStrokeWidth(1);

            float  y=100;
            int count = 60; //总刻度数

            for(int i=0 ; i <count ; i++){
                if(i%5 == 0){
                    canvas.drawLine(0f, y, 0, y+12f, paint);
                    canvas.drawText(String.valueOf(i/5+1), -4f, y+25f, tmpPaint);

                }else{
                    canvas.drawLine(0f, y, 0f, y +5f, tmpPaint);
                }
                canvas.rotate(360/count,0f,0f); //旋转画纸
            }

            //绘制指针
            tmpPaint.setColor(Color.GRAY);
            tmpPaint.setStrokeWidth(4);
            canvas.drawCircle(0, 0, 7, tmpPaint);
            tmpPaint.setStyle(Paint.Style.FILL);
            tmpPaint.setColor(Color.YELLOW);
            canvas.drawCircle(0, 0, 5, tmpPaint);
            canvas.drawLine(0, 10, 0, -65, paint);*/
            for (PointF point : graphics){
                canvas.drawPoint(point.x,point.y,paint);
            }
        }
    }
}
