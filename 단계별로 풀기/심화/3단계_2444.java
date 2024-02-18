//별 찍기-7
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 위쪽
        for (int i = 1; i <= n; i++) {
            for(int s = 1; s <= n-i; s++) {
                System.out.print(" ");
            }
            for(int s = 1; s <= 2*i-1; s++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 아래쪽
        for (int i = n-1; i >= 0; i--) {
            for(int s = 1; s <= n-i; s++) {
                System.out.print(" ");
            }
            for(int s = 1; s <= 2*i-1; s++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}