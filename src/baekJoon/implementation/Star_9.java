package baekJoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Star_9 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int z=0; z<2*(N-i)-1; z++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=N-2; i>=0; --i) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<2*(N-i)-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
