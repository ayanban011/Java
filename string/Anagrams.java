import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        boolean status = true;  
        if (a.length() != b.length()) {  
            status = false;  
        } else {  
            char[] ArrayS1 = a.toLowerCase().toCharArray();  
            char[] ArrayS2 = b.toLowerCase().toCharArray();  
            java.util.Arrays.sort(ArrayS1);  
            java.util.Arrays.sort(ArrayS2);  
            status = java.util.Arrays.equals(ArrayS1, ArrayS2);  
        }  
        return status;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}