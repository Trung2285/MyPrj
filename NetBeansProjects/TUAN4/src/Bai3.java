import java.util.Scanner;

public class Bai3 
{
    static int giaithua(int n)
    {
        if(n==0 || n==1)
            return 1;
        else
            return n * giaithua(n-1);
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        System.out.println(n+"! = "+giaithua(n));
    }
}
