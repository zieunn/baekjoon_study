// 최소, 최대
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];

        for(int i = 0; i<n; i++) {
            array[i] = sc.nextInt();
        }
        int min = array[0];
        int max = array[0];
        for(int i = 0; i<n; i++) {
            if(array[i] < min) {
                min = array[i];
            } else {
                min = min;
            }
        }
        for(int i = 0; i<n; i++) {
            if(array[i] > max) {
                max = array[i];
            } else {
                max = max;
            }
        } System.out.println(min + " "+ max);
    }
}                  
// 배열 이용한 풀이
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];

        for(int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(array);
        System.out.println(array[0] + " " + array[n-1]);
    }
}