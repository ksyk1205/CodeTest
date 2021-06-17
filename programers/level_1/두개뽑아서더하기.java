package level_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class �ΰ��̾Ƽ����ϱ� {

	public static void main(String[] args) {
		/*
		���� ����
		���� �迭 numbers�� �־����ϴ�. 
		numbers���� ���� �ٸ� �ε����� �ִ� �� ���� ���� �̾� ���ؼ� ���� �� �ִ� ��� ���� �迭�� ������������ ��� return �ϵ��� solution �Լ��� �ϼ����ּ���.

		���ѻ���
		numbers�� ���̴� 2 �̻� 100 �����Դϴ�.
		numbers�� ��� ���� 0 �̻� 100 �����Դϴ�.
		����� ��
		numbers		result
		[2,1,3,4,1]	[2,3,4,5,6,7]
		[5,0,2,7]	[2,5,7,9,12]
		����� �� ����
		����� �� #1

		2 = 1 + 1 �Դϴ�. (1�� numbers�� �� �� �ֽ��ϴ�.)
		3 = 2 + 1 �Դϴ�.
		4 = 1 + 3 �Դϴ�.
		5 = 1 + 4 = 2 + 3 �Դϴ�.
		6 = 2 + 4 �Դϴ�.
		7 = 3 + 4 �Դϴ�.
		���� [2,3,4,5,6,7] �� return �ؾ� �մϴ�.
		����� �� #2

		2 = 0 + 2 �Դϴ�.
		5 = 5 + 0 �Դϴ�.
		7 = 0 + 7 = 5 + 2 �Դϴ�.
		9 = 2 + 7 �Դϴ�.
		12 = 5 + 7 �Դϴ�.
		���� [2,5,7,9,12] �� return �ؾ� �մϴ�.
		*/
		int[] numbers = {2,1,3,4,1};
		int[] solution = solution(numbers);
		
		System.out.println(Arrays.toString(solution));

	}
	public static int[] solution(int[] numbers) {
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<numbers.length-1; i++) {
			for(int j=i+1; j<numbers.length; j++) {
				int sum = numbers[i]+numbers[j];
				if(list.indexOf(sum)<0) {
					list.add(sum);
				}
			}
		}
		int[] answer = new int[list.size()];
		for(int i=0; i<list.size(); i++) {
			answer[i] =list.get(i);
		}
		Arrays.sort(answer);
		
		return answer;
		
    }

}
