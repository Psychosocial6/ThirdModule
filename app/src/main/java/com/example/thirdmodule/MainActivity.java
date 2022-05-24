package com.example.thirdmodule;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MySurfaceView(this));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.brush_big:
                MySurfaceView.myPaint = new Paint();
                MySurfaceView.mySize = 100;
                MySurfaceView.myPaint.setAntiAlias(true);
                MySurfaceView.myPaint.setStrokeWidth(MySurfaceView.mySize);
                MySurfaceView.myPaint.setStyle(Paint.Style.STROKE);
                MySurfaceView.myPaint.setStrokeJoin(Paint.Join.ROUND);
                MySurfaceView.myPaint.setStrokeCap(Paint.Cap.ROUND);
                MySurfaceView.myPaint.setColor(MySurfaceView.myColor);
                break;

            case R.id.brush_medium:
                MySurfaceView.myPaint = new Paint();
                MySurfaceView.mySize = 60;
                MySurfaceView.myPaint.setAntiAlias(true);
                MySurfaceView.myPaint.setStrokeWidth(MySurfaceView.mySize);
                MySurfaceView.myPaint.setStyle(Paint.Style.STROKE);
                MySurfaceView.myPaint.setStrokeJoin(Paint.Join.ROUND);
                MySurfaceView.myPaint.setStrokeCap(Paint.Cap.ROUND);
                MySurfaceView.myPaint.setColor(MySurfaceView.myColor);
                break;

            case R.id.brush_small:
                MySurfaceView.myPaint = new Paint();
                MySurfaceView.mySize = 30;
                MySurfaceView.myPaint.setAntiAlias(true);
                MySurfaceView.myPaint.setStrokeWidth(MySurfaceView.mySize);
                MySurfaceView.myPaint.setStyle(Paint.Style.STROKE);
                MySurfaceView.myPaint.setStrokeJoin(Paint.Join.ROUND);
                MySurfaceView.myPaint.setStrokeCap(Paint.Cap.ROUND);
                MySurfaceView.myPaint.setColor(MySurfaceView.myColor);
                break;

            case R.id.color_red:
                MySurfaceView.myPaint = new Paint();
                MySurfaceView.myColor = Color.RED;
                MySurfaceView.myPaint.setAntiAlias(true);
                MySurfaceView.myPaint.setStrokeWidth(MySurfaceView.mySize);
                MySurfaceView.myPaint.setStyle(Paint.Style.STROKE);
                MySurfaceView.myPaint.setStrokeJoin(Paint.Join.ROUND);
                MySurfaceView.myPaint.setStrokeCap(Paint.Cap.ROUND);
                MySurfaceView.myPaint.setColor(MySurfaceView.myColor);
                break;

            case R.id.color_green:
                MySurfaceView.myPaint = new Paint();
                MySurfaceView.myColor = Color.GREEN;
                MySurfaceView.myPaint.setAntiAlias(true);
                MySurfaceView.myPaint.setStrokeWidth(MySurfaceView.mySize);
                MySurfaceView.myPaint.setStyle(Paint.Style.STROKE);
                MySurfaceView.myPaint.setStrokeJoin(Paint.Join.ROUND);
                MySurfaceView.myPaint.setStrokeCap(Paint.Cap.ROUND);
                MySurfaceView.myPaint.setColor(MySurfaceView.myColor);
                break;

            case R.id.color_blue:
                MySurfaceView.myPaint = new Paint();
                MySurfaceView.myColor = Color.BLUE;
                MySurfaceView.myPaint.setAntiAlias(true);
                MySurfaceView.myPaint.setStrokeWidth(MySurfaceView.mySize);
                MySurfaceView.myPaint.setStyle(Paint.Style.STROKE);
                MySurfaceView.myPaint.setStrokeJoin(Paint.Join.ROUND);
                MySurfaceView.myPaint.setStrokeCap(Paint.Cap.ROUND);
                MySurfaceView.myPaint.setColor(MySurfaceView.myColor);
                break;
            case R.id.eraser:
                MySurfaceView.myPaint = new Paint();
                MySurfaceView.myColor = Color.WHITE;
                MySurfaceView.myPaint.setAntiAlias(true);
                MySurfaceView.myPaint.setStrokeWidth(MySurfaceView.mySize);
                MySurfaceView.myPaint.setStyle(Paint.Style.STROKE);
                MySurfaceView.myPaint.setStrokeJoin(Paint.Join.ROUND);
                MySurfaceView.myPaint.setStrokeCap(Paint.Cap.ROUND);
                MySurfaceView.myPaint.setColor(MySurfaceView.myColor);
                break;
            case R.id.color_black:
                MySurfaceView.myPaint = new Paint();
                MySurfaceView.myColor = Color.BLACK;
                MySurfaceView.myPaint.setAntiAlias(true);
                MySurfaceView.myPaint.setStrokeWidth(MySurfaceView.mySize);
                MySurfaceView.myPaint.setStyle(Paint.Style.STROKE);
                MySurfaceView.myPaint.setStrokeJoin(Paint.Join.ROUND);
                MySurfaceView.myPaint.setStrokeCap(Paint.Cap.ROUND);
                MySurfaceView.myPaint.setColor(MySurfaceView.myColor);
                break;
            case R.id.color_yellow:
                MySurfaceView.myPaint = new Paint();
                MySurfaceView.myColor = Color.YELLOW;
                MySurfaceView.myPaint.setAntiAlias(true);
                MySurfaceView.myPaint.setStrokeWidth(MySurfaceView.mySize);
                MySurfaceView.myPaint.setStyle(Paint.Style.STROKE);
                MySurfaceView.myPaint.setStrokeJoin(Paint.Join.ROUND);
                MySurfaceView.myPaint.setStrokeCap(Paint.Cap.ROUND);
                MySurfaceView.myPaint.setColor(MySurfaceView.myColor);
                break;
            case R.id.color_white:
                MySurfaceView.myPaint = new Paint();
                MySurfaceView.myColor = Color.WHITE;
                MySurfaceView.myPaint.setAntiAlias(true);
                MySurfaceView.myPaint.setStrokeWidth(MySurfaceView.mySize);
                MySurfaceView.myPaint.setStyle(Paint.Style.STROKE);
                MySurfaceView.myPaint.setStrokeJoin(Paint.Join.ROUND);
                MySurfaceView.myPaint.setStrokeCap(Paint.Cap.ROUND);
                MySurfaceView.myPaint.setColor(MySurfaceView.myColor);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}