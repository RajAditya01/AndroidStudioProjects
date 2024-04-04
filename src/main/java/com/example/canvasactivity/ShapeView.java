package com.example.canvasactivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class ShapeView extends View {
    private Paint paint;
    private Shape shapeToDraw;
    public enum Shape {
        CIRCLE, RECTANGLE,LINE,POLYGON
    }
    public ShapeView(Context context) {
        super(context);
        init();
    }
    public ShapeView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        paint = new Paint();
        paint.setColor(Color.BLUE);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(8);
        shapeToDraw = Shape.CIRCLE;
    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        switch (shapeToDraw) {
            case CIRCLE:
                drawCircle(canvas);
                break;
            case RECTANGLE:
                drawRectangle(canvas);
                break;
            case LINE:
                drawTriangle(canvas);
                break;
            case POLYGON:
                drawPolygon(canvas);
                break;
        }
    }
    private void drawCircle(Canvas canvas){
        canvas.drawCircle(510, 459,400, paint);
    }
    private void drawRectangle(Canvas canvas) {
        canvas.drawRect(200, 225, 820, 694, paint);
    }
    private void drawTriangle(Canvas canvas) {
        canvas.drawLine(126, 729, 874, 729, paint);
        canvas.drawLine(874, 729, 500, 200, paint);
        canvas.drawLine(500, 200, 126, 729, paint);
    }
    @SuppressLint("Range")
    private void drawPolygon(Canvas canvas) {
        float centerX = getWidth() / 2f;
        float centerY = getHeight() / 2f;
        float radius = Math.min(centerX, centerY) - 20;
        int numPoints = 6;
        float[] points = new float[numPoints * 4];
        for (int i = 0; i < numPoints; i++) {
            float angle = (float) (i * 2 * Math.PI / numPoints - Math.PI / 2);
            float x = centerX + radius * (float) Math.cos(angle);
            float y = centerY + radius * (float) Math.sin(angle);
            points[i * 4] = x;
            points[i * 4 + 1] = y;
            float nextAngle = (float) ((i + 1) * 2 * Math.PI / numPoints - Math.PI /
                    2);
            float nextX = centerX + radius * (float) Math.cos(nextAngle);
            float nextY = centerY + radius * (float) Math.sin(nextAngle);
            points[i * 4 + 2] = nextX;
            points[i * 4 + 3] = nextY;
        }
        canvas.drawLines(points, paint);
    }
    public void setShape(Shape shape) {
        shapeToDraw = shape;
        invalidate(); // Redraw the view
    }
}
