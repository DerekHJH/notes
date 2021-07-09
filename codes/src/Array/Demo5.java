package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Demo5
{
    public static void main(String[] args)
    {
        //In Java, we can define arrays in this way --- dynamically
        int a = 0;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        int[] array1 = new int[a];
        System.out.println(Arrays.toString(array1));
    }
}
