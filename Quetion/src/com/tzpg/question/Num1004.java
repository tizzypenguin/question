package com.tzpg.question;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
어린 왕자는 소혹성 B-664에서 자신이 사랑하는 한 송이 장미를 위해 살아간다. 어느 날 장미가 위험에 빠지게 된 것을 알게 된 어린 왕자는,
 장미를 구하기 위해 은하수를 따라 긴 여행을 하기 시작했다. 하지만 어린 왕자의 우주선은 그렇게 좋지 않아서 행성계 간의 이동을 최대한 피해서 여행해야 한다.
  아래의 그림은 어린 왕자가 펼쳐본 은하수 지도의 일부이다.
빨간 실선은 어린 왕자가 출발점에서 도착점까지 도달하는데 있어서 필요한 행성계 진입/이탈 횟수를 최소화하는 경로이며, 원은 행성계의 경계를 의미한다.
 이러한 경로는 여러 개 존재할 수 있지만 적어도 3번의 행성계 진입/이탈이 필요하다는 것을 알 수 있다.
위와 같은 은하수 지도, 출발점, 도착점이 주어졌을 때 어린 왕자에게 필요한 최소의 행성계 진입/이탈 횟수를 구하는 프로그램을 작성해 보자.
 (행성계의 경계가 맞닿거나 서로 교차하는 경우는 없다고 가정한다. 또한, 출발점이나 도착점이 행성계 경계에 걸쳐진 경우 역시 입력으로 주어지지 않는다.)
 * 
 */
public class Num1004 extends Thread{

	@Override
	public void run() {
		Scanner scan = new Scanner(System.in);
		List<Integer> listThrough = new ArrayList<>();
		int cnt = Integer.parseInt(scan.nextLine());
		for (int i = 0; i < cnt; i++) {
			String[] pathArr = scan.nextLine().split(" ");
			int cntEach = Integer.parseInt(scan.nextLine());
			int cntThrough = 0;
			for (int j = 0; j < cntEach; j++) {
				String[] circleArr = scan.nextLine().split(" ");
				boolean firstInCircle =
						((Integer.parseInt(circleArr[0]) - Integer.parseInt(pathArr[0]))
						* (Integer.parseInt(circleArr[0]) - Integer.parseInt(pathArr[0])))
						+ ((Integer.parseInt(circleArr[1]) - Integer.parseInt(pathArr[1]))
						* (Integer.parseInt(circleArr[1]) - Integer.parseInt(pathArr[1]))) <
							Integer.parseInt(circleArr[2]) * Integer.parseInt(circleArr[2]);
				boolean secondInCircle =
						((Integer.parseInt(circleArr[0]) - Integer.parseInt(pathArr[2]))
						* (Integer.parseInt(circleArr[0]) - Integer.parseInt(pathArr[2])))
						+ ((Integer.parseInt(circleArr[1]) - Integer.parseInt(pathArr[3]))
						* (Integer.parseInt(circleArr[1]) - Integer.parseInt(pathArr[3]))) <
							Integer.parseInt(circleArr[2]) * Integer.parseInt(circleArr[2]);
				if(firstInCircle && secondInCircle) {
					continue;
				} else if (firstInCircle && !secondInCircle) {
					cntThrough++;
				} else if (!firstInCircle && secondInCircle) {
					cntThrough++;
				} else if (!firstInCircle && !secondInCircle) {
					continue;
				}
			}
			listThrough.add(cntThrough);
		}
		scan.close();
		for(Integer through: listThrough) {
			System.out.println(through);
		}
	}
	
}
