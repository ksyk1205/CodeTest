package baekJoon.stage.stringTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CroatiaAlphabet {
//예전에는 운영체제에서 크로아티아 알파벳을 입력할 수가 없었다.
//따라서, 다음과 같이 크로아티아 알파벳을 변경해서 입력했다.	
//	크로아티아 알파벳	변경
//				č	c=
//				ć	c-
//				dž	dz=
//				đ	d-
//				lj	lj
//				nj	nj
//				š	s=
//				ž	z=
	/*
	 * 예를 들어, ljes=njak은 크로아티아 알파벳 6개(lj, e, š, nj, a, k)로 이루어져 있다. 
	 * 단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
	 * 
	 * dž는 무조건 하나의 알파벳으로 쓰이고, d와 ž가 분리된 것으로 보지 않는다.
	 *  lj와 nj도 마찬가지이다. 위 목록에 없는 알파벳은 한글자씩 센다.
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int cnt = 0;
		for(int i=0; i<str.length(); i++) {
			
			if(str.charAt(i) == 'c') {
				if(i<str.length()-1) {
					if(str.charAt(i+1) =='=') {
						i++;
					}else if(str.charAt(i+1) =='-') {
						i++;
					}
				}
				
			}else if(str.charAt(i)=='d') {
				if(i<str.length()-1) {
					if(str.charAt(i+1)=='-') {
						i++;
					}else if(str.charAt(i+1)=='z') {
						if(i+1<str.length()-1) {
							if(str.charAt(i+2)=='=') {
								i+=2;
							}
						}
					}
				}
			}else if(str.charAt(i)=='l' || str.charAt(i)=='n') {
				if(i<str.length()-1) {
					if(str.charAt(i+1) == 'j') {
						i++;
					}
				}
			}else if(str.charAt(i)=='s'||str.charAt(i)=='z') {
				if(i<str.length()-1) {
					if(str.charAt(i+1) == '=') {
						i++;
					}
				}
			}
			cnt++;
			
		}
		System.out.println(cnt);
	}

}
