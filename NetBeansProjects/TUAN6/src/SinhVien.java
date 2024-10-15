
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class SinhVien 
{
    private String maSV,tenSV,ngaySinh;
    private double dtb;
    protected Scanner sc;

    public SinhVien() {
        sc = new Scanner(System.in);
    }
    public SinhVien(String maSV, String tenSV, String ngaySinh, double dtb) {
        sc = new Scanner(System.in);
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.ngaySinh = ngaySinh;
        this.dtb = dtb;
    }
    public String getMaSV() {
        return maSV;
    }
    public String getTenSV() {
        return tenSV;
    }
    public String getNgaySinh() {
        return ngaySinh;
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
    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    public void setDtb(double dtb) {
        this.dtb = dtb;
    }
    public void nhapThongTin(){
        System.out.println("Nhap ten sinh vien : ");
        this.tenSV = sc.nextLine();
        System.out.println("Nhap ma sinh vien : ");
        this.maSV = sc.nextLine();
        System.out.println("Nhap ngay sinh dd/mm/yy : ");
        this.ngaySinh = sc.nextLine();
        System.out.println("Nhap diem trung binh : ");
        this.dtb = sc.nextDouble();
    }

    public void inThongTin() {
        System.out.println("Ma sinh vien: " + maSV);
        System.out.println("Ten sinh vien: " + tenSV);
        System.out.println("Ngay sinh: " + ngaySinh);
        System.out.println("Diem trung binh: " + dtb);
    }
}
class quanLiSV
{
    public ArrayList<SinhVien> list;

    public quanLiSV() {
        list = new ArrayList<>();
    }
    public void themSinhVien(SinhVien sv){
        list.add(sv);
    }
    public void inDanhSachSinhVien() {
        for (SinhVien sv : list) {
            sv.inThongTin();
            System.out.println();  
        }
    }
    public void sapXep()
    {
        list.sort(new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return (int) (o2.getDtb()-o1.getDtb());
            }
        });
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        quanLiSV ql = new quanLiSV();
        System.out.println("Nhap so sinh vien : ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            SinhVien sv = new SinhVien();
            sv.nhapThongTin();
            ql.themSinhVien(sv);
        }
        ql.sapXep();
        ql.inDanhSachSinhVien();
    }
}