// 공 넣기
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int array[] = new int[n+1];

        for(int p = 1; p <= m; p++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();
            for(int q = i; q <= j; q++) {
                array[q] = k;
            }         
        }
        for(int r = 1; r <= n; r++) {
            System.out.print(array[r] + " ");
        }
    }
}   