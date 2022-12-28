package pl.napisy;

import java.util.Scanner;

public class Zad1g {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Wprowadź napis:");
        String napis = input.nextLine();
        System.out.printf("Wynik: %s%n", nice(napis));
    }

    public static String nice(String str)
    {
        StringBuffer temp = new StringBuffer();
        for(int i=str.length()-1, count =1;i>=0;i--, count++)
        {
            temp.append(str.charAt(i));
            if (count %3 ==0 && i >0)
            {
                temp.append("'");
            }
        }
        return  temp.reverse().toString();
    }
}
