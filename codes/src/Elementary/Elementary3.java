package Elementary;

public class Elementary3
{
    public static void main(String[] args)
    {
        //IDEA hot key CTRL + D, copy current line to the next line
        long a = 10000L;
        int b = 10251;
        short c = 123;
        byte d = 1;
        System.out.println(c + d);//as long as there is no long, results of integer operations are still int ;

        System.out.println("" + a + b);//If we include s String at the beginning,
        // then a and b will be first converted into String. ans = 1000010251
        System.out.println(a + b + "");//ans = 20251, but it is a String
    }
}
