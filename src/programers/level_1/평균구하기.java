package programers.level_1;

import java.util.Arrays;
import java.util.Scanner;

public class ��ձ��ϱ� {
	public static void main(String[] arg) {
	/*
	���� ����
	������ ��� �ִ� �迭 arr�� ��հ��� return�ϴ� �Լ�, solution�� �ϼ��غ�����.

	���ѻ���
	arr�� ���� 1 �̻�, 100 ������ �迭�Դϴ�.
	arr�� ���Ҵ� -10,000 �̻� 10,000 ������ �����Դϴ�.
	����� ��
	arr	return
	[1,2,3,4]	2.5
	[5,5]	5
	*/
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("����� ���� ������ �迭�� ��������");
		System.out.print("�迭�� ��Ҵ� ? ");
		int n = stdIn.nextInt();
		
		int[] arr = new int[n];
		for(int i=0; i<arr.length; i++) {
			System.out.print("arr["+i+"]  : ");
			arr[i] = stdIn.nextInt();
		}
		double b = solution(arr);
		
		System.out.println("arr              return");
		System.out.println(Arrays.toString(arr)+"        "+b);
		
		
	}
	 public static double solution(int[] arr) {
	        double answer = 0;
	        for(int i=0; i<arr.length; i++) {
	        	answer+=arr[i];
	        }
	        
	        return answer/arr.length;
	 }
	 //java8 �� �߰��� api 
	 //Arrays.stream(array).average().orElse(0);
}
