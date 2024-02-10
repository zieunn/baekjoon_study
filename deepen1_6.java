// 1번 새싹
/* 
public class deepen1_6 {
    public static void main(String[] args) {
        System.out.println("         ,r\'\"7");
        System.out.println("r`-_   ,\'  ,/");
        System.out.println(" \\. \". L_r\'");
        System.out.println("   `~\\/");
        System.out.println("      |");
        System.out.println("      |");
    }
}
*/

// 2번 킹, 퀸, 록, 비숍, 나이트, 폰
/* 
import java.util.Scanner;
public class deepen1_6 {
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
*/

// 3번 별 찍기-7
/* 
import java.util.Scanner;
public class deepen1_6 {
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
*/
// 4번 팰린드롬인지 확인하기
import java.util.Scanner;
public class deepen1_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int count = 0;

        for (int i = 0; i < word.length()/2; i++) {
            if (word.charAt(i) == word.charAt(word.length()-i-1)) {
                count += 1;
            } 
        }
        if (count == word.length()/2) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }  
    }
}
