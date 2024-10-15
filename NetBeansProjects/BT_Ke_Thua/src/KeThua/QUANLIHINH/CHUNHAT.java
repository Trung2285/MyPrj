
package KeThua.QUANLIHINH;

public class CHUNHAT extends HINH
{
    private int cd,cr;

    public CHUNHAT() {
        super();
    }
    public CHUNHAT(int cd, int cr, String tenHinh) {
        super(tenHinh);
        this.cd = cd;
        this.cr = cr;
    }
    public int getCd() {
        return cd;
    }
    public int getCr() {
        return cr;
    }
    public void setCd(int cd) {
        this.cd = cd;
    }
    public void setCr(int cr) {
        this.cr = cr;
    }
    public void Nhap(){
        super.Nhap();
        System.out.println("Nhap chieu dai : ");
        this.cd = sc.nextInt();
        System.out.println("Nhap chieu rong : ");
        this.cd = sc.nextInt(); 
    }
    public double chuVi(){
        return (this.cd+this.cr)*2;
    }
    public double dienTich(){
        return this.cd*this.cr;
    }
    public void Xuat(){
        super.Xuat();
        System.out.println("Chieu dai = "+this.cd);
        System.out.println("Chieu rong = "+this.cr);
        System.out.println("C = "+chuVi());
        System.out.println("s = "+dienTich());
    }
}
