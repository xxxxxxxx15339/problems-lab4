package problem1;

import java.util.Scanner;

public class Sales {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of salespeople: ");
        int SALESPEOPLE = scan.nextInt();

        int[] sales = new int[SALESPEOPLE];

        // Read sales amounts
        for (int i = 0; i < sales.length; i++) {
            System.out.print("Enter sales for salesperson " + (i + 1) + ": ");
            sales[i] = scan.nextInt();
        }

        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");

        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int maxId = -1;
        int minId = -1;

        for (int i = 0; i < sales.length; i++) {
            System.out.println(" " + (i + 1) + " " + sales[i]); 
            sum += sales[i];
            if (sales[i] > max) {
                max = sales[i];
                maxId = i;
            }
            if (sales[i] < min) {
                min = sales[i];
                minId = i;
            }
        }

        // Print summary
        System.out.println("\nTotal sales: " + sum);
        System.out.println("Average sale: " + (double) sum / SALESPEOPLE);
        System.out.println("Salesperson " + (maxId + 1) + " had the highest sale with $" + max);
        System.out.println("Salesperson " + (minId + 1) + " had the lowest sale with $" + min);

        System.out.print("\nEnter a value to check who exceeded it: ");
        int value = scan.nextInt();

        int count = 0;
        System.out.println("Salespeople who exceeded " + value + ":");

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > value) {
                System.out.println("Salesperson " + (i + 1) + " with sales amount: " + sales[i]);
                count++;
            }
        }

        System.out.println("Total number of salespeople who exceeded " + value + ": " + count);

        scan.close();
    }
}