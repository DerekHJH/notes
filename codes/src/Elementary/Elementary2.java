package Elementary;

public class Elementary2
{
    String name = "haha";
    String name2; //instance variables do not have to be initialized, by default, they are all zeros or nulls(objects)

    static double sit = 123456789;//class variable
    static double fck;//do not have to be initialized

    static final double PI = 3.14; //constant
    final static double PI2 = 3.1415926;//modifier --- static and final, the order of which is not important
    public static void main(String[] args)
    {
        int i = 1;//local variable, and it needs to be initialized
        //int a;
        System.out.println(i);
        //System.out.println(a);//a is a local variable without initialization



        //Now we want to use instance variables --- name and name2 above
        Elementary2 elementary2 = new Elementary2();
        System.out.println(elementary2.name2);

        //now we want to use class variables --- sit and fck above
        System.out.println(sit);
        System.out.println(fck);//we can use them directly

    }
}
