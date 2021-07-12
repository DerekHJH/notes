package Exception;

public class Demo3 {
    public static void main(String[] args) {
        test(1);
        test(11);

        try {
            test2(1);
        } catch (MyException e) {
            e.printStackTrace();
        }
        try {
            test2(11);
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
    static void test(int a){
        if (a > 10){
            try {
                throw new MyException(a);
            } catch (MyException e) {
                e.printStackTrace();
            } finally {
            }
        }//We deal with this exception ourselves;
        System.out.println("test OK");
    }

    static void test2(int a) throws MyException{
        if (a > 10){
            throw new MyException(a);
        }//We do not deal with this exception. Instead, we let others do it.
        System.out.println("test2 OK");
    }
}
