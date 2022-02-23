package javaAlgorithms.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 단어뒤집기 {
	static List<String> list = new ArrayList<>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] arr = new String[N];
		for(int i=0; i<N; i++) {
			arr[i] = sc.next();
		}
		solution(arr);
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	private static void solution(String[] arr) {
		for(String s : arr) {
			char[] strArr = s.toCharArray();
			int lt = 0;
			int rt = strArr.length-1;
			while(lt<rt) {
				char tmp = strArr[lt];
				strArr[lt] = strArr[rt];
				strArr[rt] = tmp;
				lt++;
				rt--;
			}
			list.add(String.valueOf(strArr));
		}
	}
}
