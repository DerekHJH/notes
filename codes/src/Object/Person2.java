package Object;

public class Person2
{
    String name;
    int age;
    int grade;
    int height;
    int weight;
    //When we define an constructor with parameters, the compiler will not help us create the default constructor
    public Person2(String name)
    {
        this.name = name;
    }
    //which means, if we do not define the default constructor on our own, we can not use it.
    //alt + insert automatically insert constructor

    public Person2(String name, int age, int grade, int height, int weight) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.height = height;
        this.weight = weight;
    }
}
