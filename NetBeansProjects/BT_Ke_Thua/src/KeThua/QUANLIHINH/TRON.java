
package KeThua.QUANLIHINH;

public class TRON extends HINH
{
    private double R;

    public TRON() {
        super();
    }
    public TRON(double R, String tenHinh) {
        super(tenHinh);
        this.R = R;
    }
    public double getR() {
        return R;
    }
    public void setR(double R) {
        this.R = R;
    }

    @Override
    public void Nhap() {
        super.Nhap(); 
        System.out.println("Nhap vao ban kinh : ");
        this.R =  sc.nextDouble();
    }
    
    public double chuVi(){
        return 2*Math.PI*this.R;
    }
    public double dienTich(){
        return Math.PI*this.R*this.R;
    }
    @Override
    public void Xuat() {
        super.Xuat();
        System.out.println("Ban kinh = "+this.R);
        System.out.println("C = "+String.format("%.2f", chuVi()));
        System.out.println("S = "+String.format("%.2f", dienTich()));
    }
    
}
