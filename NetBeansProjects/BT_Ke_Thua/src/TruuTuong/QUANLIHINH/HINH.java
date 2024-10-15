
package TruuTuong.QUANLIHINH;

import java.util.Scanner;

abstract public class HINH
{
    private String tenHinh;
    private Scanner sc;

    public HINH() {
        sc = new Scanner(System.in);
    }
    public HINH(String tenHinh) {
        sc = new Scanner(System.in);
        this.tenHinh = tenHinh;
    }
    public String getTenHinh() {
        return tenHinh;
    }
    public void setTenHinh(String tenHinh) {
        this.tenHinh = tenHinh;
    }
    public void Nhap(){
        System.out.println("Nhap ten hinh : ");
        this.tenHinh = sc.nextLine();
    }
    public void Xuat(){
        System.out.println("Hinh "+this.tenHinh);
    }
    abstract public double chuVi();
    abstract public double dienTich();
}
