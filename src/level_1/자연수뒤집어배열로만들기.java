package level_1;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class �ڿ���������迭�θ���� {
	public static void main(String[] args) {
		/*
		���� ����
		�ڿ��� n�� ������ �� �ڸ� ���ڸ� ���ҷ� ������ �迭 ���·� �������ּ���. ������� n�� 12345�̸� [5,4,3,2,1]�� �����մϴ�.

		���� ����
		n�� 10,000,000,000������ �ڿ����Դϴ�.
		����� ��
		n	return
		12345	[5,4,3,2,1]	
		*/
		Scanner stdIn = new Scanner(System.in);
		System.out.print("�ڿ����� n �Է��ϼ���");
		long n = stdIn.nextLong();
		
		int[] answer = solution(n);
		
		System.out.println("n        return");
		System.out.println(n+"      "+Arrays.toString(answer));
		

	}
	public static int[] solution(long n) {
		List<Long> list = new ArrayList<Long>();
		while(n>0) {
			list.add(n%10);
			n/=10;
		}
		int[] answer =new int[list.size()];
		
		for(int i=0; i<list.size(); i++) {
			answer[i] = list.get(i).intValue();
		}
		return answer;
	}
}
