package Exception;

public class Demo2 {
    public static void main(String[] args) {
        try {
            new Demo2().test();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } finally {
        }
    }
    void test() throws ArithmeticException{
        int a = 1;
        int b = 0;
        //actively throw exception
        if (b == 0){
            throw new ArithmeticException();
        }
        System.out.println(a / b);
    }
}
