package pl.duze;

import java.math.BigInteger;

public class Zad4 {

    public static void main(String[] args)
    {
        BigInteger n = BigInteger.valueOf(Integer.parseInt(args[0]));
        BigInteger suma = BigInteger.ZERO;
        BigInteger ciag = BigInteger.ONE;
        for(BigInteger i = BigInteger.ONE; i.compareTo(n.multiply(n)) <= 0; i=i.add(BigInteger.ONE))
        {
            suma = suma.add(ciag);
            ciag = ciag.multiply(BigInteger.TWO);
        }
        System.out.println(suma);
    }
}
