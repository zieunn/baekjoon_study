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

/*  4번 영수증
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
}   												*/
/*   5번 코딩은 체육과목 입니다
import java.util.Scanner;
public class iteration_3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String name = "";

		for(int i = 4; i <= n; i+=4){
			name += "long ";
		}
		System.out.println(name + "int");
    }   
} 									*/
/*  6번 빠른 A+B
import java.io.*;
import java.util.*;
public class iteration_3 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			bw.write((a+b)+"\n");
		   }
		bw.flush();
    }   
}											*/

/* 7번 :  A+B-7
import java.io.*;
import java.util.*;
public class iteration_3 {
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		String result[] = new String[t];

		for(int i = 0; i<t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			result[i] = "Case #" + (i+1)+ ": "+(a+b)+"\n";
		}
		for(int i = 0; i<t; i++) {
			bw.write(result[i]);
		}
		bw.flush();
    }   
}											
import java.util.Scanner;      //Scanner 이용
public class seletion_2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		String result[] = new String[t];

		for(int i = 0; i<t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			result[i] = "Case #" + (i+1)+ ": "+(a+b);
		}
		for(int i = 0; i<t; i++) {
		System.out.println(result[i]);
		}

    }   
} 		 */

//8번 : A+B-8
/* Scanner 이용
import java.util.Scanner;      
public class seletion_2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		String result[] = new String[t];

		for(int i = 0; i<t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			result[i] = "Case #" + (i+1)+ ": "+a+" + "+b+" = "+(a+b);
		}
		for(int i = 0; i<t; i++) {
		System.out.println(result[i]);
		}
    }   
} 	*/
/* 	BufferedReader 이용
import java.io.*;
import java.util.*;
public class iteration_3 {
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		String result[] = new String[t];

		for(int i = 0; i<t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			result[i] = "Case #" + (i+1)+ ": "+a+" + "+b+" = "+(a+b)+"\n";
		}
		for(int i = 0; i<t; i++) {
			bw.write(result[i]);
		}
		bw.flush();
    }   
}								*/


/*   9번 : 별 찍기-1
import java.util.Scanner;
public class iteration_3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
    }   
}					*/		

/*    10번: 별 찍기-2
import java.util.Scanner;
public class iteration_3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1; i<=n; i++){
			for(int j = 1; j<=n; j++){
				if((n-i)>=j) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}System.out.println();
		}

    }   
}	 							*/

/*  11번: A+B-5
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a==0 && b==0){
				sc.close();
				break;
			}
			System.out.println(a+b);
	  }
	}   
}				*/


/* 12번: A+B-4 
import java.util.Scanner;
public class iteration_3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

		while(sc.hasNextInt()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println(a+b);
			
	  }
	}   
}					*/
