package level_1;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 자연수뒤집어배열로만들기 {
	public static void main(String[] args) {
		/*
		문제 설명
		자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

		제한 조건
		n은 10,000,000,000이하인 자연수입니다.
		입출력 예
		n	return
		12345	[5,4,3,2,1]	
		*/
		Scanner stdIn = new Scanner(System.in);
		System.out.print("자연수를 n 입력하세요");
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
