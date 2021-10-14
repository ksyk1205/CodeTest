package baekJoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Microwave {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		int a = 0;
		int b = 0;
		int c = 0;
		
		while(T>=10) {
			if(T>=300) {
				T-=300;
				a++;
			}else if(T>=60) {
				T-=60;
				b++;
			}else if(T>=10) {
				T-=10;
				c++;
			}
		}
		
		System.out.println(T==0? a+" "+b+" "+c : -1);

	}

}
