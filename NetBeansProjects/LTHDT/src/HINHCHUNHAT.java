
public class HINHCHUNHAT extends HINH
{
    private int cd,cr;

    public HINHCHUNHAT() {
        super();
    }

    public HINHCHUNHAT(int cd, int cr, String tenHinh) {
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
    
    public int chuVi()
    {
        return (this.cd+this.cr)*2;
    }
    public int dienTich()
    {
        return this.cd*this.cr;
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.println("Nhap chieu dai va chieu rong : ");
        this.cd = sc.nextInt();
        this.cr = sc.nextInt();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("chieu dai va chieu rong : " +this.cd+" "+this.cr);
        System.out.println("Chu vi hcn : " +chuVi());
        System.out.println("Dien tich hcn : "+dienTich());
    }
}
