package level_1;

import java.util.Arrays;
import java.util.Collections;

public class 정수내림차순으로배치하기 {

	public static void main(String[] args) {
		/*
		문제 설명
		함수 solution은 정수 n을 매개변수로 입력받습니다.
		n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 
		예를들어 n이 118372면 873211을 리턴하면 됩니다.

		제한 조건
		n은 1이상 8000000000 이하인 자연수입니다.
		입출력 예
		n		return
		118372	873211
		*/
		long n = solution(118372);
		System.out.println(n);

	}
	public static long solution(long n) {
		int count=0;
		long temp = n;
		while(temp>0) {
			temp/=10;
			count++;
		}
		Long[] ln = new Long[count];
		for(int i=0; i<ln.length; i++) {
			ln[i] = n%10;
			n/=10;
		}
		
		Arrays.sort(ln,Collections.reverseOrder());
		long answer = 0;
		for(int i=0; i<ln.length; i++) {
			answer*=10;
			answer+=ln[i];
		}
		return answer;
		
    }

}
