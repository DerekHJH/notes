public class HelloWorld//class name must be the same as the file name
{
	public static void main(String[] args)
	{
		System.out.print("Hello, World!");
	}
}
/*
To compile, we first type in the following command on cmd:
javac HelloWorld.java

And now we get a HelloWorld.class file.

Finally, we run HelloWorld.class by typing:
java HelloWorld

Notice that we do not have to type java HelloWorld.class, since java only execute .class file, we can simply specify the filename without adding .class suffix.
If we type java HelloWorld.class, we get an error message --- cannot find or load the main class.
*/