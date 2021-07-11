package Method;

public class Demo4
{
    String name = "123";
    public static void main(String[] args)
    {
        int a = 1;
        System.out.println(a);//1
        changeNumber(a);
        System.out.println(a);//1

        Demo4 haha = new Demo4();
        System.out.println(haha.name);
        changeName(haha);
        System.out.println(haha.name);
    }
    public static void changeNumber(int a)
    {
        a = 10;
    }
    public static void changeName(Demo4 haha)
    {
        haha.name = "hjh";
    }
//Whenever a new variable is declared, a new block (4 bytes for example) of memory is created to store the value
    //The value might be a real value, or an address indicating another data structure.

}
