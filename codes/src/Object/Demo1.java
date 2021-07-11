package Object;
//Encapsulation
public class Demo1
{
    String name;//By default, it is public
    private int age;
    //To manipulate around private variables, we use public get and set method
    //alt + insert automatically create get and set methods

    public int getAge() {
        return age;
    }
    //We do security check here
    public void setAge(int age) {
        this.age = age;
    }
}
