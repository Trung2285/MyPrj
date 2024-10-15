CREATE DATABASE  QLBH_2245
GO
USE QLBH_2245

-- Tạo bảng KhachHang
CREATE TABLE KhachHang
(
    maKH         CHAR(10) PRIMARY KEY,
    tenKH        NVARCHAR(50), 
    diaChiKH     NVARCHAR(100),
    SDT          CHAR(10),      
    Email        VARCHAR(50),   
    soDuTaiKhoan MONEY
);

-- Tạo bảng NhanVien
CREATE TABLE NhanVien
(
    maNV      CHAR(10) PRIMARY KEY,
    tenNV     NVARCHAR(50),
    SDT       CHAR(10),  
    Email     VARCHAR(50),  
    gioiTinh  BIT,    
    DoB       DATE, 
    Salary    MONEY             
);

-- Tạo bảng DonDatHang_HoaDon
CREATE TABLE DonDatHang_HoaDon
(
    maDH              CHAR(10) PRIMARY KEY,
    maKHNo1           CHAR(10) FOREIGN KEY REFERENCES KhachHang(maKH),
	maNVNo1			  CHAR(10) FOREIGN KEY REFERENCES NhanVien(maNV),	
    ngayTaoDH         DATE,   
    diaChiGiaoHang    NVARCHAR(100),    
    SDTGiaoHang       CHAR(10),     
    maHoaDonDienTu    VARCHAR(10),      
    ngayThanhToan     DATE,  
    ngayGiaoHang      DATE,    
    trangThaiDonHang  NVARCHAR(20)  
);

-- Tạo bảng SanPham
CREATE TABLE SanPham
(
    maSP            CHAR(10) PRIMARY KEY,
    tenSP           NVARCHAR(50),    
    donGiaBan       MONEY,           
    soLuongHienCon  BIGINT,                 
    soLuongCanDuoi  SMALLINT             
);

-- Tạo bảng ChiTietDonHang
CREATE TABLE ChiTietDonHang
(
    maDHNo1     CHAR(10) FOREIGN KEY REFERENCES DonDatHang_HoaDon(maDH),   
    maSPNo1     CHAR(10) FOREIGN KEY REFERENCES SanPham(maSP),   
    soLuongDat  INT,       
    donGia      MONEY,      
    PRIMARY KEY (maDHNo1, maSPNo1)
);
-- Tạo bảng NhaCungCap
CREATE TABLE NhaCungCap
(
    maNCC        CHAR(10) PRIMARY KEY,    
    tenNCC       NVARCHAR(50),           
    diaChiNCC    NVARCHAR(100),          
    SDT          CHAR(10),                
    nhanVienLienHe NVARCHAR(50)           
);

-- Tạo bảng PhieuNhap
CREATE TABLE PhieuNhap
(
    maPN            CHAR(10) PRIMARY KEY,  
    ngayNhapHang    DATE,                  
    maNCCNo1        CHAR(10) FOREIGN KEY REFERENCES NhaCungCap(maNCC)         
);

-- Tạo bảng ChiTietPhieuNhap
CREATE TABLE ChiTietPhieuNhap
(
    maPNNo1           CHAR(10) FOREIGN KEY REFERENCES PhieuNhap(maPN),   
    maSPNo1           CHAR(10) FOREIGN KEY REFERENCES SanPham(maSP),    
    soLuongNhap		  INT,
    giaNhap			  MONEY,   
    PRIMARY KEY (maPNNo1, maSPNo1)
);





