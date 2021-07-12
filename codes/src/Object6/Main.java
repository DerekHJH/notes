package Object6;

//import java.lang.Math.ramdom;Error
import static java.lang.Math.random;
//statically imported package, few people do this
public final class Main { // final class can not bear children

    //static and non-static attributes
    public static void main(String[] args) {
        System.out.println(Student.haha);
        Student s = new Student();
        System.out.println(s.haha);
        System.out.println(s.xixi);
        s.haha = 999;
        System.out.println(Student.haha);

        Another x = new Another();
        Another y = new Another();


        System.out.println(random());
    }
    //static and non-static methods
    public void a(){

    }
    public static void b(){

    }

    public void c(){
        a();
        b();
    }
    public static void d(){
        //a();//Error:Static methods need to be loaded with the class in the static area
        //while non-static methods do not.
        b();
    }
}
