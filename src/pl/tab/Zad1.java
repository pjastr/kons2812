package pl.tab;

import java.util.ArrayList;

public class Zad1 {

    public static void main(String[] args)
    {
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(5);
        a1.add(6);
        ArrayList<Integer> a2 = new ArrayList<>();
        a2.add(-3);
        a2.add(-3);
        a2.add(-33);
        ArrayList<Integer> wynik = append(a1,a2);
        System.out.println(wynik);

    }

    public static ArrayList<Integer> append(ArrayList<Integer> a, ArrayList<Integer> b)
    {
        ArrayList<Integer>  temp = new ArrayList<>();
        temp.addAll(a);
        temp.addAll(b);
        return temp;
    }
}
