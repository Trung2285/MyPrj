import java.util.Scanner;

public class Bai1 
{   
    static int n;
    static Scanner sc = new Scanner(System.in);
    static int[] a;
    public static void main(String[] args) 
    {
        n = sc.nextInt();
        a = new int[n];
        Nhap();
        System.out.println("Tong day so la : "+ tong());
    }
    static void Nhap()
    {
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
    }
    static int tong()
    {
        int sum=0;
        for(int i=0;i<n;i++)
            sum+=a[i];
        return sum;
    }
}
