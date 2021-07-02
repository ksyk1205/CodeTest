package codeUp;

import java.util.Scanner;

public class Â¦¼öÇÕ±¸ÇÏ±â {
//	Á¤¼ö(1 ~ 100) 1°³¸¦ ÀÔ·Â¹Ş¾Æ 1ºÎÅÍ ±× ¼ö±îÁö Â¦¼öÀÇ ÇÕÀ» ±¸ÇØº¸ÀÚ.
//	
//	ÀÔ·Â
//	Á¤¼ö 1°³°¡ ÀÔ·ÂµÈ´Ù.
//	(0 ~ 100)
//
//	Ãâ·Â
//	1ºÎÅÍ ±× ¼ö±îÁö Â¦¼ö¸¸ ÇÕÇØ Ãâ·ÂÇÑ´Ù.
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("Á¤¼ö¸¦ ÀÔ·ÂÇÏ¼¼¿ä.");
		int num = stdIn.nextInt();
		int sum = 0;
		for(int i=1; i<=num; i++) {
			if(i%2==0) {
				sum+=i;
			}
		}
		System.out.println("1ºÎÅÍ"+num+"±îÁö Â¦¼öÀÇ ÇÕ¸¸ ­„·ÂÇÑ´Ù.");
		System.out.println(sum);
	}

}
