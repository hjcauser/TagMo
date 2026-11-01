package org.example.sandboxfunctional;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public final class MainActivity extends Activity {
    private int taps = 0;
    @Override public void onCreate(Bundle state) {
        super.onCreate(state);
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setPadding(38, 80, 38, 38);
        layout.setGravity(Gravity.CENTER_HORIZONTAL);
        layout.setBackgroundColor(Color.rgb(244, 248, 252));
        TextView header = new TextView(this);
        header.setText("GitHub Build Sandbox v1.6");
        header.setTextSize(24);
        header.setTextColor(Color.rgb(23, 50, 74));
        layout.addView(header);
        TextView result = new TextView(this);
        result.setText("Tap the button to prove compiled Java runs.\nTaps: 0");
        result.setTextSize(19);
        result.setPadding(0, 45, 0, 35);
        layout.addView(result);
        Button button = new Button(this);
        button.setText("Test compiled Java button");
        button.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                taps++;
                result.setText("Compiled Java executed successfully!\nTaps: " + taps);
            }
        });
        layout.addView(button);
        setContentView(layout);
    }
}
