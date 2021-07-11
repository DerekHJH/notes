package Object3;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        a.test();
        B b = new A();
        b.test();
        //Father pointer can point to children, but not vice versa, due to security considerations
        //As for which method, exactly, is called, it depends on the left type modifier.
    }
}
