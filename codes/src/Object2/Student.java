package Object2;

public class Student extends Person{
    protected String name = "Child";

    public Student(){
        //super();
    }
    public void test(String name){
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);//Access father's attribute
    }

}
