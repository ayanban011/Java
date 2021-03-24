import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        BigInteger f = new BigInteger(sc.next());
        BigInteger g = new BigInteger(sc.next());
        BigInteger h = f.multiply(g);
        BigInteger i = f.add(g);
        System.out.println(i);
        System.out.println(h);
    }
}
