package Array;

public class Demo1
{
    public static void main(String[] args)
    {
        int[] a = null;//recommended
        //int b[];//only for C users, not recommended
        if (a == null) System.out.println("fuck");
        a = new int[10];//we only declare an array, and it is here we allocate a block of memory for it
        System.out.println(a);
        System.out.println(a.length);

        a[0] = 1;//it is here that we assign specific numbers to the array elements
        System.out.println(a[0]);
        System.out.println(a[1]);//without assignment, by default it is zero.


        //three ways of initialization
        int[] xixi = {1, 2, 3};//static initialization, the xixi.length = 3, fixed
        int[] xixi2 = new int[10];
        xixi2[0] = 1;//dynamic initialization, other elements are initialized by zeros --- default initialization

    }
}
