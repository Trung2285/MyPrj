import java.util.Scanner;
import java.lang.Math;
public class Bai2 
{
    static void hoandoi(int n,int[] a)
    {
        for(int i=0;i<(int)Math.ceil(n/2.0);i++)
        {
            int tmp =a[i];
                a[i] = a[n-i-1];
                a[n-i-1] =tmp;
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n,a[];
        n = sc.nextInt();
        a = new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        hoandoi(n,a);
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
 
}
