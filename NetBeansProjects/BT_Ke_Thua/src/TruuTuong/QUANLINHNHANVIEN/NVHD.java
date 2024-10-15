
package TruuTuong.QUANLINHNHANVIEN;

import java.util.Date;

public class NVHD extends NHANVIEN {
	 private double MucLuong;

	public NVHD(String maNV, String hoten, Date ngaySinh, Date ngayVaoCoQuan, String gioiTinh, String cCCD,
			double mucLuong) {
		super(maNV, hoten, ngaySinh, ngayVaoCoQuan, gioiTinh, cCCD);
		MucLuong = mucLuong;
	}

	public NVHD() {
		super();
	}

	@Override
	public double tinhPhuCap() {
		if(super.tinhThamNien()>=2)
			return this.MucLuong *0.1+200000;
		else
			return this.MucLuong *0.1+100000;
	}

	@Override
	public double tinhThucLinh() {		
		return super.luongcoban+this.MucLuong+tinhPhuCap();
	}
	public void Nhap()
	{
		super.Nhap();
		System.out.print("Nhap muc luong:");
		this.MucLuong=super.sc.nextDouble();
	}
	public void Xuat()
	{
		 super.Xuat();
		 System.out.println("Muc luong:"+this.MucLuong);
		 System.out.println("Phu cap:"+this.tinhPhuCap());
		 System.out.println("thuc linh:"+this.tinhThucLinh());
	}

}
