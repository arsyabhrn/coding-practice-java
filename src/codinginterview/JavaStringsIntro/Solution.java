package codinginterview.JavaStringsIntro;

import com.sun.xml.internal.ws.util.StringUtils;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        Integer totalLength = A.length() + B.length();
        System.out.println(totalLength);

        if (A.compareTo(B) > 0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        StringBuilder strings = new StringBuilder(A.substring(0,1).toUpperCase()+A.substring(1).toLowerCase())
                .append(" ")
                .append(B.substring(0,1).toUpperCase()+B.substring(1).toLowerCase());
        System.out.println(strings);
    }
}
