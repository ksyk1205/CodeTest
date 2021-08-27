package baekJoon.stage.oneDimensionalArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class TheRest {
	/*
	 * �� �ڿ��� A�� B�� ���� ��, 
	 * A%B�� A�� B�� ���� ������ �̴�. 
	 * 
	 * ���� ���, 7, 14, 27, 38�� 3���� ���� �������� 1, 2, 0, 2�̴�.
	 * 
	 * �� 10���� �Է¹��� ��, 
	 * �̸� 42�� ���� �������� ���Ѵ�. 
	 * �� ���� ���� �ٸ� ���� �� �� �ִ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[42];
		
		for(int i=0; i<10; i++) {
			int n = Integer.parseInt(br.readLine());
			int rest = n%42;
			arr[rest]++;
		}
		int cnt = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] !=0) {
				cnt++;
			}
		}
		System.out.println(cnt);
		
	}

}
