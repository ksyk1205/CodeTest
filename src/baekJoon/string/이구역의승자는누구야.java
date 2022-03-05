package baekJoon.string;

import java.util.Scanner;

public class 이구역의승자는누구야 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		int[] arr = {3, 2, 1, 2, 3, 3, 3, 3, 1, 1, 3, 1, 3, 3, 
				1, 2, 2, 2, 1, 2, 1, 1, 2, 2, 2, 1};
		
		int[] answer = new int[str.length()];
		for(int i=0; i<answer.length; i++) {
			answer[i] = arr[str.charAt(i)-'A'];
		}
		int sum = 0;
		for(int i=0; i<answer.length; i++) {
			sum += answer[i];
			sum%=10;
		}
		
		if(sum%2==0) {
			System.out.println("You're the winner?");
		}else {
			System.out.println("I'm a winner!");
		}
		
	}
}
