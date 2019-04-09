package com.tzpg.question;

import java.util.Scanner;

/*
문제. 1000
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
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
