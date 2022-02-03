package baekJoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A_B {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		int cnt = 1;
		while(A!=B) {
			if(A>B) {
				cnt=-1;
				break;
			}
			
			String str = String.valueOf(B);
			if(B%2!=0 && str.charAt(str.length()-1)!='1') {
				cnt = -1;
				break;
			}
			
			if(B%2==0) {
				B/=2;
				cnt++;
			}
			if(str.charAt(str.length()-1)=='1') {
				String s1 = str.substring(0, str.length()-1);
				B = Integer.parseInt(s1);
				cnt++;
			}
			
			
		}
		
		System.out.println(cnt);

	}

}
