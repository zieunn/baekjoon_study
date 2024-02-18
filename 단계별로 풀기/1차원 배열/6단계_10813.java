// 공 바꾸기
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int array[] = new int[n+1];
        
        for(int r = 1; r <= n; r++) {
            array[r] = r;
        }     
        for(int p = 1; p <= m; p++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int a = array[i];            
            array[i] = array[j];
            array[j] = a;
        }
        for(int r = 1; r <= n; r++) {
            System.out.print(array[r] + " ");
        }
    }
}  