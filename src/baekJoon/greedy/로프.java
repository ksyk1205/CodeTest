package baekJoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ทฮวม {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		arr = Arrays.stream(arr)
				.boxed()
				.sorted((o1,o2) -> o2-o1)
				.mapToInt(Integer::intValue)
				.toArray();
		
		int result = arr[0];
		for(int i=1; i<N; i++) {
			if(result<arr[i]*(i+1)) {
				result = arr[i]*(i+1); 
			}
		}
		System.out.println(result);
	}

}
