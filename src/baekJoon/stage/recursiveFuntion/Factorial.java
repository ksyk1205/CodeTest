package baekJoon.stage.recursiveFuntion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {
	/* 0���� ũ�ų� ���� ���� N�� �־�����.
	 *  �̶�, N!�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int sum = factorial(N);
		
		System.out.println(sum);
	}

	private static int factorial(int n) {
		if(n<=1) {
			return 1;
		}
		return n*factorial(n-1);
	}

}
