package morsi.morsivibeapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.Button;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View.OnClickListener;
import android.widget.Toast;
import java.util.Calendar;
import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Ryan on 4/24/2015.
 */
public class Activity3 extends ActionBarActivity {

    private PendingIntent pendingIntent;

    Vibrator mVibrator;

    final Context context = this;
    Button radio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_layout);

        Intent alarmIntent = new Intent(Activity3.this, AlarmReceiver.class);
        pendingIntent = PendingIntent.getBroadcast(Activity3.this, 0, alarmIntent, 0);

        AnalogClock ac = (AnalogClock) findViewById(R.id.analogClock1);
        mVibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

        final String[] items = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" };
        final int[] ints = new int[items.length];

        Button buttonCancel = (Button)findViewById(R.id.cancelalarm);

        radio = (Button) findViewById(R.id.radio_dialog);

        radio.setOnClickListener(new OnClickListener() {

        int setitem;

            @Override
            public void onClick(View arg0) {


                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setTitle("Choose which hour to vibrate");
                builder.setSingleChoiceItems(items, -1, new DialogInterface.OnClickListener() {
                     public void onClick(DialogInterface dialog, int item) {
                         Toast.makeText(getApplicationContext(), "Time set", Toast.LENGTH_SHORT).show();
                            dialog.cancel();

                            ints[setitem] = Integer.parseInt(items[item]);
                         }

                });


                AlertDialog alert = builder.create();
                alert.show();

                AlarmManager alarmManager = (AlarmManager)getSystemService(ALARM_SERVICE);

                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(System.currentTimeMillis());
                calendar.add(Calendar.HOUR_OF_DAY, ints[setitem]);
                alarmManager.set(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), pendingIntent);
            }
        });

        buttonCancel.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View arg0) {

                // TODO Auto-generated method stub

                AlarmManager alarmManager = (AlarmManager)getSystemService(ALARM_SERVICE);
                alarmManager.cancel(pendingIntent);

                Toast.makeText(getApplicationContext(), "Time cancelled", Toast.LENGTH_SHORT).show();


                // Tell the user about what we did.

            }
        });




    }

    public void switchPage(View view){

        String button_text;
        button_text = ((Button) view).getText().toString();
        if (button_text.equals("Settings")) {
            Intent intent = new Intent(this,Activity2.class);
            startActivity(intent);
        }
        else if (button_text.equals("Home")) {
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
        }
    }


}
