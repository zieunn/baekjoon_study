//바구니 뒤집기
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int array[] = new int[n+1];

        for(int i = 1; i <= n; i++) {
            array[i] = i;
        }
        for(int s = 0; s < m; s++) {
            int i = sc.nextInt();
            int j = sc.nextInt();

            for (int k = 0; i + k < j - k; k++) {
                int a = array[i + k];
                array[i + k] = array[j - k];
                array[j - k] = a;
            }
        }
        for(int i = 1; i <= n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}   
