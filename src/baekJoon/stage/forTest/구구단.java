package baekJoon.stage.forTest;

import java.util.Scanner;

public class ������ {
	/*
	 * N�� �Է¹��� ��, ������ N���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * ��� ���Ŀ� ���缭 ����ϸ� �ȴ�. 
	 * ������İ� ���� N*1���� N*9���� ����Ѵ�.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=1; i<10; i++) {
			System.out.println(num + " * " + i + " = " + i*num);
		}
	}
}
