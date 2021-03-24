import java.util.*;
public class Solution {

      public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            int a[] = new int[n];
            int count=0;
            int i,j,sum = 0;
            for(i=0;i<n;i++)
            {
                a[i] = scan.nextInt();
            }
            scan.close();
            for(i=0;i<n;i++)
            {
                sum = 0;
                for(j=i;j<n;j++)
                {
                    sum = a[j] + sum;
                    if(sum<0){
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }