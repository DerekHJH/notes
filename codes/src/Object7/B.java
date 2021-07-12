package Object7;

public class B extends A{
    //alt + insert to implement the methods in the inherited abstract class
    //If B is not an abstract class, and inherit from an abstract class, B has to implement all abstract methods in A

    @Override
    void eat(int x) {
        System.out.println("B eat");
    }
}
