package KeThua.QUANLINHANVIEN;


import java.util.Scanner;
        
public class NHANVIENHOPDONG extends NHANVIEN
{
    protected double mucLuong;

    public NHANVIENHOPDONG() {
        super();
    }
    public NHANVIENHOPDONG(double mucLuong, String maNV, String tenNV, String gioiTinh, String soCMND) {
        super(maNV, tenNV, gioiTinh, soCMND);
        this.mucLuong = mucLuong;
    }
    public double getMucLuong() {
        return mucLuong;
    }
    public void setMucLuong(double mucLuong) {
        this.mucLuong = mucLuong;
    }
    public double phuCap()
    {
        return 0.1*this.mucLuong;//+thâm niên >=10 ->2 trăm,<10 1 trăm 
    }
    
//    public double thucLinh()
//    {
//        
//    }
    @Override
    public void Nhap() {
        super.Nhap(); 
        System.out.println("Nhap muc luong : ");
        this.mucLuong = sc.nextDouble();
    }
    
    @Override
    public void Xuat() {
        super.Xuat();
        System.out.println("Muc luong : "+this.mucLuong);
        System.out.println("Luong phu cap : "+ phuCap());
    }
    
}
