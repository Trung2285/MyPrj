import java.util.Scanner;

public class HinhChuNhat 
{
    private Scanner sc;
    private int chieuDai;
    private int chieuRong;

    public HinhChuNhat() {
        sc = new Scanner(System.in);
    }
    public HinhChuNhat(int chieuDai, int chieuRong) {
        sc = new Scanner(System.in);
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }
    public int chuVi()
    {
        return (this.chieuDai + this.chieuRong)*2;
    }
    public int dienTich()
    {
        return this.chieuDai * this.chieuRong;
    }
    public void Nhap(){
        System.out.println("Nhap chieu dai : ");
        this.chieuDai = sc.nextInt();
        System.out.println("Nhap chieu rong : ");
        this.chieuRong = sc.nextInt();
    } 
    public void Xuat(){
        System.out.println("Chieu dai : "+this.chieuDai);
        System.out.println("Chieu rong : "+this.chieuRong);
        System.out.println("Chu vi hcn la : "+chuVi());
        System.out.println("Dien tich hcn la : "+dienTich());
    }
    public static void main(String[] args) 
    {
        HinhChuNhat hcn = new HinhChuNhat();
        hcn.Nhap();
        hcn.Xuat();
    }
}
