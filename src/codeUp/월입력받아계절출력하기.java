package codeUp;

import java.util.Scanner;

public class ���Է¹޾ư�������ϱ� {
//	 ���� �Էµ� �� ���� �̸��� ��µǵ��� �غ���.
//
//	 �� : ���� �̸�
//	 12, 1, 2 : winter
//	  3, 4, 5 : spring
//	  6, 7, 8 : summer
//	  9, 10, 11 : fall
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("���� �Է��ϼ���.");
		int month = stdIn.nextInt();
		
		switch(month) {
			case 12,1,2 :
				System.out.println("winter");
				break;
			case 3,4,5 :
				System.out.println("spring");
				break;
			case 6,7,8 :
				System.out.println("summer");
			    break;
			case 9,10,11 :
				System.out.println("fall");
			    break;
		}
		
	}

}
