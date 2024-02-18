import java.util.Scanner;
public class Main  {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		if(m < 45) {
			if(h == 0) {
				h = 23;
				m = 60-45+m;
				System.out.println(h+" "+m);
			}else {
				h = h-1;
				m = 60-45+m;
				System.out.println(h+" "+m);
			}
		}else {	
			System.out.println(h+" "+(m-45));
		}
	}
}        
