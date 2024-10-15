import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Bai7
{
    private String maSV,tenSV;
    private double dtb;

    public Bai7(String maSV, String tenSV, double dtb) 
    {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.dtb = dtb;
    }

    public String getMaSV() {
        return maSV;
    }
    public String getTenSV() {
        return tenSV;
    }
    public double getDtb() {
        return dtb;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }
    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }
    public void setDtb(double dtb) {
        this.dtb = dtb;
    }
    
    @Override
    public String toString() {
        return "{" + "maSV=" + maSV + ", tenSV=" + tenSV + ", dtb=" + dtb + '}';
    }
}
class QuanLiSinhVien
{
    private ArrayList<Bai7> list;

    public QuanLiSinhVien() {
        list = new ArrayList<>();
    }
    
    public void themSV(Bai7 sv){
        list.add(sv);
        System.out.println("Them thanh cong");
    }
    public void xoaSV(String ma){
        boolean found = false;
        for (Bai7 sv : list) {
            if (sv.getMaSV().equals(ma)) {
                list.remove(sv);
                System.out.println("xoa thanh cong");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay sinh vien voi ma " + ma);
        }
    }
    public Bai7 timKiem(String ma)
    {
        for(Bai7 sv:list)
            if(sv.getMaSV().equals(ma))
                return sv;
        System.out.println("Khong tim thay");
        return null;
    }
    public void sapXep()
    {
        Collections.sort(list, new Comparator<Bai7>(){
            @Override
            public int compare(Bai7 sv1, Bai7 sv2) {
                return Double.compare(sv2.getDtb(), sv1.getDtb());
            }
        });
    }
    public void xuat()
    {
        for(Bai7 sv : list)
            System.out.println(sv.toString());
    }
}
class main
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        QuanLiSinhVien quanLi = new QuanLiSinhVien();
        int n;
        String maSV,tenSV;
        double diemTB;
        System.out.println("Nhap so luong sinh vien : ");
        n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("Nhap thong tin sinh vien thu "+(i+1)+" : ");
            sc.nextLine();
            System.out.print("Nhap ma sinh vien: ");
            maSV = sc.nextLine();
            System.out.print("Nhap ten sinh vien: ");
            tenSV = sc.nextLine();
            System.out.print("Nhap diem trung binh: ");
            diemTB = sc.nextDouble();
            Bai7 sinhVien = new Bai7(maSV, tenSV, diemTB);
            quanLi.themSV(sinhVien);
        }
        System.out.println("Nhap ma sinh vien muon xoa : ");
        sc.nextLine();
        maSV = sc.nextLine();
        quanLi.xoaSV(maSV);
        System.out.println("Nhap ma sinh vien muon tim kiem ");
        maSV = sc.nextLine();
        quanLi.timKiem(maSV);
        quanLi.sapXep();
        quanLi.xuat();
    }
}