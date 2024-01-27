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

/*  6 : 공 바꾸기
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
}                   */
/*  7번 : 과제 안 내신 분..?
import java.util.Scanner;
public class array1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[31];

        for(int s = 0; s < 31; s++) {
            array[s] = 0;
        }
        for(int i = 1; i <= 28; i++) {
            int n = sc.nextInt();
            array[n] = n;
        }
        for(int i = 1; i <= 30; i++) {
            if(array[i] == 0) {
                System.out.println(i);
            }
        }
    }
}           */

/*   8번 : 나머지
import java.util.Scanner;
public class array1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        int array[] = new int [10];
        int ar[] = new int [10];
        int count = 0;

        for(int i = 0; i < 10; i++) {
            int a = sc.nextInt();
            array[i] = a;
            ar[i] = a % 42;

            int rmsid = 0;
        
            for(int j = 0; j < i; j++) {
                if(ar[i] == ar[j]) {
                    rmsid += 1;                    
                } 
       
            } if(rmsid == 0) {
                count += 1;
          }     
        } System.out.println(count);
    }  
}       */
/*  HashSet 이용
import java.util.HashSet;
import java.util.Scanner;
public class array1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        HashSet<Integer> h = new HashSet<Integer>();

        for(int i = 0; i < 10; i++) {
            int a = sc.nextInt();
            h.add(a % 42);
        } System.out.println(h.size());
    }  
}               */

/*  9번 : 바구니 뒤집기
import java.util.Scanner;
public class array1_4 {
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
}               */

/*   10번 : 평균
import java.util.Arrays;
import java.util.Scanner;
public class array1_4 {
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
}           */

