import java.util.*;
public class Pattern12{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>=1;i--)
        {
            for(int j=i;j<=n;j++)
                System.out.print(" ");
            for(int k=1;k<=i;k++)
                System.out.print("* ");
            System.out.println();
        }
        for(int i=2;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
                System.out.print(" ");
            for(int k=1;k<=i;k++)
                System.out.print("* ");
            System.out.println();
        }
    }
}