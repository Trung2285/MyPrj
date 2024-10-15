import java.util.Scanner;
import java.lang.Math;
public class Bai5 
{
    static int UCLN(int a,int b)
    {
        if(a%b==0)
            return b;
        else
            return UCLN(b,a%b);
    }
    static int BCNN(int a,int b)
    {
        return (a/UCLN(a,b))*b;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Nhap vao 2 so : ");
        a = sc.nextInt();b=sc.nextInt();
        System.out.println("UCLN la : "+UCLN(a,b)+"\nBCNN la : "+BCNN(a,b));
    }
}
