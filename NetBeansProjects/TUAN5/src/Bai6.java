import java.util.ArrayList;
import java.util.Scanner;

public class Bai6 
{
    static void themPhanTu(ArrayList<Integer> list,int viTri,int phanTu)
    {
        if(viTri < 0 || viTri > list.size())
            System.out.println("Vi tri khong hop le");
        else
            list.add(viTri,phanTu);
    }
    static void xoaPhanTu(ArrayList<Integer> list,int viTri)
    {
        if(viTri < 0 || viTri > list.size())
            System.out.println("Vi tri khong hop le");
        else
            list.remove(viTri);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list;
        list = new ArrayList<>();
        int n,them,vtrithem,vtrixoa;
        n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int ans = sc.nextInt();
            list.add(ans);
        }
        System.out.println("Nhap phan tu muon them");
        them = sc.nextInt();
        System.out.println("Nhap vi tri muon them");
        vtrithem = sc.nextInt();
        themPhanTu(list, vtrithem, them);
        System.out.println("Danh sach sau khi them la :");
        for(int i : list)
            System.out.print(i+" ");
        System.out.println("\nNhap vi tri muon xoa");
        vtrixoa = sc.nextInt();
        xoaPhanTu(list, vtrixoa);
        System.out.println("Danh sach sau xoa them la :");
        for(int i : list)
            System.out.print(i+" ");
    }
}
