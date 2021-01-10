import java.io.*;
import java.util.*;
import java.lang.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println( A.equals( new StringBuilder(A).reverse().toString()) 
            ? "Yes" : "No" );
    }
}