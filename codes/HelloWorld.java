public class HelloWorld//class name must be the same as the file name
{
	public static void main(String[] args)
	{
		System.out.print("Hello, World!");
	}
}
/*
To compile, we first type in the following command on cmd:
javac Elementary.HelloWorld.java

And now we get a Elementary.HelloWorld.class file.

Finally, we run Elementary.HelloWorld.class by typing:
java Elementary.HelloWorld

Notice that we do not have to type java Elementary.HelloWorld.class, since java only execute .class file, we can simply specify the filename without adding .class suffix.
If we type java Elementary.HelloWorld.class, we get an error message --- cannot find or load the main class.
*/