import static java.lang.Math.sqrt;
import java.util.Scanner;
public class Bai4 
{
    static boolean check(int n)
    {
        if(n<2)
            return false;
        else
        {
            for(int i=2;i<=sqrt(n);i++)
                if(n%i==0)
                    return false;
            return true;
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        if(check(n)==true)
            System.out.println(n+" la so nguyen to");
        else
            System.out.println(n+" khong phai la so nguyen to");
    }
}
