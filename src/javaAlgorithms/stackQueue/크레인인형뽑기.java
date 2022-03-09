package javaAlgorithms.stackQueue;

import java.util.Scanner;
import java.util.Stack;

public class 크레인인형뽑기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] board = new int[N][N];
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				board[i][j] = sc.nextInt();
			}
		}
		
		int M = sc.nextInt();
		int[] moves = new int[M];
		for(int i=0; i<M; i++) {
			moves[i] = sc.nextInt();
		}
		
		System.out.println(solution(N, board, M, moves));
	}

	private static int solution(int n, int[][] board, int m, int[] moves) {
		int answer = 0;
		
		Stack<Integer> stack = new Stack<>();
		
		for(int pos : moves) {
			for(int i=0; i<n; i++) {
				if(board[i][pos-1]!=0) {
					int num = board[i][pos-1];
					board[i][pos-1] = 0;
					
					if(!stack.isEmpty() && stack.peek()==num) {
						answer+=2;
						stack.pop();
					}else {
						stack.push(num);
					}
					break;
				}
			}
		}
		return answer;
	}
}
