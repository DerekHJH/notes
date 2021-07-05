package FlowControl;

public class Demo2
{
    public static void main(String[] args)
    {
        //In Java 7, constant String is supported
        String name = "hjh";
        switch (name)
        {
            case "hjh":
            {
                System.out.println("My name is hjh!");
                break;
            }
            default:
            {
                break;
            }
        }
    }
    //In the corresponding class files, IDEA helped us finish the reverse engineering.
}
