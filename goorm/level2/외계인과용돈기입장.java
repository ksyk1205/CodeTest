package level2;

import java.util.Scanner;

public class 외계인과용돈기입장 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String num = stdIn.nextLine();
		int N = Integer.parseInt(num.split(" ")[0]);
		int M = Integer.parseInt(num.split(" ")[1]);
		
		String H = stdIn.nextLine();
		int[] arr = new int[N];
		for(int i=0; i<N; i++){
			arr[i] = Integer.parseInt(H.split(" ")[i]);
		}
		int[][] arr2 = new int[M][2];
		for(int i=0; i<M; i++) {
			String K = stdIn.nextLine();
			arr2[i][0] = Integer.parseInt(K.split(" ")[0]);
			arr2[i][1] = Integer.parseInt(K.split(" ")[1]);
		}
		
		solution(N, M, arr, arr2);

		
	}
	public static void solution(int N, int M, int[] arr, int[][] arr2) {
		for(int i=0; i<M; i++) {
			int a = arr2[i][0];
			int b = arr2[i][1];
			int sum =0;
			for(int j=a-1; j<b; j++) {
				sum +=arr[j];
			}
			System.out.println(sum);
		}
	}

}
