package baekJoon.implementation;

import java.util.Scanner;

/*���� ������ �Է¹޾� 90 ~ 100���� A, 
 *80 ~ 89���� B,
 *70 ~ 79���� C, 
 *60 ~ 69���� D, 
 *������ ������ F�� 
 *����ϴ� ���α׷��� �ۼ��Ͻÿ�.*/

public class TestResults {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		
		if(score>=90&&score<=100) {
			System.out.println("A");
		}else if(score>=80&&score<=89) {
			System.out.println("B");
		}else if(score>=70&&score<=79) {
			System.out.println("C");
		}else if(score>=60&&score<=69) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	}

}
