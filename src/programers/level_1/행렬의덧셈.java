package programers.level_1;

import java.util.Arrays;
import java.util.Scanner;

public class ����ǵ��� {

	public static void main(String[] args) {
		/*
		���� ����
		����� ������ ��� ���� ũ�Ⱑ ���� �� ����� ���� ��, ���� ���� ���� ���� ���� ����� �˴ϴ�. 
		2���� ��� arr1�� arr2�� �Է¹޾�, ��� ������ ����� ��ȯ�ϴ� �Լ�, solution�� �ϼ����ּ���.

		���� ����
		��� arr1, arr2�� ��� ���� ���̴� 500�� ���� �ʽ��ϴ�.
		����� ��
		arr1			arr2			return
		[[1,2],[2,3]]	[[3,4],[5,6]]	[[4,6],[7,9]]
		[[1],[2]]		[[3],[4]]		[[4],[6]]
		*/
		Scanner stdIn = new Scanner(System.in);
		System.out.println("arr1�� �Է��ϼ���");
		int[][] arr1 = new int[1][1];
		for(int i=0; i<1; i++) {
			for(int j=0; j<1; j++) {
				System.out.println("arr1["+i+"]["+j+"]");
				arr1[i][j]= stdIn.nextInt();
			}
		}
		System.out.println("arr2�� �Է��ϼ���");
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
