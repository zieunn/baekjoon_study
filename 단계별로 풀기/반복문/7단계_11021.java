//A+B-7
import java.io.*;
import java.util.*;
public class Main {
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

//Scanner 이용
import java.util.Scanner;      
public class Main {
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