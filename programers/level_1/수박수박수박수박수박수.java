package level_1;

import java.util.Scanner;

public class ���ڼ��ڼ��ڼ��ڼ��ڼ� {

	public static void main(String[] args) {
		/*
		���� ����
		���̰� n�̰�, "���ڼ��ڼ��ڼ�...."�� ���� ������ �����ϴ� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ��ϼ���. 
		������� n�� 4�̸� "���ڼ���"�� �����ϰ� 3�̶�� "���ڼ�"�� �����ϸ� �˴ϴ�.

		���� ����
		n�� ���� 10,000������ �ڿ����Դϴ�.
		����� ��
		n	return
		3	"���ڼ�"
		4	"���ڼ���"
		*/
		Scanner stdIn = new Scanner(System.in);
		System.out.println("������ �ݺ��� n�� ���� �Է��ϼ���.");
		int n = stdIn.nextInt();
		
		String answer = solution(n);
		
		System.out.println("n            return");
		System.out.println(n+"             "+answer);

	}
	 public static String solution(int n) {
        String answer = "";
        for(int i=1; i<=n; i++) {
        	if(i%2==0) {
        		answer+="��";
        	}else {
        		answer+="��";
        	}
        }
        return answer;
	  }

}
