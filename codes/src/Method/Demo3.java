package Method;

public class Demo3
{
    public void a()
    {
        b();
        c();
    }
    public static void aa()
    {
        //b();//Error --- Explained in the end of this file
        //When a is loaded with the class, b is not loaded. Therefore, error detected!
        c();
    }
    public void b()
    {

    }
    public static void c()
    {

    }
    //While static method is loaded with the class, non-static method is loaded with the specific instance



}
