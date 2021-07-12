package Object5;
//Polymorphism
//Notice that only methods have polymorphism, attributes do not.
public class Main {
    public static void main(String[] args) {
        Object o = new Student();
        Person p = new Student();
        Student s = new Student();
        p.run();
        s.run();

        p.eat();
        s.eat();
        ((Person)o).eat();//"High" type needs to be explicitly casted to "Low" type

        //String p = new Student();//ClassCastException

        /*
        Usually, if we want to take advantage of polymorphism, we must override some of children's methods.
        And note that static methods cannot be override, because static methods belong to the class, not
        to a single instance.
        Also, final or private methods cannot be override.
         */

        AnotherClass x = new AnotherClass();
        //System.out.println(s instanceof AnotherClass);//Error, not even in the same subtree, therefore, the compiler
        //will throw an error.
        System.out.println(s instanceof Student);
        System.out.println(s instanceof Person);
        System.out.println(s instanceof Object);

        System.out.println(p instanceof AnotherClass);
        System.out.println(p instanceof Student);
        System.out.println(p instanceof Person);
        System.out.println(p instanceof Object);

        System.out.println(o instanceof AnotherClass);
        System.out.println(o instanceof Student);
        System.out.println(o instanceof Person);
        System.out.println(o instanceof Object);

        Person xx = new Person();
        System.out.println(xx instanceof Student);
        //instanceof relationship: find LCA of object a and object b, which we denoted as object c.
        //If c != a and c != b, then even the compiler
        //will throw an error message. If c == a, then b is an instance of a, and vice versa.


        /*
        double > float > long > int > short > byte
        "Low" casted to "High" is can be automatic, but not vice versa, simply because it is the safest action
        The same way, automatic casting only applies to safe conversion for classes.
        Object > Person > Student
         */







    }
}
