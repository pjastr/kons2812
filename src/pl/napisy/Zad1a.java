package pl.napisy;

import java.util.Scanner;

public class Zad1a {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Wprowadź napis:");
        String napis = input.nextLine();
        System.out.println("Wprowadź znak:");
        char c = input.nextLine().charAt(0);
        System.out.printf("Ile razy: %d%n", countChar(napis, c));
    }

    public static int countChar(String str, char c) {
        int counter =0;
        for(int i=0;i<str.length();i++){
            if (str.charAt(i) == c){
                counter++;
            }
        }
        return counter;
    }
}
