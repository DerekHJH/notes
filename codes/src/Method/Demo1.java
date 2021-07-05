package Method;

public class Demo1
{
    public static void main(String[] args)
    {


    }
    int haha(int a, int b)
    {
        return a + b;
    }
    /*
    double haha(int a, int b)
    {
        return (double) (a + b);
    }

    //only change the type of the method cannot overload methods, since the return type is not part of the
    //method signature
    */

    double haha(int a)
    {
        return a;
    }

}
