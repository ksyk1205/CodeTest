package baekJoon.stage.oneDimensionalArray;

import java.util.Scanner;

public class OXQuiz {
	/*
	 * "OOXXOXXOOO"�� ���� OX������ ����� �ִ�. 
	 * O�� ������ ���� ���̰�, X�� ������ Ʋ�� ���̴�. 
	 * ������ ���� ��� �� ������ ������ �� �������� ���ӵ� O�� ������ �ȴ�. 
	 * ���� ���, 10�� ������ ������ 3�� �ȴ�.
	 * 
	 * "OOXXOXXOOO"�� ������ 1+2+0+0+1+0+0+1+2+3 = 10���̴�.
	 * 
	 * OX������ ����� �־����� ��, ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] arr = new String[n];
		
		for(int i=0; i<n; i++) {
			arr[i]=sc.next();
		}
		
		for(int i=0; i<n; i++) {
			int cnt = 0;
			int sum = 0;
			for(int j=0; j<arr[i].length(); j++) {
				if(arr[i].charAt(j) == 'O') {
					cnt++;
				}else {
					cnt = 0;
				}
				sum += cnt;
			}
			System.out.println(sum);
			
		}
	}

}
