package baekJoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*이와 같이 나열된 분수들을 1/1 → 1/2 → 2/1 → 3/1 → 2/2 → … 과 같은 
 *지그재그 순서로 차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자.

X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.
*/
public class FindFractionalNumbers {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());
		
		int sum = 0;
		int first = 0;
		int index = 0;
		
		for(int i=1; i<=X; i++) {
			sum += i;
			if(sum >= X) { 
				first = sum-(i-1);
				index = i;
				break;
			}
		}
		
		for(int j=1; j<=index; j++) {
			if(first == X) {
				
				if(index%2==0) {
					System.out.println(j+"/"+(index-j+1));
				}else {
					System.out.println((index-j+1)+"/"+j);
				}
				break;
			}
			first++;
		}

	}
}
