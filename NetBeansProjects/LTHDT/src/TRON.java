class TRON extends HINH
{
    private double r;

    public double getR() {
        return r;
    }
    public void setR(double r) {
        this.r = r;
    }
    public TRON() {
        super();
    }
    public TRON(String ten,double r) {
        super(ten);
        this.r = r;
    }
    @Override
    public void nhap() {
        super.nhap();
        System.out.println("Nhap ban kinh r : ");
        this.r = sc.nextDouble();
    }
    public double tinhChuVi(){
        return 2*Math.PI*r;
    }
    public double tinhDienTich(){
        return Math.PI*r*r;
    }
    @Override
    public void xuat() {
        super.xuat();
        System.out.println("C = "+tinhChuVi());
        System.out.println("C = "+tinhDienTich());        
    }
    
}
