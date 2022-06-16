package prob_3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class P3_test {
    /** Test method for {@link prob_3.P3} */
    P3 result;

    @Before
    public void setUp() throws Exception {
        result = new P3();
    }

    @After
    public void tearDown() throws Exception {
        result = null;
    }

    @Test
    public void Test0() {
        String str = "local-part@domain-name.com";
        String actual = result.obfuscate(str);
        String expected = "l*****t@domain-name.com";
        assertEquals(expected, actual);
    }

    @Test
    public void Test1() {
        String str = "+44 123 456 789";
        String actual = result.obfuscate(str);
        String expected = "+**-***-**6-789";
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        String str = ".local-part@domain-name.com";
        String actual = result.obfuscate(str);
        String expected = "error";
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        String str = "local-part@domain-name..com";
        String actual = result.obfuscate(str);
        String expected = "error";
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        String str = "local-part@domain-name.com.in";
        String actual = result.obfuscate(str);
        String expected = "l*****t@domain-name.com.in";
        assertEquals(expected, actual);
    }

    @Test
    public void Test5() {
        String str = "local-part@domain-name.com.";
        String actual = result.obfuscate(str);
        String expected = "error";
        assertEquals(expected, actual);
    }

    @Test
    public void Test6() {
        String str = "LOCAL-part@DOMAIN-name.com";
        String actual = result.obfuscate(str);
        String expected = "l*****t@domain-name.com";
        assertEquals(expected, actual);
    }

    @Test
    public void Test7() {
        String str = "+44 123 456 78";
        String actual = result.obfuscate(str);
        String expected = "error";
        assertEquals(expected, actual);
    }

    @Test
    public void Test8() {
        String str = "+44 123 456 7889";
        String actual = result.obfuscate(str);
        String expected = "+**-***-***-7889";
        assertEquals(expected, actual);
    }

    @Test
    public void Test9() {
        String str = "123456 789";
        String actual = result.obfuscate(str);
        String expected = "*****6-789";
        assertEquals(expected, actual);
    }

    @Test
    public void Test10() {
        String str = " 123 456 789";
        String actual = result.obfuscate(str);
        String expected = "error";
        assertEquals(expected, actual);
    }

    @Test
    public void Test11() {
        String str = " 123 456 789e";
        String actual = result.obfuscate(str);
        String expected = "error";
        assertEquals(expected, actual);
    }

    @Test
    public void Test12() {
        String str = "1234567891";
        String actual = result.obfuscate(str);
        String expected = "******7891";
        assertEquals(expected, actual);
    }

    @Test
    public void Test13() {
        String str = "";
        String actual = result.obfuscate(str);
        String expected = "error";
        assertEquals(expected, actual);
    }
}
