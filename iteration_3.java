/* 1번 구구단
import java.util.Scanner;
public class iteration {
    public static void main(String[] args) {
		
    	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
                        
        for(int i = 1; i <= 9; i++) {
            System.out.println(n+" * "+i+" = "+n*i);
                }	                                                                  
    }   
}                                                              */

 /* 2번 A+B-3
import java.util.Scanner;
public class iteration_3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int result[] = new int[t];
 
		for (int i = 0; i < t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			result[i] = a + b;
		}
 
		for (int i = 0; i < t; i++) {
			System.out.println(result[i]);
		}	                        
    }   
} 												*/		

/*  3번 합 
import java.util.Scanner;
public class iteration_3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 0;
		for(int i = 0; i <= n; i++) {
			result += i;
		}		
		System.out.println(result);
		
    }   
}      											*/

// 4번 영수증
import java.util.Scanner;
public class iteration_3 {
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
