package programers.level_1;

import java.util.Arrays;
import java.util.Scanner;

public class ���������������ϱ� {

	public static void main(String[] args) {
		/*
		���� ����
		������ ������ �迭, arr ���� ���� ���� ���� ������ �迭�� �����ϴ� �Լ�, solution�� �ϼ����ּ���.
		��, �����Ϸ��� �迭�� �� �迭�� ��쿣 �迭�� -1�� ä�� �����ϼ���. 
		������� arr�� [4,3,2,1]�� ���� [4,3,2]�� ���� �ϰ�, 
		[10]�� [-1]�� ���� �մϴ�.

		���� ����
		arr�� ���� 1 �̻��� �迭�Դϴ�.
		�ε��� i, j�� ���� i �� j�̸� arr[i] �� arr[j] �Դϴ�.
		����� ��
		arr	return
		[4,3,2,1]	[4,3,2]
		[10]	[-1]
		*/
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�迭�� ��� ��?");
		int num = stdIn.nextInt();
		
		int[] arr = new int[num];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("arr["+i+"]");
			arr[i] = stdIn.nextInt();
		}
		int[] solution  = solution(arr);
	
		Arrays.toString(solution);
		
		
	}
	public static int[] solution(int[] arr) {
        if(arr.length ==1) {
        	int[] answer = {-1};
        	return answer;
        }
		
		int min = arr[0];
        for(int i=1; i<=arr.length-1; i++) {
        	if(arr[i]<min) {
        		min = arr[i];
        	}
        }
		
		int[] answer = new int[arr.length-1];
        int count =0;
		for(int i=0; i<arr.length; i++) {
        	if(arr[i] == min) {
        		continue;
        	}
        	answer[count++]= arr[i];
        }
		
        return answer;
    }

}
