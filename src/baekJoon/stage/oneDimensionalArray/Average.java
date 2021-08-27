package baekJoon.stage.oneDimensionalArray;

import java.util.Arrays;
import java.util.Scanner;

public class Average {
	/*
	 * �����̴� �⸻��縦 ���ƴ�. 
	 * �����̴� ������ �����ؼ� ���� ��������� �ߴ�. 
	 * �ϴ� �����̴� �ڱ� ���� �߿� �ִ��� �����. 
	 * �� ���� M�̶�� �Ѵ�. �׸��� ���� ��� ������ ����/M*100���� ���ƴ�.
	 * 
	 * ���� ���, �������� �ְ����� 70�̰�, 
	 * ���������� 50�̾����� ���������� 50/70*100�� �Ǿ� 71.43���� �ȴ�.
	 * 
	 * �������� ������ ���� ������ ���� ������� ��, 
	 * ���ο� ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		double[] arr = new double[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		double max = arr[n-1];
		double sum = 0;
		for(int i=0; i<n; i++) {
			sum += arr[i]/max*100;
		}
		
		System.out.println(sum/n);

	}

}
