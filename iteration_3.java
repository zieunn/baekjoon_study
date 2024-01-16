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

// 2번 A+B-3
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
}
  
