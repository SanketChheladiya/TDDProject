package calculator;
public class Calculator
{

    private static final String delimiter = ",|\n|/|;|//";
    public static int add(String text) throws Exception {

        String[] numbers = text.split(delimiter);
        if(text.equals(""))
        {
            return 0;
        }

        if(text.length()==1)
        {
            return Integer.parseInt(text);
        }
        else
        {
                return getSum(numbers);
        }
    }
    private static int getSum(String[] numbers) throws Exception {
        int sum=0;
        for(String s: numbers)
        {
            if(stringToInt(s)<0)
            {
                throw new Exception("Negative Input");
            }
        }

        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i]!="")
                sum = sum + Integer.parseInt(numbers[i]);
        }
       return sum;
    }

    private static int stringToInt(String s)
    {
        return Integer.parseInt(s);
    }

}
