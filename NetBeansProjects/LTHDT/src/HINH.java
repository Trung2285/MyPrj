import java.util.Scanner;

class HINH
{
    protected Scanner sc;
    public String tenHinh;

    public String getTenHinh() {
        return tenHinh;
    }
    public void setTenHinh(String tenHinh) {
        this.tenHinh = tenHinh;
    }

    public HINH() {
        sc = new Scanner(System.in);
    }
    public HINH(String tenHinh) {
        this.tenHinh = tenHinh;
        sc = new Scanner(System.in);
    }
    
    public void nhap(){
        System.out.println("Nhap ten hinh : ");
        this.tenHinh = sc.nextLine();
    }
    public void xuat(){
        System.out.println("Hinh "+this.tenHinh);
    }
}
