package FlowControl;

public class Demo3
{
    public static void main(String[] args)
    {
        int n = 100;
        //n.for//press tab here and we automatically get the following sentence
        for (int i = 0; i < n; i++)
        {

        }
        //augmented for
        int[] numbers = {1, 2, 2, 3};
        for (int x: numbers)
        {
            System.out.println(x);
        }
        for (int i = 0; i < 4; i++)
        {
            System.out.println(numbers[i]);
        }

        label: for (int i = 1; i <= 3; i++)
        {
            for(int j = 1; j <= 3; j++)
            {
                if(j == 2)continue label;
                System.out.print(j);
            }
        }
    }
}
