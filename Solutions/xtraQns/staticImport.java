// Java Program to illustrate 
// calling of predefined methods 
// without and With static import 
import static java.lang.Math.*;
import static java.lang.System.*;
public class staticImport { 
	public static void main(String[] args) 
	{ 
        System.out.println("Without Static Import :");
		System.out.println(Math.sqrt(4)); 
		System.out.println(Math.pow(2, 2)); 
        System.out.println(Math.floor(6.3)); 
        System.out.println("With Static Import :");
        //static methods without class Name Math and System
        out.println(sqrt(4)); 
        out.println(pow(2, 2)); 
        out.println(floor(6.3));
	} 
} 
