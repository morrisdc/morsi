package morsi.morsivibeapp.test;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.LargeTest;
import android.test.suitebuilder.annotation.MediumTest;
import android.test.suitebuilder.annotation.SmallTest;
import android.widget.TextView;

import morsi.morsivibeapp.MainActivity;
import morsi.morsivibeapp.R;

public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    MainActivity activity;


    public MainActivityTest() {

        super(MainActivity.class);

    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        activity = getActivity();
    }

    @SmallTest
    public void testTextViewNotNull() {

        TextView textView = (TextView) activity.findViewById(R.id.btn1);
        assertNotNull(textView);

    }

    @SmallTest
    public void test2TextViewNotNull() {

        TextView textView2 = (TextView) activity.findViewById(R.id.btn2);
        assertNotNull(textView2);

    }

    @SmallTest
    public void test3TextViewNotNull() {

        TextView textView3 = (TextView) activity.findViewById(R.id.btn3);
        assertNotNull(textView3);

    }

}