package prob_1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class P1_test {
    /** Test method for {@link prob_1.P1} */
    P1 result;

    @Before
    public void setUp() throws Exception {
        result = new P1();
    }

    @After
    public void tearDown() throws Exception {
        result = null;
    }

    @Test
    public void Test1() {
        int num = 1;
        String actual = result.intToStr(num);
        String expected = "1st";
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        int num = 11;
        String actual = result.intToStr(num);
        String expected = "11th";
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        int num = 12;
        String actual = result.intToStr(num);
        String expected = "12th";
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        int num = 33;
        String actual = result.intToStr(num);
        String expected = "33rd";
        assertEquals(expected, actual);
    }

    @Test
    public void Test5() {
        int num = 87;
        String actual = result.intToStr(num);
        String expected = "87th";
        assertEquals(expected, actual);
    }

    @Test
    public void Test6() {
        int num = 52;
        String actual = result.intToStr(num);
        String expected = "52nd";
        assertEquals(expected, actual);
    }

    @Test
    public void Test7() {
        int num = 4;
        String actual = result.intToStr(num);
        String expected = "4th";
        assertEquals(expected, actual);
    }

}
