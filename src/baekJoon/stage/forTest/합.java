package baekJoon.stage.forTest;

import java.util.Scanner;

public class �� {
	/* n�� �־����� ��, 1���� n���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		for(int i=0; i<=n; i++) {
			sum +=i;
		}
		System.out.println(sum);
	}

}
