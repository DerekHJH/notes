package Exception;

public class Demo1 {

    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        try{
            System.out.println(a / b);
        } catch(ArithmeticException e){
            System.out.println("b is zero");
        }catch(Error e){

        }catch(Exception e) {

        }catch(Throwable e){

        }finally{
            System.out.println("finally");
        }//If try fails, only one catch is executed and finally is always executed regardless of whether try fails.
        //We can do without finally
        //We put the "highest" Exception in the last;
        //Throwable > Exception > ...
        //Throwable > Error > ...


        //select one line of code, and press CTRL + ALT + T, we will insert code block.
        try {
            System.out.println("haha");
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);//exit with error code 1;
        }
    }
}
