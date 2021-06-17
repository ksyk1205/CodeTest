package level_1;

import java.util.Scanner;

public class _3���������� {

	public static void main(String[] args) {
		/*
		���� ����
		�ڿ��� n�� �Ű������� �־����ϴ�. 
		n�� 3���� �󿡼� �յڷ� ������ ��, �̸� �ٽ� 10�������� ǥ���� ���� return �ϵ��� solution �Լ��� �ϼ����ּ���.

		���ѻ���
		n�� 1 �̻� 100,000,000 ������ �ڿ����Դϴ�.
		����� ��
		n	result
		45	7
		125	229
		����� �� ����
		����� �� #1

		���� �����ϴ� ������ ������ �����ϴ�.
		n (10����)	n (3����)	�յ� ����(3����)	10�������� ǥ��
		45	1200	0021	7
		���� 7�� return �ؾ� �մϴ�.
		����� �� #2

		���� �����ϴ� ������ ������ �����ϴ�.
		n (10����)	n (3����)	�յ� ����(3����)	10�������� ǥ��
		125			11122		22111			229
		���� 229�� return �ؾ� �մϴ�.
		*/
		Scanner stdIn = new Scanner(System.in);
		System.out.print("n ���� �Է��ϼ���.");
		int n = stdIn.nextInt();
		
		int num = solution(n);
		System.out.println("n       return");
		System.out.println(n+"       "+num);

	}
	 public static int solution(int n) {
		 String result="";
	     while(n>0) {
	    	result += n%3;
	    	n/=3;
	     }
	     int answer =0;
	     for(int i=0; i<result.length(); i++) {
	    	 answer+=Math.pow(3, i) * (Character.getNumericValue(result.charAt(result.length()-i-1)));
	     }
	     return answer;
	 }
	 

}
