//문자열 반복
import java.util.Scanner;
public class Main {
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
} 