package Object6;

public class Another {
    public Another(){
        System.out.println("after the anonymous code block");
    }

    {
        //Anonymous code block, executed before the constructor
        System.out.println("non-static code block before the constructor");

    }//Executed whenever a new instance is created.

    static{
        //static anonymous code block, to initialize something
        System.out.println("static code block before the non-static code block");
    }//executed once for a life time
}
