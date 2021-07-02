package codeUp;

import java.util.Scanner;

public class 월입력받아계절출력하기 {
//	 월이 입력될 때 계절 이름이 출력되도록 해보자.
//
//	 월 : 계절 이름
//	 12, 1, 2 : winter
//	  3, 4, 5 : spring
//	  6, 7, 8 : summer
//	  9, 10, 11 : fall
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("월을 입력하세요.");
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
