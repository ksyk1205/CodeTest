package level_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ���ǰ�� {

	public static void main(String[] args) {
		/*
		���� ����
		�����ڴ� ������ ������ ����� �ظ��Դϴ�. 
		������ ���ι��� ���ǰ�翡 ���� ������ ���� ������ �մϴ�. 
		�����ڴ� 1�� �������� ������ �������� ������ ���� ����ϴ�.

		1�� �����ڰ� ��� ���: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
		2�� �����ڰ� ��� ���: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
		3�� �����ڰ� ��� ���: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

		1�� �������� ������ ���������� ������ ������� ���� �迭 answers�� �־����� ��, 
		���� ���� ������ ���� ����� �������� �迭�� ��� return �ϵ��� solution �Լ��� �ۼ����ּ���.

		���� ����
		������ �ִ� 10,000 ������ �����Ǿ��ֽ��ϴ�.
		������ ������ 1, 2, 3, 4, 5�� �ϳ��Դϴ�.
		���� ���� ������ ���� ����� ������ ���, return�ϴ� ���� �������� �������ּ���.
		����� ��
		answers		return
		[1,2,3,4,5]	[1]
		[1,3,2,4,2]	[1,2,3]
		����� �� ����
		����� �� #1

		������ 1�� ��� ������ �������ϴ�.
		������ 2�� ��� ������ Ʋ�Ƚ��ϴ�.
		������ 3�� ��� ������ Ʋ�Ƚ��ϴ�.
		���� ���� ������ ���� ���� ����� ������ 1�Դϴ�.

		����� �� #2

		��� ����� 2�������� ������ϴ�.
		*/
		int[] answers = {1,3,2,4,2};
		int[] solution  = solution(answers);
		
		System.out.println(Arrays.toString(solution));
		
	}
	public static int[] solution(int[] answers) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,1,2,3,2,4,2,5};
        int[] arr3 = {3,3,1,1,2,2,4,4,5,5};
        
        int min1 = 0;
        int min2 = 0;
        int min3 = 0;
        for(int i=0; i<answers.length; i++) {
        	if(answers[i] == arr1[i%arr1.length]) {
        		min1++;
        	}
        	if(answers[i] == arr2[i%arr2.length]) {
        		min2++;
        	}
        	if(answers[i] == arr3[i%arr3.length]) {
        		min3++;
        	}
        }
        int max = Math.max(Math.max(min1, min2),min3);
        List<Integer> list = new ArrayList<Integer>();
        if(max == min1) {
        	list.add(1);
        }
        if(max == min2) {
        	list.add(2);
        }
        if(max == min3) {
        	list.add(3);
        }
        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++) {
        	answer[i] = list.get(i);
        }
        return answer;
        
    }

}
