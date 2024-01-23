// 1차원 배열
/*   1번 : 개수 세기
import java.util.Scanner;
public class array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];

        for(int i = 0; i<n; i++){
            array[i] = sc.nextInt();
        }
        int v = sc.nextInt();
        int count = 0;
        for(int i = 0; i<n; i++){
            if(v == array[i]){
                count += 1;
            }
        }
        System.out.println(count);
    }
}                   */

/* 2번 
import java.util.Scanner;
public class array1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int array[] = new int[n];       

        for(int i = 0; i<n; i++) {
            array[i] = sc.nextInt();
        }
        sc.close();
        
        for(int i = 0; i<n; i++) {
            if(array[i] < x) {
                System.out.print(array[i]+ " ");
            }
        }
    }
}               */
/*  3: 10818번 최소, 최대
import java.util.Scanner;
public class array1_4 {
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
// 배열 이용
import java.util.Arrays;
import java.util.Scanner;
public class array1_4 {
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
                                                     */
/*  4: 2562번 최댓값
import java.util.Scanner;
public class array1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[9];
        
        for(int i = 0; i<9; i++) {
            array[i] = sc.nextInt();
            }
        int max = array[0];
        int count = 0;  

        for(int i = 0; i < 9; i++) {
            if(array[i] > max) {
                max = array[i];
                count = i;
         }
        } 
        System.out.println(max);
        System.out.println(count+1);
    }
  }             */
/*   5: 공 넣기
import java.util.Scanner;
public class array1_4 {
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
}           */

// 6 : 공 바꾸기
import java.util.Scanner;
public class array1_4 {
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