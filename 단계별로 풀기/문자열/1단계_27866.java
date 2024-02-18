//문자와 문자열
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char str;
        int i = sc.nextInt();
  
        System.out.println(s.charAt(i-1));
    }
}   