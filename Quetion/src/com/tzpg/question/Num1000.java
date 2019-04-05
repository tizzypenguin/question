package com.tzpg.question;

import java.util.Scanner;

/*
 * ���� 1000
 * �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
public class Num1000 extends Thread{

	@Override
	public void run() {
		Scanner scan = new Scanner(System.in);
		String org = scan.nextLine();
		String [] strArr = org.split(" ");
		if(strArr == null || strArr.length != 2) {
			scan.close();
			return;
		} else  {
			try {
				int first = Integer.parseInt(strArr[0]);
				int second = Integer.parseInt(strArr[1]);
				System.out.println(first+second);
			} catch (Exception e) {
				scan.close();
				return;
			}
		}
		System.out.println();
		scan.close();
	}
	
}
