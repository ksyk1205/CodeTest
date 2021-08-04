package programers.level_1;

import java.util.Arrays;
import java.util.Scanner;

public class 행렬의덧셈 {

	public static void main(String[] args) {
		/*
		문제 설명
		행렬의 덧셈은 행과 열의 크기가 같은 두 행렬의 같은 행, 같은 열의 값을 서로 더한 결과가 됩니다. 
		2개의 행렬 arr1과 arr2를 입력받아, 행렬 덧셈의 결과를 반환하는 함수, solution을 완성해주세요.

		제한 조건
		행렬 arr1, arr2의 행과 열의 길이는 500을 넘지 않습니다.
		입출력 예
		arr1			arr2			return
		[[1,2],[2,3]]	[[3,4],[5,6]]	[[4,6],[7,9]]
		[[1],[2]]		[[3],[4]]		[[4],[6]]
		*/
		Scanner stdIn = new Scanner(System.in);
		System.out.println("arr1을 입력하세요");
		int[][] arr1 = new int[1][1];
		for(int i=0; i<1; i++) {
			for(int j=0; j<1; j++) {
				System.out.println("arr1["+i+"]["+j+"]");
				arr1[i][j]= stdIn.nextInt();
			}
		}
		System.out.println("arr2을 입력하세요");
		int[][] arr2 = new int[1][1];
		for(int i=0; i<1; i++) { 
			for(int j=0; j<1; j++) {
				System.out.println("arr2["+i+"]["+j+"]");
				arr2[i][j]= stdIn.nextInt();
			}
		}
		
		int[][] solution = solution(arr1,arr2);
		
		for(int i=0; i<solution.length; i++) { 
			for(int j=0; j<solution[i].length; j++) {
				System.out.println(solution[i][j]);
			}
		}
		
	}
	public static int[][] solution(int[][] arr1, int[][] arr2) {
		int[][] answer = arr1;
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr1[i].length; j++){
                answer[i][j] = arr1[i][j] +arr2[i][j];
            }
        }
        
        return answer;
    }

}
