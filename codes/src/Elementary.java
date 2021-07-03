/**
 * This is JavaDoc
 * @Author DerekHJH
 * @Description You can see that "at" plus certain keywords has certain functionality.
 */
public class Elementary
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

        String a;
        System.out.println(a);//Error, we have to initialize the string
        String s = 123;//Error, we have to make sure that the way we use the variable suits its type.

        //eight kinds of primitive data types
        int num1 = 10;
        byte num2 = 200;//overflow
        short num3 = 200;
        long num4 = 1000000L;//we always add an 'L' after a number of type long.
        float num5 = 40;//the integer will be first converted into double
        float num6 = 40.1;//Error: initially we regard 40.1 as double
        float num7 = 40.1F;//If we want to use float constant, we need to always add an 'F' after it.
        double num8 = 40.1;
        char c1 = '胡';
        char c2 = 'A';
        //Note that String is reference type
        String s1 = "my name is 胡俊豪";
        boolean f = false;
        boolean ff = 1;//Always remember Java is strongly typed.

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










    }
}
