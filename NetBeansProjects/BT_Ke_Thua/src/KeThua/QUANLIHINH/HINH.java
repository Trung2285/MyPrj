
package KeThua.QUANLIHINH;

import java.util.Scanner;

public class HINH
{
    public String tenHinh;
    protected Scanner sc;

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
}
