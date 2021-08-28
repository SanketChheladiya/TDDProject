package calculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestCalculator {

    public static void main(String[] args)
    {
        org.junit.runner.JUnitCore.main("calculator.TestCalculator");
    }

    @Test
    public void testEmptyString() {
         assertEquals(0, Calculator.add(""));
    }

    @Test
    public void testOneNumber() {
        assertEquals(1, Calculator.add("1"));
    }

    @Test
    public void testTwoNumber() {
        assertEquals(3, Calculator.add("1,2"));
    }

    @Test
    public void newlineAsDelimiter()
    {
        assertEquals(6, Calculator.add("1\n2,3"));
    }

    @Test
    public void allPossibleDelimiter()
    {
        assertEquals(3, Calculator.add("//;\n1;2"));
    }



}