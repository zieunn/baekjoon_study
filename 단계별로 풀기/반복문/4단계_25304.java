//영수증
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		int price = 0;

		for(int i = 1; i <= n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			price += a*b;			
		}
		if(x == price) {
			System.out.println("Yes");
		}	else {
			System.out.println("No");
		}		
		
    }   
}   	