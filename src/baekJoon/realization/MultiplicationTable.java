package baekJoon.realization;

import java.util.Scanner;

/*N�� �Է¹��� ��, ������ N���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *��� ���Ŀ� ���缭 ����ϸ� �ȴ�.
 *������İ� ���� N*1���� N*9���� ����Ѵ�.*/

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i=1; i<=9; i++) {
			System.out.println(N+" * "+i+" = "+N*i);
		}

	}

}
