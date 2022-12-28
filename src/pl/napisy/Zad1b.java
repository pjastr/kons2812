package pl.napisy;

import java.util.Scanner;

public class Zad1b {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Wprowadź napis:");
        String napis = input.nextLine();
        System.out.println("Wprowadź szukany napis:");
        String napis2 = input.nextLine();
        System.out.printf("Wynik: %d%n", countSubStr(napis, napis2));
    }

    public static int countSubStr(String str, String subStr)
    {
        int counter =0;
        int index =0;
        while( (index = str.indexOf(subStr, index)) != -1)
        {
            counter++;
            index++;
            //index += subStr.length(); // inny wariant rozumienia polecenia
        }
        return counter;
    }
}
