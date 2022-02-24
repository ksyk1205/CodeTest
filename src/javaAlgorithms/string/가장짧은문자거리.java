package javaAlgorithms.string;

import java.util.Scanner;

public class 가장짧은문자거리 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char t = sc.next().charAt(0);
		
		for(int n : solution(s,t)) {
			System.out.print(n+" ");
		}
	}

	private static int[] solution(String s, char t) {
		int[] intArr = new int[s.length()];
		int p = 1001;		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)==t) {
				intArr[i] = 0;
				p=0;
			}else {
				intArr[i] = p;
			}
			p++;
		}
		p = 1001;
		for(int i=s.length()-1; i>=0; i--) {
			if(s.charAt(i)==t) {
				p=0;
			}else {
				if(intArr[i]>p) {
					intArr[i] = p;
				}
			}
			p++;
		}
		
		return intArr;
		
	}
}
