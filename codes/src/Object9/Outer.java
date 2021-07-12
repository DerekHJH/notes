package Object9;

public class Outer {
    private int id = 10;
    public void out(){
        System.out.println("This is outer class");
    }
    //inner class can access private attribute of outer class.
    public class Inner{
        public void in(){
            System.out.println("This is inner class");
        }
        public void getId(){
            System.out.println(id);
        }
    }


    public void method(){
        //local class
        class Local{

        }
    }
}

class A{

}
//One Java file can only have one public class, but can have multiple other non-public classes
