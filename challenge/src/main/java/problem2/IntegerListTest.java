package problem2;

import java.util.Scanner;
public class IntegerListTest
{
    static IntegerList list = new IntegerList(10);
    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args)
    {
        printMenu();
        int choice = scan.nextInt();
        while (choice != 0)
        {
            dispatch(choice);
            printMenu();
            choice = scan.nextInt();
        }
    }
    
    public static void dispatch(int choice)
    {
        switch(choice)
        {
            case 0:
                System.out.println("Bye!");
                break;
            case 1:
                System.out.println("How big should the list be?");
                int size = scan.nextInt();
                list = new IntegerList(size);
                list.randomize();
                break;
            case 2:
                list.print();
                break;
            case 3:
                System.out.println("Enter the value to add:");
                int addVal = scan.nextInt();
                list.addElement(addVal);
                System.out.println("Value added. Current size: " + list.getCurrentSize());
                break;
            case 4:
                System.out.println("Enter the value to remove (first occurrence):");
                int removeVal = scan.nextInt();
                list.removeFirst(removeVal);
                System.out.println("First occurrence removed. Current size: " + list.getCurrentSize());
                break;
            case 5:
                System.out.println("Enter the value to remove (all occurrences):");
                int removeAllVal = scan.nextInt();
                list.removeAll(removeAllVal);
                System.out.println("All occurrences removed. Current size: " + list.getCurrentSize());
                break;
            default:
                System.out.println("Sorry, invalid choice");
        }
    }
    
    public static void printMenu()
    {
        System.out.println("\n Menu ");
        System.out.println(" ====");
        System.out.println("0: Quit");
        System.out.println("1: Create a new list (** do this first!! **)");
        System.out.println("2: Print the list");
        System.out.println("3: Add an element");
        System.out.println("4: Remove first occurrence of a value");
        System.out.println("5: Remove all occurrences of a value");
        System.out.print("\nEnter your choice: ");
    }
}
