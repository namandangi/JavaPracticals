import java.util.*;
class Super
{
    int salary = 50000;
    public void inc()
    {
        System.out.println("This is base level income.");
    }
}
interface Intf
{
    void print();
}
public class Employee extends Super implements Intf
{
    public void print()
    {
        System.out.println("Hello, this is employee e1!");
    }
    int bonus = 1700;
    public void inc()
    {
        System.out.println("This is total salary of employee e1.");
    }
    public static void main(String[] args)
    {
        Employee e1 = new Employee();
        e1.print();
        System.out.println("The salary of employee e1 = " + e1.salary);
        System.out.println("The bonus of employee e1 = " + e1.bonus);
        e1.inc();
    }
}