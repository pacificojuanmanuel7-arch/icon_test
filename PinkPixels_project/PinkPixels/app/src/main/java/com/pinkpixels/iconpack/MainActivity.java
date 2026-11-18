package com.pinkpixels.iconpack;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView t = new TextView(this);
        t.setText("Pink Pixels\n\nOpen your launcher's settings (Nova, Lawnchair, Niagara, etc.) "
                + "and choose Pink Pixels under Icon pack.");
        t.setTextSize(20);
        t.setTextColor(Color.parseColor("#3D1233"));
        t.setBackgroundColor(Color.parseColor("#FFB8DC"));
        t.setGravity(Gravity.CENTER);
        t.setPadding(64, 64, 64, 64);
        setContentView(t);
    }
}
