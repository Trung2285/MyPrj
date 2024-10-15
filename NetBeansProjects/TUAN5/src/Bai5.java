import java.util.ArrayList;
import java.util.Scanner;

public class Bai5 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list;
        list = new ArrayList<>();
        int n;
        n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int ans = sc.nextInt();
            list.add(ans);
        }
        for(int i:list)
            System.out.print(i +" ");
    }
}
