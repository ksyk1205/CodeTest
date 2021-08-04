package baekJoon.stage.ioOperation;

import java.util.Scanner;

public class °ö¼À {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = B;
		System.out.println(A * (B%10));
		B/=10;
		System.out.println(A * (B%10));
		B/=10;
		System.out.println(A * (B%10));
		System.out.println(A * C);
	}
}
