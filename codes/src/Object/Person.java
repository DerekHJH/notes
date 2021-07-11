package Object;

public class Person
{
    String name;
    public Person()
    {
        name = "Junhao Hu";
        this.name = "Junhao Hu";//These two assignment are the same;
    }
    //When we define an constructor with parameters, the compiler will not help us create the constructor like the one above
    public Person(String name)
    {
        this.name = name;
    }


}
