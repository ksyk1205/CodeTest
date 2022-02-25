package javaAlgorithms.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 뒤집은소수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		for(int num : solution(N, arr)) {
			System.out.print(num+" ");
		}
	}

	private static List<Integer> solution(int n, int[] arr) {
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<n; i++) {
			int num = arr[i];
			int res=0;
			while(num>0) {
				res*=10;
				res += num%10;
				num/=10;
			}
			if(isPrime(res)) {
				list.add(res);
			}
		
		}
		return list;
	}

	private static boolean isPrime(int res) {
		if(res==1) {
			return false;
		}
		for(int i=2; i<res; i++) {
			if(res%i==0) {
				return false;
			}
		}
		return true;
	}
}
