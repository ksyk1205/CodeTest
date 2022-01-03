package programers.level_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class 같은숫자는싫어 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int[] arr = {1,1,3,3,0,1,1};
		
		int[] a =solution(arr);
		System.out.println(Arrays.toString(a));

	}
	public static int[] solution(int[] arr) {
		List<Integer> list = new ArrayList<>();
		list.add(arr[0]);
		for(int i=1; i<arr.length; i++) {
			if(arr[i-1]!=arr[i]) {
				list.add(arr[i]);
			}
		}
		return list.stream().mapToInt(Integer :: intValue).toArray();
	}
}
