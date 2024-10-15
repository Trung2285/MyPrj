import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập số b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập số c: ");
        double c = scanner.nextDouble();
        double min = a;
        if(b < min)
            min = b;
        else if(c < min)
            min = c;
        System.out.println("Số nhỏ nhất là : "+ min);
        scanner.close();
    }
}