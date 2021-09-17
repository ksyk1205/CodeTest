package baekJoon.realization;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int num = factorial(N);
		
		System.out.println(num);

	}

	private static int factorial(int n) {
		if(n<=1) {
			return 1;
		}
		return n*factorial(n-1);
	}

}
