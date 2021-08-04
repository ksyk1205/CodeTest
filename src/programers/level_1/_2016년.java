package programers.level_1;

import java.util.Scanner;

public class _2016�� {

	public static void main(String[] args) {
		/*
		���� ����
		2016�� 1�� 1���� �ݿ����Դϴ�. 2016�� a�� b���� ���� �����ϱ��? 
		�� �� a ,b�� �Է¹޾� 2016�� a�� b���� ���� �������� �����ϴ� �Լ�, solution�� �ϼ��ϼ���.
		������ �̸��� �Ͽ��Ϻ��� ����ϱ��� ���� SUN,MON,TUE,WED,THU,FRI,SAT	�Դϴ�. 
		���� ��� a=5, b=24��� 5�� 24���� ȭ�����̹Ƿ� ���ڿ� "TUE"�� ��ȯ�ϼ���.

		���� ����
		2016���� �����Դϴ�.
		2016�� a�� b���� ������ �ִ� ���Դϴ�. (13�� 26���̳� 2�� 45�ϰ��� ��¥�� �־����� �ʽ��ϴ�)
		����� ��
		a	b	result
		5	24	"TUE"
		*/
		Scanner stdIn = new Scanner(System.in);
		System.out.print("�� ��?"); int a = stdIn.nextInt();
		System.out.print("�� ��?"); int b = stdIn.nextInt();
		String s = solution(a,b);
		System.out.println(s);

	}
	public static String solution(int a, int b) {
       String[] week = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
       int sum=0;
       for(int i=1; i<a; i++) {
    	   if(i==4||i==6||i==9||i==11) {
    		   sum+=30;
    	   }else if(i==2) {
    		   sum+=29;
    	   }else {
    		   sum+=31;
    	   }
       }
        return week[(sum+4+b)%7];

    }

}
