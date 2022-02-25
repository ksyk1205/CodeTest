package javaAlgorithms.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 피보나치수열 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int num : solution(N)) {
			System.out.print(num+" ");
		}
	}

	private static List<Integer> solution(int n) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(1);
		
		for(int i=2; i<n; i++) {
			list.add(list.get(i-2)+list.get(i-1));
		}
		
		return list;
	}
}
