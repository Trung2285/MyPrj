package TruuTuong.QUANLINHNHANVIEN;

import java.util.Date;

public class NVBC  extends  NHANVIEN{
	private double HeSoLuong;

	public NVBC() {
		super();
	}

	public NVBC(String maNV, String hoten, Date ngaySinh, Date ngayVaoCoQuan, String gioiTinh, String cCCD,
			double heSoLuong) {
		super(maNV, hoten, ngaySinh, ngayVaoCoQuan, gioiTinh, cCCD);
		HeSoLuong = heSoLuong;
	}

	@Override
	public double tinhPhuCap() {
		if(super.tinhThamNien()>=10)
			return super.luongcoban *0.1+500000;
		else
			return super.luongcoban *0.1+200000;
	}

	@Override
	public double tinhThucLinh() {		
		return this.HeSoLuong*super.luongcoban+this.tinhPhuCap();
	}
	public void Nhap()
	{
		super.Nhap();
		System.out.print("Nhap he so luong:");
		this.HeSoLuong=super.sc.nextDouble();
	}
	public void Xuat()
	{
		 super.Xuat();
		 System.out.println("He so luong:"+this.HeSoLuong);
		 System.out.println("Phu cap:"+this.tinhPhuCap());
		 System.out.println("thuc linh:"+this.tinhThucLinh());
	}

}//end subclass NVBC