package baekJoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*0보다 크거나 같은 정수 N이 주어진다. 
 * 이때, N!을 출력하는 프로그램을 작성하시오.*/

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
