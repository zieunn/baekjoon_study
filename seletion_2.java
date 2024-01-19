/* 1번 : 두 수 비교하기
import java.util.Scanner;

public class seletion_2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a > b) {
			System.out.println(">");
		} else if(a < b) {
			System.out.println("<");
		} else {
			System.out.println("==");
		}
		
	}
}    			*/

 /*  2번 : 시험 성적
 import java.util.Scanner;
public class seletion_2  {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		if(x >= 90 && x <= 100) {
			System.out.println("A");
		} else if(x >= 80) {
			System.out.println("B");
		} else if(x >= 70) {
			System.out.println("C");
		} else if(x >= 60) {
			System.out.println("D");
		} else  {
			System.out.println("F");
		}
	}
}
 */


/* 3번 : 윤년
import java.util.Scanner;
public class seletion_2  {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		
		if((y%4 == 0 && y%100 != 0)||(y%400 == 0)) {
			System.out.println(1);
		} else  {
			System.out.println(0);
		} 	
	}
} 									*/


/* 4번 : 사분면 고르기
import java.util.Scanner;
public class seletion_2  {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x > 0) {
			if(y > 0) {
				System.out.println(1);
			}else {
					System.out.println(4);
				}
			}
		if(x < 0)  {
			if(y > 0) {
				System.out.println(2);
			}else {
					System.out.println(3);
				}
			}    		
	}
} 										*/


/*   5번 : 알람 시계
import java.util.Scanner;
public class seletion_2  {
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
}        							*/


/* 6번 : 오븐 시계
import java.util.Scanner;
public class seletion_2  {
   public static void main(String[] args) {      
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      
      int sum = (a*60)+b+c; //모두 분단위로 바꾸기
      a = (sum/60) % 24;
      b = sum % 60;
       
      System.out.println(a+" "+b); 
   }
}										*/


/* 7번 : 주사위 세개
import java.util.Scanner;
public class seletion_2  {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
if(a==b && b==c && c==a) {
			System.out.println(10000+(a*1000));
		}else if ((a==b || b==c) || c==a) {
			if(a==b || a==c) {
				System.out.println(1000+(a*100));
			}else {
				System.out.println(1000+(b*100));
			}
		}else {
			if(a>b && a>c) {
				System.out.println(a*100);
			}else if(b>a && b>c){
				System.out.println(b*100);
			}else {
				System.out.println(c*100);
			}
		}
		
	}
}										*/				

//
import java.util.Scanner;
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
} 		