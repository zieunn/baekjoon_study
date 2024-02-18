//최댓값
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[9];
        
        for(int i = 0; i<9; i++) {
            array[i] = sc.nextInt();
            }
        int max = array[0];
        int count = 0;  

        for(int i = 0; i < 9; i++) {
            if(array[i] > max) {
                max = array[i];
                count = i;
         }
        } 
        System.out.println(max);
        System.out.println(count+1);
    }
  }