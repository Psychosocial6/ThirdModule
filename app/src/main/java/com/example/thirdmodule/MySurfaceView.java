package com.example.thirdmodule;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class MySurfaceView extends SurfaceView implements SurfaceHolder.Callback {
    float x, y;
    static Paint myPaint;
    Path myPath;
    SurfaceHolder holder;
    MyThread myThread;
    static Integer mySize= new Integer(30);
    static int myColor = Color.RED;
    ArrayList<Path> path_list = new ArrayList<>();
    static ArrayList<Paint> paint_list = new ArrayList<>();
    boolean work = true;

    public MySurfaceView(Context context) {
        super(context);
        holder = getHolder();
        holder.addCallback(this);
    }


    @Override
    public void surfaceCreated(@NonNull SurfaceHolder surfaceHolder) {
        myThread = new MyThread();
        myThread.start();
        myPaint = new Paint();
        myPaint.setAntiAlias(true);
        myPaint.setStrokeWidth(mySize);
        myPaint.setStyle(Paint.Style.STROKE);
        myPaint.setStrokeJoin(Paint.Join.ROUND);
        myPaint.setStrokeCap(Paint.Cap.ROUND);
        myPaint.setColor(myColor);
    }

    @Override
    public void surfaceChanged(@NonNull SurfaceHolder surfaceHolder, int i, int i1, int i2) {
    }

    @Override
    public void surfaceDestroyed(@NonNull SurfaceHolder surfaceHolder) {
        work = false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        x = event.getX();
        y = event.getY();
        switch (event.getActionMasked()) {
            case MotionEvent.ACTION_DOWN:
                myPath=new Path();
                myPath.moveTo(x, y);
                break;
            case MotionEvent.ACTION_MOVE:
                myPath.lineTo(x, y);
                break;
            case MotionEvent.ACTION_UP:
                path_list.add(myPath);
                myPath = new Path();
                paint_list.add(myPaint);
                break;
        }
        return true;
    }

    class MyThread extends Thread {
        @Override
        public void run() {
            myPath=new Path();
            while (true) {
                Canvas myCanvas = holder.lockCanvas();
                myCanvas.drawColor(Color.WHITE);
                for (int i=0;i<path_list.size();i++) {
                    myCanvas.drawPath(path_list.get(i),paint_list.get(i));
                }
                myCanvas.drawPath(myPath, myPaint);
                holder.unlockCanvasAndPost(myCanvas);
            }

        }

    }
}
