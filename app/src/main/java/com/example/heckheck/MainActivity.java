package com.example.heckheck;

import static com.example.heckheck.R.id.clockArea;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button addBtn;
    Context context;
    GridLayout nodeArea;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addBtn = (Button) findViewById(R.id.btnAdd);
        nodeArea = (GridLayout) findViewById(R.id.gridNode);
        context = this;

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int count = 4;
                int number = 60;
                Button btn = new Button(context);
                btn.setText(String.valueOf(number)+"초");
                btn.setBackgroundDrawable(ContextCompat.getDrawable(context, R.drawable.roundshape));
                nodeArea.addView(btn);
                count++;
            }
        });
    }

}
