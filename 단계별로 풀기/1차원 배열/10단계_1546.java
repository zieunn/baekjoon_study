//평균
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double array[] = new double[n];

        for(int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        double m = array[n-1];
        double arr[] = new double[n];
        double score = 0;

        for(int i =0; i < n; i++) {
            arr[i] = array[i] / m * 100;
        }

        for(int i = 0; i < n; i++) {
            score += arr[i];
        } 
        System.out.println(score/n);
    }
} 