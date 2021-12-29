package programers.level_1;

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
		int[] answers = {1,2,3,4,5};
		int[] solution  = solution(answers);
		
		System.out.println(Arrays.toString(solution));
		
	}
	public static int[] solution(int[] answers) {
		int[] math1 = {1,2,3,4,5};
        int[] math2 = {2,1,2,3,2,4,2,5};
        int[] math3 = {3,3,1,1,2,2,4,4,5,5};
        
        int result1 = 0;
        int result2 = 0;
        int result3 = 0;
        for(int i=0; i<answers.length; i++){
            if(answers[i]==math1[i%math1.length]) result1++;
            if(answers[i]==math2[i%math2.length]) result2++;
            if(answers[i]==math3[i%math3.length]) result3++;
            
        }
        
        int max = Math.max(Math.max(result1,result2),result3);
        
        List<Integer> list = new ArrayList<>();
        if(max == result1) list.add(1);
        if(max == result2) list.add(2);
        if(max == result3) list.add(3);
        
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
        
    }

}
