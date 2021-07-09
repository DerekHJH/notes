package Array;

import java.util.Arrays;

public class Demo4
{
    public static void main(String[] args)
    {
        int[] a = {1, 2, 3, 353156, 3515, 321 ,5616, 321};
        System.out.println(a);
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        Arrays.fill(a, 0, 4, 0);
        System.out.println(Arrays.toString(a));
        Arrays.fill(a, 0);
        System.out.println(Arrays.toString(a));
    }
}
