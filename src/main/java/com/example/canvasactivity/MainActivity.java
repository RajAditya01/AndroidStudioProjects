package com.example.canvasactivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    private ShapeView shapeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        shapeView = findViewById(R.id.shapeView);
        Button buttonCircle = findViewById(R.id.c);
        Button buttonRectangle = findViewById(R.id.r);
        Button buttonTriangle = findViewById(R.id.t);
        Button buttonPolygon = findViewById(R.id.p);
        buttonCircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawCircle();
            }
        });
        buttonRectangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawRectangle();
            }
        });
        buttonTriangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawTriangle();
            }
        });
        buttonPolygon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawPolygon();
            }
        });
    }

    private void drawCircle() {
        shapeView.setShape(ShapeView.Shape.CIRCLE);
    }

    private void drawTriangle() {
        shapeView.setShape(ShapeView.Shape.LINE);
    }

    private void drawPolygon() {
        shapeView.setShape(ShapeView.Shape.POLYGON);
    }

    private void drawRectangle() {
        shapeView.setShape(ShapeView.Shape.RECTANGLE);
    }
}