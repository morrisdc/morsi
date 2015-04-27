package morsi.morsivibeapp.test;

import android.test.suitebuilder.annotation.SmallTest;

import junit.framework.TestCase;

import morsi.morsivibeapp.NumberAdder;

/**
 * Created by Ryan on 4/1/2015.
 */
public class NumberAdderTest extends TestCase{

    @Override
    protected void setUp() throws Exception {
        super.setUp();

    }

    @SmallTest
    public void testNumberAdder() {

        int result = NumberAdder.addNumber(2, 3);

        assertEquals(5, result);

    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();

    }

}
