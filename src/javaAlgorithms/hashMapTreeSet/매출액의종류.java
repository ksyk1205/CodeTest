package javaAlgorithms.hashMapTreeSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class 매출액의종류 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		List<Integer> answer = solution(N, K, arr);
		
		for(int num : answer) {
			System.out.print(num+" ");
		}
	}

	private static List<Integer> solution(int n, int k, int[] arr) {
		List<Integer> answer = new ArrayList<>();
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i=0; i<k-1; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		
		int lt = 0;
		for(int rt=k-1; rt<n; rt++) {
			map.put(arr[rt], map.getOrDefault(arr[rt], 0)+1);
			
			answer.add(map.size());
			
			if(map.get(arr[lt])>1) {
				map.put(arr[lt], map.get(arr[lt])-1);
			}else {
				map.remove(arr[lt]);
			}
			lt++;
		}
		
		return answer;
	}
}
