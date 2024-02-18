// 8번 단어의 개수
import java.util.Scanner;
public class Main {
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
}     
// StringToenizer 이용
/* 
import java.util.Scanner;
import java.util.StringTokenizer;
public class Main {
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