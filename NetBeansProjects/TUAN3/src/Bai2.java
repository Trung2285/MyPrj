
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        double dtb = sc.nextDouble();
        if(dtb >= 8.5)
            System.out.println("Gioi");
        else if(dtb >= 7)
            System.out.println("Kha");
        else if(dtb >= 5.5)
            System.out.println("Trung Binh");
        else
            System.out.println("Yeu");
    }
}
