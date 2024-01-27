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

// 3번 문자열
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
}

