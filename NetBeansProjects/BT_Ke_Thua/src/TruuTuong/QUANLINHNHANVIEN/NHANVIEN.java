
package TruuTuong.QUANLINHNHANVIEN;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public  abstract class NHANVIEN {
	protected String MaNV;
	protected String Hoten;
	protected Date NgaySinh;
	protected Date NgayVaoCoQuan;
	protected String GioiTinh;
	protected String CCCD;
	protected Scanner sc;
	protected   final static double luongcoban=2340000;
	
	public NHANVIEN() {
		super();
		sc=new Scanner(System.in);
	}
	public NHANVIEN(String maNV, String hoten, Date ngaySinh, Date ngayVaoCoQuan, String gioiTinh, String cCCD) {
		super();
		MaNV = maNV;
		Hoten = hoten;
		NgaySinh = ngaySinh;
		NgayVaoCoQuan = ngayVaoCoQuan;
		GioiTinh = gioiTinh;
		CCCD = cCCD;
		sc=new Scanner(System.in);
	}
	 public int tinhThamNien()
	 {
		 Calendar cl_NgayhienTai=new GregorianCalendar();
		 cl_NgayhienTai.setTime(Calendar.getInstance().getTime());		 
		 Calendar cl_NgayVaoCoQuan=new GregorianCalendar();
		 cl_NgayVaoCoQuan.setTime(this.NgayVaoCoQuan);		 
		 return cl_NgayhienTai.get(Calendar.YEAR)-cl_NgayVaoCoQuan.get(Calendar.YEAR);		 
	 }
	 public void Nhap()
	 {
		 try {
                        System.out.print("Nhap ma nhan vien:");
			this.MaNV=sc.nextLine();
			System.out.print("Nhap ho ten nhan vien:");
			this.Hoten=sc.nextLine();
			System.out.print("Nhap gioi tinh:");
			this.GioiTinh=sc.nextLine();
			System.out.print("Nhap CCCD:");
			this.CCCD=sc.nextLine();
			SimpleDateFormat d=new SimpleDateFormat("dd/MM/yyyy");		  
			System.out.print("Nhap ngay sinh:");
			this.NgaySinh= d.parse(this.sc.nextLine());
			System.out.print("Nhap ngay vao co quan:");
			this.NgayVaoCoQuan= d.parse(this.sc.nextLine());
		  
		 }catch (Exception e) {
			// TODO: handle exception
		}
	 }//end method Nhap
	 public void Xuat()
	 {
            System.out.println("Ma nhan vien:"+this.MaNV);	
            System.out.println("Ho ten nhan vien:"+this.Hoten);		
            System.out.println("Gioi tinh:"+this.GioiTinh);		
            System.out.println("CCCD:"+this.CCCD);	 
            SimpleDateFormat d=new SimpleDateFormat("dd/MM/yyyy");		  
            System.out.println("Ngay sinh:"+this.NgaySinh.toString());	
            System.out.println("Ngay vao co quan:"+this.NgayVaoCoQuan.toString());
    	 }
	public abstract double tinhPhuCap();
	public abstract double tinhThucLinh();
}