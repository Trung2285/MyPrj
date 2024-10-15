import java.util.Scanner;

public class Bai4 
{
    static int n;
    static Scanner sc = new Scanner(System.in);
    static int a[];
    public static void main(String[] args) 
    {
        n = sc.nextInt();
        a = new int[n];
        Nhap();
        SapXep();
        max();
    }
    static void Nhap()
    {
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
    }
    static void SapXep()
    {
        for (int i = 0; i < n - 1; i++)
        {
            for (int j = i + 1; j < n; j++)
                if (a[j] < a[i])
                {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
        }
    }
    static void max()
    {
        int maxDem = 1; 
        int maxValue = a[0];
        int dem = 1;

        for (int i = 1; i < n; i++)
        {
            if (a[i] == a[i - 1])
            {
                dem++;
            }
            else
            {
                if (dem > maxDem)
                {
                    maxDem = dem;
                    maxValue = a[i - 1];
                }
                dem = 1;
            }
        }
        if (dem > maxDem)
        {
            maxDem = dem;
            maxValue = a[n - 1];
        }
        System.out.println(maxValue + " xuất hiện nhiều nhất với " + maxDem + " lần");
    }
}
