package javaAlgorithms.recursiveTreeGraph;

import java.util.Scanner;

public class ���丮�� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		System.out.println(permutation(N));
	}

	private static int permutation(int n) {
		if(n==1) {
			return 1;
		}else {
			return n*permutation(n-1);
		}
		
	}
}
