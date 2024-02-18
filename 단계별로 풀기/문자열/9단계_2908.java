//상수
// StringBuffer 이용
import java.util.Scanner;
public class Main {
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
