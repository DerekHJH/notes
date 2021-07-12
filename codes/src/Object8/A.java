package Object8;
//classes only have implemented methods
//interfaces only have unimplemented methods
//abstract classes can have both

//interface can only be used as constraint, separate the constraint and the implementation
public interface A {
    /*public void run(){

    }*///Error, cannot be implemented

    public abstract void run();
    void eat(int x, String name);
    //public and abstract can be ignored, because they are default modifiers.

    void add();
    void delete();
    void update();
    void query();

    int a = 123;
    public static final int b = 999;
    //attribute is constant and public and static in interface by default
    //But usually, no one will define constant variables in interface.

}
//interface has to be implemented by some classed, or else, they are meaningless.
//interface has no constructor, and cannot be newed
