package level_1;

import java.util.Scanner;

public class 수박수박수박수박수박수 {

	public static void main(String[] args) {
		/*
		문제 설명
		길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요. 
		예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.

		제한 조건
		n은 길이 10,000이하인 자연수입니다.
		입출력 예
		n	return
		3	"수박수"
		4	"수박수박"
		*/
		Scanner stdIn = new Scanner(System.in);
		System.out.println("수박을 반복할 n번 수를 입력하세요.");
		int n = stdIn.nextInt();
		
		String answer = solution(n);
		
		System.out.println("n            return");
		System.out.println(n+"             "+answer);

	}
	 public static String solution(int n) {
        String answer = "";
        for(int i=1; i<=n; i++) {
        	if(i%2==0) {
        		answer+="박";
        	}else {
        		answer+="수";
        	}
        }
        return answer;
	  }

}
