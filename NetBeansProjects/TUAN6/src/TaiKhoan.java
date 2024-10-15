import java.util.Scanner;

public class TaiKhoan 
{
    private String soTaiKhoan;
    private String chuTaiKhoan;
    private double soDu;
    protected Scanner sc;

    public TaiKhoan() {
        sc = new Scanner(System.in);
    }
    
    public TaiKhoan(String soTaiKhoan, String chuTaiKhoan, double soDu) {
        sc = new Scanner(System.in);
        this.soTaiKhoan = soTaiKhoan;
        this.chuTaiKhoan = chuTaiKhoan;
        this.soDu = soDu;
    }

    public String getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public String getChuTaiKhoan() {
        return chuTaiKhoan;
    }

    public double getSoDu() {
        return soDu;
    }

    public void setSoTaiKhoan(String soTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
    }

    public void setChuTaiKhoan(String chuTaiKhoan) {
        this.chuTaiKhoan = chuTaiKhoan;
    }

    public void setSoDu(double soDu) {
        this.soDu = soDu;
    }
    
    public void Nhap() {
        System.out.println("Nhap ten chu tai khoan : ");
        this.chuTaiKhoan = sc.nextLine();
        System.out.println("Nhap so tai khoan : ");
        this.soTaiKhoan = sc.nextLine();
        System.out.println("Nhap so du : ");
        this.soDu = sc.nextDouble();
    }

    public void guiTien(double soTien) {
        if (soTien > 0) {
            soDu += soTien;
            System.out.println("Da gui " + soTien + " vao tai khoan. So du hien tai: " + soDu);
        } else {
            System.out.println("So tien gui phai lon hon 0.");
        }
    }

    public void rutTien(double soTien) {
        if (soTien > soDu) {
            System.out.println("So tien rut vuot qua so du.");
        } else if (soTien > 0) {
            soDu -= soTien;
            System.out.println("Da rut " + soTien + " tu tai khoan. So du hien tai: " + soDu);
        } else {
            System.out.println("So tien rut phai lon hon 0.");
        }
    }

    public double kiemTraSoDu() {
        System.out.println("So du hien tai la : " + soDu);
        return soDu;
    }

    public static void main(String[] args) 
    {
        TaiKhoan tk = new TaiKhoan();
        tk.Nhap();
        
        System.out.println("Nhap so tien muon gui: ");
        double soTienGui = tk.sc.nextDouble();
        tk.guiTien(soTienGui);

        System.out.println("Nhap so tien muon rut: ");
        double soTienRut = tk.sc.nextDouble();
        tk.rutTien(soTienRut);

        tk.kiemTraSoDu();
    }
}
