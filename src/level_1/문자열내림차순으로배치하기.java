package level_1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ���ڿ������������ι�ġ�ϱ� {

	public static void main(String[] args) {
		/*
		���� ����
		���ڿ� s�� ��Ÿ���� ���ڸ� ū�ͺ��� ���� ������ ������ ���ο� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ����ּ���.
		s�� ���� ��ҹ��ڷθ� �����Ǿ� ������, �빮�ڴ� �ҹ��ں��� ���� ������ �����մϴ�.

		���� ����
		str�� ���� 1 �̻��� ���ڿ��Դϴ�.
		����� ��
		s	return
		"Zbcdefg"	"gfedcbZ"
		*/
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("���ڿ��� �Է��ϼ���.");
		String s = stdIn.next();
		String answer = solution(s);
		System.out.println(answer);
	}
	 public static String solution(String s) {
		 String[] array = s.split("");
     
		 //������������ ���� Collections.reverseOrder()
		 Arrays.sort(array, Collections.reverseOrder());
	     
	     return String.join("",array);
	     //String.join("�߰��� ���","���List�� Aarray")-String���� �ٲ���
	 }

}
