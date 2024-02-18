//킹, 퀸, 록, 비숍, 나이트, 폰
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[6];

        for (int i = 0; i < 6; i++) {
            int n = sc.nextInt();
            arr[i] = n;
        }
        int num[] = new int[6];
        num[0] = 1 - arr[0];
        num[1] = 1 - arr[1];
        num[2] = 2 - arr[2];
        num[3] = 2 - arr[3];
        num[4] = 2 - arr[4];
        num[5] = 8 - arr[5];

        for (int result : num ) {
            System.out.print(result + " ");
        }
    }
}