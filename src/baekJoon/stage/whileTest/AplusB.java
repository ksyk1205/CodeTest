package baekJoon.stage.whileTest;

import java.util.Scanner;
/*두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.*/
public class AplusB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=0 , b=0;
	     while(true) {
	    	  a = sc.nextInt();
	      	  b = sc.nextInt();
	      	
	      	if(a == 0 && b==0) {
	      		break;
	      	}else {
	      		System.out.println(a+b);
	      	}
	     }
			
	}
}