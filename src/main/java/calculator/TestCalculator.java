package calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCalculator {

    public static void main(String[] args)
    {
        org.junit.runner.JUnitCore.main("calculator.TestCalculator");
    }

    @Test
    public void testEmptyString() throws Exception {
         assertEquals(0, Calculator.add(""));
    }

    @Test
    public void testOneNumber() throws Exception {
        assertEquals(1, Calculator.add("1"));
    }

    @Test
    public void testTwoNumber() throws Exception {
        assertEquals(3, Calculator.add("1,2"));
    }

    @Test
    public void newlineAsDelimiter() throws Exception {
        assertEquals(6, Calculator.add("1\n2,3"));
    }

    @Test
    public void allPossibleDelimiter() throws Exception {
        assertEquals(3, Calculator.add("1;2"));
    }

    @Test(expected = Exception.class)
    public void negativeInputReturnException() throws Exception
    {
        Calculator.add("-1");
    }

    @Test
    public void numbergreaterthan1000() throws Exception {
        assertEquals(12, Calculator.add("1001;2,10"));
    }


}