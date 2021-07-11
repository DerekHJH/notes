package Object;

public class Student
{
    //Although we did not define an creator at the beginning, the compiler will automatically add one creator
    //for Student, as shown in the decomplied .class file in out directory.
    String name = "Someone";
    int age;

    public void study()
    {
        System.out.println(this.name + "is studying");
    }
}
