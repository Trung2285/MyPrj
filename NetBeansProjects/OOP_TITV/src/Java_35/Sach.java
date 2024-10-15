package Java_35;

public class Sach 
{
    private String tenSach;
    double giaBan;
    int namXB;
    tacGia tg;

    public Sach(String tenSach, double giaBan, int namXB, tacGia tg) 
    {
        this.tenSach = tenSach;
        this.giaBan = giaBan;
        this.namXB = namXB;
        this.tg = tg;
    }

    public String getTenSach() {
        return tenSach;
    }
    public double getGiaBan() {
        return giaBan;
    }
    public int getNamXB() {
        return namXB;
    }
    public tacGia getTg() {
        return tg;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }
    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }
    public void setNamXB(int namXB) {
        this.namXB = namXB;
    }
    public void setTg(tacGia tg) {
        this.tg = tg;
    }
    public void inTS()
    {
        System.out.println("ten sach la : "+this.tenSach);
    }
    public boolean check(Sach sachKhac)
    {   
        if(sachKhac.namXB == this.namXB)
            return true;
        else
            return false;
    }
    public double giaMoi(double x)
    {
        return this.giaBan - this.giaBan * x;
    }
}
class tacGia
{
    String tenTG;
    ngay ngaySinh;

    public tacGia(String tenTG, ngay ngaySinh) 
    {
        this.tenTG = tenTG;
        this.ngaySinh = ngaySinh;
    }

    public String getTenTG() {
        return tenTG;
    }
    public ngay getNgaySinh() {
        return ngaySinh;
    }

    public void setTenTG(String tenTG) {
        this.tenTG = tenTG;
    }

    public void setNgaySinh(ngay ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
}
class ngay
{
    private int ngay,thang,nam;

    public ngay(int ngay, int thang, int nam) 
    {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }  

    public int getNgay() {
        return ngay;
    }
    public int getThang() {
        return thang;
    }
    public int getNam() {
        return nam;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }
    public void setThang(int thang) {
        this.thang = thang;
    }
    public void setNam(int nam) {
        this.nam = nam;
    }
}
class main
{
    public static void main(String[] args) 
    {
        ngay ngay1 = new ngay(22, 8, 2005);
        ngay ngay2 = new ngay(4, 3, 1978);
        ngay ngay3 = new ngay(2, 5, 1999);
        
        tacGia tg1 = new tacGia("Trung", ngay1);
        tacGia tg2 = new tacGia("Van", ngay2);
        tacGia tg3 = new tacGia("Le", ngay3);
        
        Sach s1 = new Sach("Toan", 10, 2015, tg3);
        Sach s2 = new Sach("Tieng Anh", 15, 2015, tg2);
        Sach s3 = new Sach("Ngu Van", 5, 2000, tg1);
        
        s1.inTS();
        if(s1.check(s2)==true)
            System.out.println("trung");
        else
            System.out.println("khong trung");
        System.out.println(s1.giaMoi(0.2));
    }
}