
package KeThua.QUANLIHINH;

public class TAMGIAC extends HINH
{
    private int a,b,c;

    public TAMGIAC() {
        super();
    }
    public TAMGIAC(int a, int b, int c, String tenHinh) {
        super(tenHinh);
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public int getA() {
        return a;
    }
    public int getB() {
        return b;
    }
    public int getC() {
        return c;
    }
    public void setA(int a) {
        this.a = a;
    }
    public void setB(int b) {
        this.b = b;
    }
    public void setC(int c) {
        this.c = c;
    }

    @Override
    public void Nhap() {
        super.Nhap();
        System.out.println("Nhap canh A : ");
        this.a = sc.nextInt();
        System.out.println("Nhap canh B : ");
        this.b = sc.nextInt();
        System.out.println("Nhap canh C : ");
        this.c = sc.nextInt();
    }
    
    public int chuVi(){
        return this.a+this.b+this.c;
    }
    public double dienTich(){
        int p = chuVi()/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    @Override
    public void Xuat() {
        super.Xuat();
        System.out.println("C = "+chuVi());
        System.out.println("S = "+String.format("%.2f", dienTich()));
    }
}
