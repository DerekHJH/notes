package FlowControl;

import java.util.Scanner;

public class Demo1
{
    public static void main(String[] args)
    {
        Scanner scanner  = new Scanner(System.in);//alt + enter will automatically import the missing package for you
        System.out.println("next method:");
        if (scanner.hasNext())
        {
            String str = scanner.next();
            System.out.println("the input word is " + str);
        }

        if (scanner.hasNextLine())
        {
            String str = scanner.nextLine();
            System.out.println("the next input line is:" + str);
        }

        System.out.println("Please enter an integer: ");
        if(scanner.hasNextInt())
        {
            int a = scanner.nextInt();
            System.out.println("the input int is " + a);
        }
        //double, float and so on also have corresponding next method.
        scanner.close();//always remember to close it
        //all I/O streams should be closed when done using them, or else thy will keep consuming resources
    }
}