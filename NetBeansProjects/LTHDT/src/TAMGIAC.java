
import java.util.Scanner;

public class TAMGIAC extends HINH 
{
    public int a,b,c;
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
    public int chuVi()
    {
        return this.a+this.b+this.c;
    }
    public double dienTich()
    {
        int p = chuVi()/2;
        return Math.sqrt(p*(p-this.a)*(p-this.b)*(p-this.c));
    }
    @Override
    public void nhap() {
        super.nhap();
        System.out.println("Nhap 3 canh tam giac : ");
        this.a = sc.nextInt();
        this.b = sc.nextInt();
        this.c = sc.nextInt();
    }
    @Override
    public void xuat() {
        super.xuat();
        System.out.println("3 canh tam giac : "+this.a+" "+this.b+" "+this.c);
        System.out.println("C = "+chuVi());
        System.out.println("S = "+dienTich());
    }
}
