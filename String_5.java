 // 문자열

/*  1번 문자와 문자열
import java.util.Scanner;
public class String_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char str;
        int i = sc.nextInt();
  
        System.out.println(s.charAt(i-1));
    }
}               */

/*  2번 단어 길이 재기
import java.util.Scanner;
public class String_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s.length());
    }
}               */

/*  3번 문자열
import java.util.Scanner;
public class String_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String array[] = new String[t];

        for(int i = 0; i < t; i++) {
            String word = sc.next();
            array[i] = word.charAt(0)+ "" + word.charAt(word.length()-1);      
        }
        for(int i = 0; i < t; i++) {
            System.out.println(array[i]);
        }
    }
}           */

/* 4번 문자열
import java.util.Scanner;
public class String_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int number = s.charAt(0);
        System.out.println(number);
    }
}           */

/*  5번 숫자의 합
import java.util.Scanner;
public class String_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String number = sc.next();
        int sum = 0;
        
        for(int i = 0; i < n; i++) {
            sum = sum + number.charAt(i) - 48; 
        }
        System.out.println(sum);
    }
}                            */

/* 6번 알파벳 찾기
import java.util.Scanner;
public class String_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] arr = new int[26];
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = -1;
        }

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(arr[ch - 'a'] == -1) {
                arr[ch - 'a'] = i;
            }
        }
        for(int i = 0; i < 26; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}                       */

/* 7번 문자열 반복
import java.util.Scanner;
public class String_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int b = 0; b < t; b++) {
            int r = sc.nextInt();
            String s = sc.next();
            for(int i = 0; i < s.length(); i++) {
                for(int a = 0; a < r; a++) {
                    System.out.print(s.charAt(i));
                }
            
            }
            System.out.println();    
        }
    }
}               */


    