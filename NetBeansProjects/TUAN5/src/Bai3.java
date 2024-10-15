import java.util.Scanner;

public class Bai3 
{
    static int n;
    static Scanner sc = new Scanner(System.in);
    static int a[];
    public static void main(String[] args) 
    {
        n =sc.nextInt();
        a = new int[n];
        Nhap();
        SapXep();
        Xuat();
    }
    static void Nhap()
    {
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
    }
    static void Xuat()
    {
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
    static void SapXep()
    {
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
                if(a[j]<a[i])
                {
                    int tmp=a[i];
                    a[i]=a[j];
                    a[j]=tmp;
                }
        }
    }
}
