package calculator;
public class Calculator
{

    private static final String delimiter = ",|\n|/|;|//";
    public static int add(String text)
    {

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
    private static int getSum(String[] numbers)
    {
        int sum=0;
        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i]!="")
                sum = sum + Integer.parseInt(numbers[i]);
        }
       return sum;
    }


}
