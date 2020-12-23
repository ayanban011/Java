import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            int c,p;
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                System.out.print(s1);
                p=15-s1.length();
                for(int j=1;j<=p;j++)
                {
                System.out.print(" ");
                }
                if(x<100)
                {
                String str = String.format("%03d", x);
                System.out.printf("%s",str);
                System.out.println();
                }
                else
                {
                System.out.println(x);
                }
            }
            System.out.println("================================");

    }
}




