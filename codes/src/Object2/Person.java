package Object2;
// The same as public class Person extends Object
public class Person {
    private int money = 1_0000_0000;
    protected String name = "Father";

    public Person(){
        //super();//By default, the constructor of the class will always, first of all, call the constructor of its father

    }
    public void say(){
        System.out.println("I am a person!");
    }
    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    //Press CTRL + H, we will find out the inheritance tree.
    //And then we may discover that Person extends Object.
    // In Java, all class extends Object by default, and all class can only extends one other class, which makes
    // the inheritance tree a tree!
}
