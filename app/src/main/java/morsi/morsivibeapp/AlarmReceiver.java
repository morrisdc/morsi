package morsi.morsivibeapp;

/**
 * Created by Ryan on 4/24/2015.
 */
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import android.os.Vibrator;

public class AlarmReceiver extends BroadcastReceiver {

    Vibrator mVibrator;

    static int dot = 200; // Length of a Morse Code "dot" in milliseconds
    int dash = 500; // Length of a Morse Code "dash" in milliseconds
    int short_gap = 200; // Length of Gap Between dots/dashes
    int medium_gap = 500; // Length of Gap Between Letters
    int long_gap = 1000; // Length of Gap Between Words

    long[] pattern = { 0, // Start immediately
            dot, short_gap, dash, short_gap, dot, short_gap, dot, // l
            medium_gap, dash, short_gap, dash, short_gap, dash,  // o
            dot, short_gap, dash, short_gap, dot, short_gap, dot, // l
            long_gap };

    @Override
    public void onReceive(Context context, Intent intent) {

        // For our recurring task, we'll just display a message
        Toast.makeText(context, "VIBRATING", Toast.LENGTH_SHORT).show();
        mVibrator.vibrate(pattern, -1);

    }
}