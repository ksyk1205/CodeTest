package programers.level_1;

import java.util.Scanner;

public class _2016년 {

	public static void main(String[] args) {
		/*
		문제 설명
		2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요? 
		두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요.
		요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT	입니다. 
		예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 "TUE"를 반환하세요.

		제한 조건
		2016년은 윤년입니다.
		2016년 a월 b일은 실제로 있는 날입니다. (13월 26일이나 2월 45일같은 날짜는 주어지지 않습니다)
		입출력 예
		a	b	result
		5	24	"TUE"
		*/
		Scanner stdIn = new Scanner(System.in);
		System.out.print("몇 월?"); int a = stdIn.nextInt();
		System.out.print("몇 일?"); int b = stdIn.nextInt();
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
