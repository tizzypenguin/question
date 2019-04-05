package com.tzpg.question;

import java.util.Scanner;

/*
 * ���� 1002
 * �������� ���ȯ�� �ͷ��� �ٹ��ϴ� �����̴�. ������ ���� ���簨�� ��� �α����� �������� �ʴ´�. ������ �������� ���ȯ�� �����̴�.
 * �̼����� �������� ���ȯ���� ����� ����(�����)�� ��ġ�� ����϶�� ����� ���ȴ�. �������� ���ȯ�� ���� �ڽ��� �ͷ� ��ġ���� ���� �������� �Ÿ��� ����ߴ�.
 * �������� ��ǥ (x1, y1)�� ���ȯ�� ��ǥ (x2, y2)�� �־�����, �������� ����� �������� �Ÿ� r1�� ���ȯ�� ����� �������� �Ÿ� r2�� �־����� ��,
 * ������� ���� �� �ִ� ��ǥ�� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
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
