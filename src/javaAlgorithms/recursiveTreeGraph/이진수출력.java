package javaAlgorithms.recursiveTreeGraph;

import java.util.Scanner;

public class 이진수출력 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		permutation(N);
	}

	private static void permutation(int n) {
		if(n==0) {
			return;
		}else {
			permutation(n/2);
			System.out.print(n%2);
		}
		
	}
}
