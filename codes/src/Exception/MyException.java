package Exception;
//Self-defined Exception
//Normally, we do not need to define exceptions on our own
public class MyException extends Exception{
    //get a number and see if the number is greater than 10. If it is, the throw an exceprion.
    private int detail = 0;

    public MyException(int detail) {
        this.detail = detail;
    }

    @Override//Exception's printing message
    public String toString() {
        return "MyException{" +
                "detail=" + detail +
                '}';
    }
}
