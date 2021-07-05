package Method;

public class Demo2
{
    public static void main(String[] args)
    {
        test(1, 2, 3);
        Demo2 demo2 = new Demo2();
        demo2.tst(new int[] {1, 2, 3});
    }
    public static void test(int ...a)
    {
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
    }
    //static method, can be used directly in the class definition part
    //without static, it is instance method, we will have to declare an instance to use this method

    public void tst(int ...a)
    {
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
    }

}
