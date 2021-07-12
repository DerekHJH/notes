package Object7;
//abstract class
public abstract class A {
    void run(){
        System.out.println("A run");
    }

    abstract void eat(int x);//Children will help me complete the function body, it is simply a protocol
}
//Abstract class can not have a newed instance, can only work as a rule, waiting for a child to implement
//unimplemented methods
//But due to its single inheritance feature, we do not use abstract class very often.
//Instead, we use interface.