package prob_2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class P2_test {
    /** Test method for {@link prob_2.P2} */
    P2 result;

    @Before
    public void setUp() throws Exception {
        result = new P2();
    }

    @After
    public void tearDown() throws Exception {
        result = null;
    }

    @Test
    public void Test0() {
        String date_from = "01-05-2021";
        String date_to = "30-05-2021";
        long actual = result.countSundays(date_from, date_to);
        long expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void Test1() {
        String date_from = "30-05-2021";
        String date_to = "01-05-2021";
        long actual = result.countSundays(date_from, date_to);
        long expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        String date_from = "16-06-2017";
        String date_to = "28-07-2020";
        long actual = result.countSundays(date_from, date_to);
        long expected = 163;
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        String date_from = "19-06-2022";
        String date_to = "19-06-2022";
        long actual = result.countSundays(date_from, date_to);
        long expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        String date_from = "18-06-2022";
        String date_to = "18-06-2022";
        long actual = result.countSundays(date_from, date_to);
        long expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void Test5() {
        String date_from = "13-06-2022";
        String date_to = "19-06-2022";
        long actual = result.countSundays(date_from, date_to);
        long expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void Test6() {
        String date_from = "13-06-2022";
        String date_to = "18-06-2022";
        long actual = result.countSundays(date_from, date_to);
        long expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void Test7() {
        String date_from = "12-06-2022";
        String date_to = "18-06-2022";
        long actual = result.countSundays(date_from, date_to);
        long expected = 1;
        assertEquals(expected, actual);
    }
}
