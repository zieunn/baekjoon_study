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

// 8번 단어의 개수
/* 
import java.util.Scanner;
public class String_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 1;
        s = s.trim();

        if(s.isEmpty()) {
            count = 0;
        } else {
            
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == ' ') {
                    count += 1;
                } 
            }
        }
        System.out.println(count);
        sc.close();
    }
}     */
// StringToenizer 이용
/* 
import java.util.Scanner;
import java.util.StringTokenizer;
public class String_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        
        // st에 공백을 기준으로 나눈 토큰들을 st에 저장
        StringTokenizer st = new StringTokenizer(s, " ");
        //countTokens() 는 토큰의 개수를 반환
        System.out.println(st.countTokens());
    }
}
*/

/*  9번 상수
// StringBuffer 이용
import java.util.Scanner;
public class String_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        
        StringBuffer st1 = new StringBuffer(a);
        StringBuffer st2 = new StringBuffer(b);
        a = st1.reverse().toString();
        b = st2.reverse().toString();
        
        int value1 = Integer.parseInt(a);
        int value2 = Integer.parseInt(b);
        
        if (value1 > value2) {
            System.out.println(value1);
        } else {
            System.out.println(value2);
        }
    }
}                   
  */
  
/*  10번 다이얼
import java.util.Scanner;
public class String_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        int count = 0;

        for (int i = 0; i < num.length(); i++) {
            char ch = num.charAt(i);
            if (ch == 'A' || ch == 'B' || ch == 'C') {
                count += 3;
            } else if (ch == 'D' || ch == 'E' || ch == 'F') {
                count += 4;
            } else if (ch == 'G' || ch == 'H' || ch == 'I') {
                count += 5;
            } else if (ch == 'J' || ch == 'K' || ch == 'L') {
                count += 6;
            } else if (ch == 'M' || ch == 'N' || ch == 'O') {
                count += 7;
            } else if (ch == 'P' || ch == 'Q' || ch == 'R' || ch == 'S') {
                count += 8;
            } else if (ch == 'T' || ch == 'U' || ch == 'V') {
                count += 9;
            } else if (ch == 'W' || ch == 'X' || ch == 'Y'|| ch == 'Z') {
                count += 10;
            }
        } System.out.println(count);
    }
} 
*/

// 11번 그대로 출력하기
import java.util.Scanner;
public class String_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
    }
}