import java.util.*;
public class ShoppingList
{
    public static void main(String[] args)
    {
        Vector<String> sl = new Vector<String>();
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter your choice");    
            System.out.println("1. Add an item");
            System.out.println("2. Remove an item");
            System.out.println("3. Print the list");
            System.out.println("4. Exit");
            int choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Enter element: ");
                    String groc = sc.next();
                    System.out.println("Enter location to add item: ");
                    int loc = sc.nextInt();
                    sl.add(loc, groc);
                    break;
                case 2:
                    System.out.println("Enter element: ");
                    String item = sc.next();
                    sl.remove(item);
                    break;
                case 3:
                    System.out.println(sl);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Incorrect option, please enter again:");
            }
        }
    }
}