package Object9;
//This part is only an extension. In fact, few people write their code this way.
public class Main {
    public static void main(String[] args) {
        Outer out = new Outer();
        Outer.Inner in = out.new Inner();
        in.in();


        new Outer().out();//anonymous object/instance, we do not create a reference variable for this instance
    }
}
