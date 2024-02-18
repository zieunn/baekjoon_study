//과제 안 내신 분..?
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[31];

        for(int s = 0; s < 31; s++) {
            array[s] = 0;
        }
        for(int i = 1; i <= 28; i++) {
            int n = sc.nextInt();
            array[n] = n;
        }
        for(int i = 1; i <= 30; i++) {
            if(array[i] == 0) {
                System.out.println(i);
            }
        }
    }
}   
