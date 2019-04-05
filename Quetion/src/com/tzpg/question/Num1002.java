package com.tzpg.question;

import java.util.Scanner;

/*
 * 문제 1002
 * 조규현과 백승환은 터렛에 근무하는 직원이다. 하지만 워낙 존재감이 없어서 인구수는 차지하지 않는다. 다음은 조규현과 백승환의 사진이다.
 * 이석원은 조규현과 백승환에게 상대편 마린(류재명)의 위치를 계산하라는 명령을 내렸다. 조규현과 백승환은 각각 자신의 터렛 위치에서 현재 적까지의 거리를 계산했다.
 * 조규현의 좌표 (x1, y1)와 백승환의 좌표 (x2, y2)가 주어지고, 조규현이 계산한 류재명과의 거리 r1과 백승환이 계산한 류재명과의 거리 r2가 주어졌을 때,
 * 류재명이 있을 수 있는 좌표의 수를 출력하는 프로그램을 작성하시오.
 */
public class Num1002 extends Thread{

	@Override
	public void run() {
		Scanner scan = new Scanner(System.in);
		String cnt = scan.nextLine();
		try {
			int count = Integer.parseInt(cnt);
			int[] intArr = new int[count];
			for (int i = 0; i < count; i++) {
				String[] paramArr = scan.nextLine().split(" ");
				int firstX = Integer.parseInt(paramArr[0]);
				int firstY = Integer.parseInt(paramArr[1]);
				int firstR = Integer.parseInt(paramArr[2]);
				int secondX = Integer.parseInt(paramArr[3]);
				int secondY = Integer.parseInt(paramArr[4]);
				int secondR = Integer.parseInt(paramArr[5]);
				int turRangeSq = ((firstX - secondX) * (firstX - secondX)) + ((firstY - secondY) * (firstY - secondY));
				int addRangeSq = (firstR + secondR) * (firstR + secondR);
				int diffRangeSq = (firstR - secondR) * (firstR - secondR); 
				if(firstX == secondX && firstY == secondY && firstR == secondR) {
					intArr[i] = -1;
				} else if(diffRangeSq > turRangeSq || turRangeSq > addRangeSq) {
					intArr[i] = 0;
				} else if (turRangeSq == addRangeSq || turRangeSq == diffRangeSq) {
					intArr[i] = 1;
				} else if(turRangeSq < addRangeSq) {
					intArr[i] = 2;
				} else {
					intArr[i] = -1;
				}
			}
			for(int num: intArr) {
				System.out.println(num);
			}

		} catch (Exception e) {
			System.out.println(-1);
			scan.close();
			return;
		}
		scan.close();	}
	
}
