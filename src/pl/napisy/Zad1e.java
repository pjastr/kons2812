package pl.napisy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Zad1e {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Wprowadź napis:");
        String napis = input.nextLine();
        System.out.println("Wprowadź szukany napis:");
        String napis2 = input.nextLine();
        System.out.println(Arrays.toString(where(napis, napis2)));
    }

    public static int[] where(String str, String subStr)
    {
        ArrayList<Integer> indeksy = new ArrayList<>();
        int index=0;
        while( (index = str.indexOf(subStr, index)) != -1)
        {
            indeksy.add(index);
            index++;
        }
        return indeksy.stream().mapToInt(i -> i).toArray();

    }
}
