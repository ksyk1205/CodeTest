package programers.level_1;

import java.util.Scanner;

public class 직사각형별찍기 {

	public static void main(String[] args) {
		/*
		문제 설명
		이 문제에는 표준 입력으로 두 개의 정수 n과 m이 주어집니다.
		별(*) 문자를 이용해 가로의 길이가 n, 세로의 길이가 m인 직사각형 형태를 출력해보세요.

		제한 조건
		n과 m은 각각 1000 이하인 자연수입니다.
		예시
		입력

		5 3
		출력

		*****
		*****
		*****
		*/
		
		Scanner sc = new Scanner(System.in);
        
		int m = sc.nextInt(); //세로길이(행)
		int n = sc.nextInt(); //가로길이(렬)
        
        
       for(int i=0; i<m; i++) {
    	   for(int j=0; j<n; j++) {
    		   System.out.print("*");
    	   }
    	   System.out.println();
       }
        
	}

}
