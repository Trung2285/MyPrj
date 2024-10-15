import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập ba cạnh của tam giác
        System.out.print("Nhập cạnh a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập cạnh b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập cạnh c: ");
        double c = scanner.nextDouble();
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Ba cạnh này tạo thành một tam giác.");
            if (a == b && b == c) 
                System.out.println("Đây là tam giác đều.");
            else if (a == b || b == c || a == c) 
                System.out.println("Đây là tam giác cân.");
            else if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) 
                System.out.println("Đây là tam giác vuông.");
            else 
                System.out.println("Đây là tam giác thường.");
        } else 
            System.out.println("Ba cạnh này không tạo thành một tam giác.");
        scanner.close();
    }
}