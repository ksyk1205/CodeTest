package goorm.level2;

import java.util.Scanner;

public class 약수의합 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		
		solution(n);

	}
	public static void solution(int n) {
		int sum = 0;
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}

}
