package pl.napisy;

import java.util.Scanner;

public class Zad1d {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Wprowadź napis:");
        String napis = input.nextLine();
        System.out.println("Wprowadź ile kopii:");
        int n = input.nextInt();
        System.out.printf("Wynik: %s%n", repeat(napis, n));
        System.out.printf("Wynik: %s%n", repeat(napis));
    }

    public static String repeat(String str, int n)
    {
        StringBuilder temp = new StringBuilder();
        for (int i=0;i<n;i++)
        {
            temp.append(str);
        }
        return temp.toString();
    }

    public static String repeat(String str)
    {
        return repeat(str, 3);
    }
}
