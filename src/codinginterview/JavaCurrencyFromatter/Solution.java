package codinginterview.JavaCurrencyFromatter;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        Locale indiaLocal = new Locale("en", "IND");
        NumberFormat inFormat = NumberFormat.getCurrencyInstance(indiaLocal);
        NumberFormat chFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat frFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String us = usFormat.format(payment);
        String india = inFormat.format(payment);
        String china = chFormat.format(payment);
        String france = frFormat.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
