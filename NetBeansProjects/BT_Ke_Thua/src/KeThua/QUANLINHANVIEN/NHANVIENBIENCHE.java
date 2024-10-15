package KeThua.QUANLINHANVIEN;


import java.util.Scanner;

public class NHANVIENBIENCHE extends NHANVIEN
{
    protected double heSoLuong;
    protected double luongCoBan;

    public NHANVIENBIENCHE() {
        super();
    }

    public NHANVIENBIENCHE(double heSoLuong, double luongCoBan, String maNV, String tenNV, String gioiTinh, String soCMND) {
        super(maNV, tenNV, gioiTinh, soCMND);
        this.heSoLuong = heSoLuong;
        this.luongCoBan = luongCoBan;
    }
    public double getHeSoLuong() {
        return heSoLuong;
    }
    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }
    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }
    public double phuCap()
    {
       return 0.1*(this.luongCoBan/*+thâm niên*/);//(>=10 ? 5trăm : 2trăm 
    }

    @Override
    public void Nhap() {
        super.Nhap();
        System.out.print("Nhap he so luong : ");
        this.heSoLuong = sc.nextDouble();
        System.out.print("Nhap luong co ban : ");
        this.luongCoBan = sc.nextDouble();
    }

    @Override
    public void Xuat() {
        super.Xuat();
        System.out.println("He so luong : "+this.heSoLuong);
        System.out.println("Luong co ban : "+this.luongCoBan);
        System.out.println("Phu cap : "+phuCap());
    }
}
