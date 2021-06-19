package level2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ¿ÏÀü¼ö {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
	      String n1 = stdIn.nextLine();
	      int a = Integer.parseInt(n1.split(" ")[0]);
	      int b = Integer.parseInt(n1.split(" ")[1]);
	      
	      solution(a,b);
	      		
	}
	public static void  solution(int a, int b) {
		List<Integer> arr = new ArrayList<>();
		
		for(int i=a; i<b; i++){
			int sum = 0;
			for(int j=1; j<i; j++) {
				if(i%j == 0) {
					sum+=j;
				}
			}
			if(i == sum) {
				arr.add(i);
			}
		}
		for(int i=0; i<arr.size(); i++) {
			System.out.print(arr.get(i)+" ");
		}
	}
		
}
