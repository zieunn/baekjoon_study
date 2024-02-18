//코딩은 체육과목 입니다
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String name = "";

		for(int i = 4; i <= n; i+=4){
			name += "long ";
		}
		System.out.println(name + "int");
    }   
} 