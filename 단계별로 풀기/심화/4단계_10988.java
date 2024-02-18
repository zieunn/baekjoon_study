// 팰린드롬인지 확인하기
import java.util.Scanner;
public class Main {
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