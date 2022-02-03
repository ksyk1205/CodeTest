package baekJoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 에너지드링크 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		double[] arr = new double[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		arr = Arrays.stream(arr)
				.boxed()
				.sorted((o1,o2) -> Double.compare(o2,o1))
				.mapToDouble(Double::doubleValue)
				.toArray();
		
		for(int i=1; i<N; i++) {
			double a = arr[i-1];
			double b = arr[i];
			
			arr[i] = a+(b/2);
		}
		
		System.out.println(arr[N-1]);
		
	}

}
