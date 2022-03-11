package javaAlgorithms.recursiveTreeGraph;

import java.util.Scanner;

public class 이진수출력 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		permulate(N);
	}

	private static void permulate(int n) {
		if(n==0) {
			return;
		}else {
			permulate(n/2);
			System.out.print(n%2);
		}
		
	}
}
