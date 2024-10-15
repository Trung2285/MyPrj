import java.util.Scanner;

public class Bai6 
{
    static boolean check(int n)
    {
        int ans=n,res=0;
        while(n>0)
        {
            res = res *10 + n%10;
            n/=10;
        }
        if(ans == res)
            return true;
        else
            return false;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        if(check(n)==true)
            System.out.println(n + " la so doi xung");
        else
            System.out.println(n + " khong la so doi xung");            
    }
}
