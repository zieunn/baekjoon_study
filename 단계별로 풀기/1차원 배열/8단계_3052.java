//나머지
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        int array[] = new int [10];
        int ar[] = new int [10];
        int count = 0;

        for(int i = 0; i < 10; i++) {
            int a = sc.nextInt();
            array[i] = a;
            ar[i] = a % 42;

            int rmsid = 0;
        
            for(int j = 0; j < i; j++) {
                if(ar[i] == ar[j]) {
                    rmsid += 1;                    
                } 
       
            } if(rmsid == 0) {
                count += 1;
          }     
        } System.out.println(count);
    }  
}       

/*  HashSet 이용
import java.util.HashSet;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        HashSet<Integer> h = new HashSet<Integer>();

        for(int i = 0; i < 10; i++) {
            int a = sc.nextInt();
            h.add(a % 42);
        } System.out.println(h.size());
    }  
}               */