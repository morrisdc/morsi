package morsi.morsivibeapp;

import android.os.Bundle;
import android.os.Vibrator;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.AnalogClock;

public class MainActivity extends Activity {
    Button vib1;
    Button vib2;
    Button vib3;

    Vibrator mVibrator;

    static int dot = 200; // Length of a Morse Code "dot" in milliseconds
    int dash = 500; // Length of a Morse Code "dash" in milliseconds
    int short_gap = 200; // Length of Gap Between dots/dashes
    int medium_gap = 500; // Length of Gap Between Letters
    int long_gap = 1000; // Length of Gap Between Words

    long[] pattern = { 0, // Start immediately
            dot, short_gap, dot, short_gap, dot, // s
            medium_gap, dash, short_gap, dash, short_gap, dash, // o
            medium_gap, dot, short_gap, dot, short_gap, dot, // s
            long_gap };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Find button 1
        vib1 = (Button) findViewById(R.id.btn1);
        // Find button 2
        vib2 = (Button) findViewById(R.id.btn2);
        // Find button 3
        vib3 = (Button) findViewById(R.id.btn3);
        // Create Vibrator instance for current context

        AnalogClock ac = (AnalogClock) findViewById(R.id.analogClock1);

        mVibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

        // Click Listener for button1
        vib1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Vibrates for 300 Milliseconds
                mVibrator.vibrate(300);
            }
        });
        // Click Listener for button2
        vib2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Vibrates on SOS pattern
                mVibrator.vibrate(pattern, -1);
            }
        });
        // Click Listener for button3
        vib3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Button b = (Button) v;
                //Vibrates until you cancel it
                if (b.getText().toString().equalsIgnoreCase("ON")) {
                    b.setText("OFF");
                    mVibrator.vibrate(new long[] { 0, 200, 0 }, 0);
                } else {
                    b.setText("ON");
                    mVibrator.cancel();
                }
            }
        });
    }

    @Override
    public void onDestroy() {
        //Cancel vibration when the application is about to close
        if (mVibrator != null)
            mVibrator.cancel();
        super.onDestroy();
    }

}