
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N > 0)
            System.out.println(N + " la so duong");
        else if(N < 0)
            System.out.println(N + " la so am");
        else
            System.out.println(N + " bang 0");
    }
}