// Q) Explain Abstract Method with Examples
import java.util.*;
abstract class Abstract
{
    public abstract int remainder(int n1, int n2);
    public abstract int productOfThree(int n1, int n2, int n3);     
    public void display()
    {
        System.out.println("These are Methods of class Abstract");
    }
}
class Test extends Abstract
{
    public int remainder(int num1, int num2)
    {
        return num1%num2;
    }
    public int productOfThree(int num1, int num2, int num3)
    {
        return num1*num2*num3;
    }
    public static void main(String args[])
    {
        Abstract obj = new Test();
        System.out.println(obj.remainder(25, 7));
        System.out.println(obj.productOfThree(3, 4, 5));
        obj.display();
    }
}