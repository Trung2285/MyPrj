package Java_31;

public class HoaDonCafe 
{
    private String tenCafe;
    private double  giaTien1Kg;
    private double  khoiLuong;
    // Hàm constructor(Phím tắt Alt + Ins)
    public HoaDonCafe(String name,double price,double kl)
    {
        this.tenCafe = name;
        this.giaTien1Kg = price;
        this.khoiLuong = kl;
    }
    public double tinhTien()
    {
        return this.giaTien1Kg*this.khoiLuong;
    }
    
    public static void main(String[] args) 
    {
        HoaDonCafe cf = new HoaDonCafe("TrungNguyen",100 , 1.5);
        System.out.println("Tong tien la : " + cf.tinhTien());
    }
}
