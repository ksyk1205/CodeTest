package baekJoon.stage.whileTest;

import java.util.Scanner;

public class PlusCycle {
	/*
	 * 0���� ũ�ų� ����, 99���� �۰ų� ���� ������ �־��� �� ������ ���� ������ �� �� �ִ�. 
	 * ���� �־��� ���� 10���� �۴ٸ� �տ� 0�� �ٿ� �� �ڸ� ���� �����, 
	 * �� �ڸ��� ���ڸ� ���Ѵ�. �� ����, �־��� ���� ���� ������ �ڸ� ���� 
	 * �տ��� ���� ���� ���� ������ �ڸ����� �̾� ���̸� ���ο� ���� ���� �� �ִ�. 
	 * ���� ���� ����.
	 * 
	 * 26���� �����Ѵ�. 
	 * 2+6 = 8�̴�. 
	 * ���ο� ���� 68�̴�. 
	 * 6+8 = 14�̴�. 
	 * ���ο� ���� 84�̴�. 
	 * 8+4 = 12�̴�. 
	 * ���ο� ���� 42�̴�. 
	 * 4+2 = 6�̴�. 
	 * ���ο� ���� 26�̴�.
	 * 
	 * ���� ���� 4������ ���� ���� ���ƿ� �� �ִ�. ���� 26�� ����Ŭ�� ���̴� 4�̴�.
	 * 
	 * N�� �־����� ��, N�� ����Ŭ�� ���̸� ���ϴ� ���α׷��� �ۼ��Ͻÿ�
	 */
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int Num = sc.nextInt();
		int n = Num;		
		int count = 0;
		while(true) {
			int a = n/10;
			int b = n%10;
			
			n = (b*10) +(a+b)%10;
			count++;
			if(Num ==n) {
				break;
			}
			
		}
		System.out.println(count);

	}

}