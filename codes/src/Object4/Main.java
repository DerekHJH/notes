package Object4;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        a.test();
        B b = new A();//child overrides father's method, therefore, father's method shall never appear
        //override only works for non-static method (and public method)
        b.test();
        //Static method and non-static has very different results!!!!!
        //This is also called polymorphism
        Object c = new A();
    }



    /*
    Something about the modifiers
    public > protected > default > private, can only switch to the smaller side, and not vice versa
    it is also true for Exceptions.
     */
}
