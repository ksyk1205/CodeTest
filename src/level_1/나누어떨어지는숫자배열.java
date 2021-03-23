package level_1;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ����������¼��ڹ迭 {

	public static void main(String[] args) {
		/*
		���� ����
		array�� �� element �� divisor�� ������ �������� ���� ������������ ������ �迭�� ��ȯ�ϴ� �Լ�, solution�� �ۼ����ּ���.
		divisor�� ������ �������� element�� �ϳ��� ���ٸ� �迭�� -1�� ��� ��ȯ�ϼ���.

		���ѻ���
		arr�� �ڿ����� ���� �迭�Դϴ�.
		���� i, j�� ���� i �� j �̸� arr[i] �� arr[j] �Դϴ�.
		divisor�� �ڿ����Դϴ�.
		array�� ���� 1 �̻��� �迭�Դϴ�.
		����� ��
		arr	divisor	return
		[5, 9, 7, 10]	5	[5, 10]
		[2, 36, 1, 3]	1	[1, 2, 3, 36]
		[3,2,6]	10	[-1]
		����� �� ����
		����� ��#1
		arr�� ���� �� 5�� ������ �������� ���Ҵ� 5�� 10�Դϴ�. ���� [5, 10]�� �����մϴ�.

		����� ��#2
		arr�� ��� ���Ҵ� 1���� ������ �������ϴ�. ���Ҹ� ������������ ������ [1, 2, 3, 36]�� �����մϴ�.

		����� ��#3
		3, 2, 6�� 10���� ������ �������� �ʽ��ϴ�. ������ �������� ���Ұ� �����Ƿ� [-1]�� �����մϴ�.
		*/
		int[] arr = {5,9,7,10};
		int divisor =5;
		int[] answer = solution(arr,divisor);
		
		System.out.println(Arrays.toString(answer));
	}
	public static int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<arr.length; i++) {
        	if(arr[i]%divisor==0) {
        		list.add(arr[i]);
        	}
        }
      
        if(list.size() == 0) {
        	int[] arry = {-1};
        	return arry;
        }else {
        	int[] arry = new int[list.size()];
        	for(int i=0; i<arry.length; i++) {
        		arry[i] = list.get(i);
        	}
        	Arrays.sort(arry);
        	return arry;
        }
        
    }

}
