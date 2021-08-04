package programers.level_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class �������ڴ½Ⱦ� {

	public static void main(String[] args) {
		/*
		���� ����
		�迭 arr�� �־����ϴ�. �迭 arr�� �� ���Ҵ� ���� 0���� 9������ �̷���� �ֽ��ϴ�. 
		�̶�, �迭 arr���� ���������� ��Ÿ���� ���ڴ� �ϳ��� ����� ���� �����Ϸ��� �մϴ�. 
		��, ���ŵ� �� ���� ������ ��ȯ�� ���� �迭 arr�� ���ҵ��� ������ �����ؾ� �մϴ�. ���� ���,

		arr = [1, 1, 3, 3, 0, 1, 1] �̸� [1, 3, 0, 1] �� return �մϴ�.
		arr = [4, 4, 4, 3, 3] �̸� [4, 3] �� return �մϴ�.
		�迭 arr���� ���������� ��Ÿ���� ���ڴ� �����ϰ� ���� ������ return �ϴ� solution �Լ��� �ϼ��� �ּ���.

		���ѻ���
		�迭 arr�� ũ�� : 1,000,000 ������ �ڿ���
		�迭 arr�� ������ ũ�� : 0���� ũ�ų� ���� 9���� �۰ų� ���� ����
		����� ��
		arr				answer
		[1,1,3,3,0,1,1]	[1,3,0,1]
		[4,4,4,3,3]		[4,3]
		����� �� ����
		����� �� #1,2
		������ ���ÿ� �����ϴ�.
		*/
		Scanner stdIn = new Scanner(System.in);
		
//		System.out.println("�迭 ��� �� ? ");
//		int n = stdIn.nextInt();
//		int[] arr = new int[n];
//		
//		for(int i=0; i<n; i++) {
//			System.out.println("arr["+i+"]");
//			arr[i] = stdIn.nextInt();
//		}
		int[] arr = {4,4,4,3,3};
		
		int[] a =solution(arr);
		System.out.println(Arrays.toString(a));

	}
	public static int[] solution(int[] arr) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(arr[0]);
		for(int i=1; i<arr.length; i++) {
			if(arr[i]!=arr[i-1]) {
				list.add(arr[i]);
			}
		}
		int[] answer = new int[list.size()];
		for(int i=0; i<answer.length; i++) {
			answer[i] = list.get(i);
		}
		
		return answer;
	}
}
