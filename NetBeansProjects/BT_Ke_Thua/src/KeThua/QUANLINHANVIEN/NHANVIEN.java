package KeThua.QUANLINHANVIEN;

import java.util.Date;
import java.util.Scanner;

public class NHANVIEN 
{
    protected String maNV,tenNV,gioiTinh,soCMND;
    protected Date namSinh;
    protected Scanner sc;

    public String getMaNV() {
        return maNV;
    }
    public String getTenNV() {
        return tenNV;
    }
    public String getGioiTinh() {
        return gioiTinh;
    }
    public String getSoCMND() {
        return soCMND;
    }
    public Date getNamSinh() {
        return namSinh;
    }
    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }
    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    public void setSoCMND(String soCMND) {
        this.soCMND = soCMND;
    }
    public void setNamSinh(Date namSinh) {
        this.namSinh = namSinh;
    }

    public NHANVIEN() {
        sc = new Scanner(System.in);
        namSinh = new Date();
    }
    public NHANVIEN(String maNV, String tenNV, String gioiTinh, String soCMND) {
        sc = new Scanner(System.in);
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.gioiTinh = gioiTinh;
        this.soCMND = soCMND;
        namSinh = new Date();
    }
    public void Nhap()
    {
        System.out.print("Nhap ma nhan vien : ");
        this.maNV = sc.nextLine();
        System.out.print("Nhap ten nhan vien : ");
        this.tenNV = sc.nextLine();
        System.out.print("Nhap gioi tinh : ");
        this.gioiTinh = sc.nextLine();
        System.out.print("Nhap so CMND : ");
        this.soCMND = sc.nextLine();
        System.out.print("Nhap nam sinh : ");
        this.namSinh = new Date();
    }
    public void Xuat()
    {
        System.out.println("\nMa : "+this.maNV);
        System.out.println("Ten : "+this.tenNV);
        System.out.println("Gioi : "+this.gioiTinh);
        System.out.println("So CMND : "+this.soCMND);
        System.out.println("Nam sinh : "+this.namSinh);
    }
}
