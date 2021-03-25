import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

//Write your code here
Set<String> hash_Set = new HashSet<String>();
for (int j=0;j<t;j++)
{
    hash_Set.add("(" + pair_left[j] + ", " + pair_right[j] + ")");
    //hash_Set.add(pair_right[j]);
    System.out.println(hash_Set.size());
}
   }
}