package com.s_arpawadee.softdev;


import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout layout = new LinearLayout(this);
        Button btnB1 = new Button(this);
        btnB1.setText("Click Me");
        btnB1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                v.setBackgroundColor(Color.RED);
            }
        });
        layout.addView(btnB1);
        setContentView(layout);
    }

}
