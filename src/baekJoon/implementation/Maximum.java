package baekJoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*9���� ���� �ٸ� �ڿ����� �־��� ��, �̵� �� �ִ��� ã��
�� �ִ��� �� ��° �������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

���� ���, ���� �ٸ� 9���� �ڿ���

3, 29, 38, 12, 57, 74, 40, 85, 61

�� �־�����, �̵� �� �ִ��� 85�̰�, �� ���� 8��° ���̴�.*/

public class Maximum {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[9];
		
		for(int i=0; i<9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		int[] arr2 = new int[9];
		for(int i=0; i<arr.length; i++) {
			arr2[i] = arr[i];
		}
		Arrays.sort(arr2);
		
		int max = arr2[8];
		System.out.println(max);
		
		for(int i=0; i<9; i++) {
			if(arr[i] == max) {
				System.out.println(i+1);
			}
		}

	}

}
