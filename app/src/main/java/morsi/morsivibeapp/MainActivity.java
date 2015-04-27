package morsi.morsivibeapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.Button;

/**
 * Created by Ryan on 4/24/2015.
 */
public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnalogClock ac = (AnalogClock) findViewById(R.id.analogClock1);
    }

    public void switchPage(View view){

        String button_text;
        button_text = ((Button) view).getText().toString();
        if (button_text.equals("Demo")) {
            Intent intent = new Intent(this,Activity2.class);
            startActivity(intent);
        }
        else if (button_text.equals("Settings")) {
            Intent intent = new Intent(this,Activity3.class);
            startActivity(intent);
        }
    }
}


