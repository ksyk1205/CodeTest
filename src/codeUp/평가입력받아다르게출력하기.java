package codeUp;

import java.util.Scanner;

public class ���Է¹޾ƴٸ�������ϱ� {
//	�򰡸� ����(A, B, C, D, ...)�� �Է¹޾� ������ �ٸ��� ����غ���.
//
//	�� ����
//	�� : ����
//	A : best!!!
//	B : good!!
//	C : run!
//	D : slowly~
//	������ ���ڵ� : what?
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("���� ���ڸ� �Է��ϼ���.  ");
		String alphabet = stdIn.next();
		
		if(alphabet.equals("A")) {
			System.out.println("best!!!");
		}else if(alphabet.equals("B")) {
			System.out.println("goods!!");
		}else if(alphabet.equals("C")) {
			System.out.println("run!");
		}else if(alphabet.equals("D")) {
			System.out.println("slowly~");
		}else {
			System.out.println("what?");
		}
	}
}
