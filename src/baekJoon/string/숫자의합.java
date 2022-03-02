package baekJoon.string;

import java.util.Scanner;

public class 숫자의합 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int N = sc.nextInt();
		String s = sc.next();
		
		System.out.println(solution(N, s));
	}

	private static int solution(int n, String s) {
		int sum = 0;
		
		for(int i=0; i<n; i++) {
			sum += s.charAt(i)-'0';
		}
		
		return sum;
	}

}
