package KeThua.QUANLINHANVIEN;


import java.util.ArrayList;
import java.util.Scanner;

public class DANHSACH 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<NHANVIEN> ds = new ArrayList<NHANVIEN>();
        NHANVIEN nv = new NHANVIEN();
        System.out.println("Nhap so luong nhan vien : ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            nv.Nhap();
            ds.add(nv);
        }
        for(int i=0;i<n;i++)
        {
            ds.get(i).Xuat();
        }
    }
}
