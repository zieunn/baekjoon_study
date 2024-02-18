// 오븐 시계
import java.util.Scanner;
public class Main  {
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
}