
package KeThua.QUANLIHINH;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DANHSACH 
{
    private List<HINH> ds ;
    private int n;
    private Scanner sc;

    public DANHSACH() {
        ds = new ArrayList<>();
    }
    public DANHSACH(int n) {
        this.n = n;
        ds = new ArrayList<>();
    }
    public void Nhap(){
        sc = new Scanner(System.in);
        System.out.println("Nhap so luong hinh : ");
        this.n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++)
        {
            System.out.println("Nhap ki tu g/G cho tam giac, t,T cho hinh tron va h/H cho hinh chu nhat : ");
            char kiTu=' ';
            kiTu = sc.nextLine().toLowerCase().charAt(0);
            switch(kiTu)
            {
                case 'g':
                {
                    HINH tg = new TAMGIAC();
                    tg.Nhap();
                    ds.add(tg);
                    break;
                }
                case 't':
                {
                    HINH t = new TRON();
                    t.Nhap();
                    ds.add(t);
                    break;
                }
                case 'h':
                {
                    HINH d = new CHUNHAT();
                    d.Nhap();
                    ds.add(d);
                    break;
                }
                default :
                {
                    System.out.println("Nhap sai, nhap lai : ");
                    break;
                }
            }
        }
    }
    public void Xuat(){
        for(HINH x:ds){
            x.Xuat();
            System.out.println("");
        }
    }
    public void thongKe(){
        int demg=0,demt=0,demh=0;
        for(HINH x:ds){
            if(x instanceof TAMGIAC)
                demg++;
            else if(x instanceof TRON)
                demt++;
            else
                demh++;
        }
        System.out.println("So hinh tam giac co trong danh sach la : "+demg);
        System.out.println("So hinh tron co trong danh sach la : "+demt);
        System.out.println("So hinh chu nhat co trong danh sach la : "+demh);
    }
}
