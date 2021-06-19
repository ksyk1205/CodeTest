package level2;

import java.util.Scanner;

public class 문자열뒤집기 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String str = stdIn.next();
		
		String answer = strReverse(str);
		System.out.println(answer);
		
		
	}
	public static String strReverse(String str){
		String[] arr = str.split("");
		StringBuilder strbuilder = new StringBuilder();
		for(int i=0; i<str.length(); i++){
					strbuilder.append(arr[str.length()-i-1]);
		}
		String answer = strbuilder.toString();
		return answer;
	}

}
