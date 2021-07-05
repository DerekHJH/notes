package Elementary;

/**
 * This is JavaDoc
 * @Author DerekHJH
 * @Description You can see that "at" plus certain keywords has certain functionality.
 */
public class Demo1
{
    public static void main(String[] args)
    {
        // This is a line comment
        /*
        This is a block comment
         */

        String 胡俊豪 = "胡俊豪";
        System.out.println(胡俊豪);
        //Yes, we can use Chinese characters as part of identifiers, but it is really uncommon and unpopular.

        //String a;
        //System.out.println(a);//Error, we have to initialize the string
        //String s = 123;//Error, we have to make sure that the way we use the variable suits its type.

        //eight kinds of primitive data types
        int num1 = 10;
        //byte num2 = 200;//overflow
        short num3 = 200;
        long num4 = 1000000L;//we always add an 'L' after a number of type long.
        //we can also use the lowercase 'l', but it might get people confused since it is like '1'.
        float num5 = 40;//the integer will be first converted into double
        //float num6 = 40.1;//Error: initially we regard 40.1 as double
        float num7 = 40.1F;//If we want to use float constant, we need to always add an 'F' after it.
        double num8 = 40.1;
        char c1 = '胡';
        char c2 = 'A';
        //Note that String is reference type
        String s1 = "my name is 胡俊豪";
        boolean f = false;
        //boolean ff = 1;//Always remember Java is strongly typed.

        //Integer extension
        int number1 = 10;//ten
        int number2 = 010;//octal
        int number3 = 0x10;//hexadecimal
        int number4 = 0b10;//binary
        //system.out.print will print every number in decimal form.

        //Float extension
        //Keep in mind that in real circumstances, bank account record for example, we never use float or double directly,
        //since they are absolutely flawed in terms of accuracy. Usually, we use BigDecimal class.
        float number5 = 0.1f;
        double number6 = 1.0 / 10;
        System.out.println(number5 == number6);//false

        float number7 = 123456789987654f;
        double number8 = number7 + 1;
        System.out.println(number7 == number8);//true

        //char extension
        char char1 = 'a';
        char char2 = '中';
        System.out.println((int)char1);//97
        System.out.println((int)char2);//20013
        //every char is a number in essential, we use unicode, which takes up 2 bytes
        //Little tip: Early Excel can only accommodate at most 65536 entries.
        //Every unicode is like U0000 - UFFFF
        char char3 = '\u0061';//a

        //boolean extension
        //Nobody will write code like if(flag == true), we always write if(flag).
        //As the saying goes: Less is More.

        //type conversion
        int haha1 = 128;
        //byte haha2 = haha1;//high to low, error: notice that in C, we can write this way.
        byte haha3 = (byte)haha1;//-128
        double haha4 = haha1;//low to high


        //an example of conversion
        char xixi1 = 'a';
        int xixi2 = xixi1 + 1; // auto conversion
        System.out.println(xixi2);
        System.out.println((char)xixi2);//explict conversion

        //JDK7 new features --- numbers can be separated by underscore sign
        int xixi3 = 1_0000_0000;

        int x = 1, y = 2, z = 3;//notice, do not define several variables in one line --- bad style
        int xx = 1;
        int yy = 2;
        int zz = 3;//good style

    }
}
