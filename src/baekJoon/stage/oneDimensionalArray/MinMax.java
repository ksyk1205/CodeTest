package baekJoon.stage.oneDimensionalArray;

import java.util.Arrays;
import java.util.Scanner;

public class MinMax {
	/* N���� ������ �־�����. �̶�, �ּڰ��� �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		System.out.print(arr[0]+" "+arr[n-1]);
	}

}
