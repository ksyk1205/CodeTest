package baekJoon.stage.function;

import java.util.Scanner;
/*
 * � ���� ���� X�� �� �ڸ��� ���������� �̷�ٸ�, �� ���� �Ѽ���� �Ѵ�. 
 * ���������� ���ӵ� �� ���� ���� ���̰� ������ ������ ���Ѵ�. 
 * N�� �־����� ��, 1���� ũ�ų� ����,
 * N���� �۰ų� ���� �Ѽ��� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
public class OneStep {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int n = OneStep(num);
		System.out.println(n);
	}

	private static int OneStep(int num) {
		if(num<100) {
			return num;
		}else {
			if(num == 1000) {
				num = 999;
			}
			int result = 99;
			for(int i=100; i<=num; i++) {
				int n1 = i/100%10;
				int n2 = i/10%10;
				int n3 = i%10;
				
				if(n2*2==n1+n3) {
					result++;
				}
			}
			return result;
		}
	}

}
