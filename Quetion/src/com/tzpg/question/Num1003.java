package com.tzpg.question;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/*
문제 1003
다음 소스는 N번째 피보나치 수를 구하는 C++ 함수이다.

int fibonacci(int n) {
    if (n == 0) {
        printf("0");
        return 0;
    } else if (n == 1) {
        printf("1");
        return 1;
    } else {
        return fibonacci(n‐1) + fibonacci(n‐2);
    }
}
fibonacci(3)을 호출하면 다음과 같은 일이 일어난다.

fibonacci(3)은 fibonacci(2)와 fibonacci(1) (첫 번째 호출)을 호출한다.
fibonacci(2)는 fibonacci(1) (두 번째 호출)과 fibonacci(0)을 호출한다.
두 번째 호출한 fibonacci(1)은 1을 출력하고 1을 리턴한다.
fibonacci(0)은 0을 출력하고, 0을 리턴한다.
fibonacci(2)는 fibonacci(1)과 fibonacci(0)의 결과를 얻고, 1을 리턴한다.
첫 번째 호출한 fibonacci(1)은 1을 출력하고, 1을 리턴한다.
fibonacci(3)은 fibonacci(2)와 fibonacci(1)의 결과를 얻고, 2를 리턴한다.
1은 2번 출력되고, 0은 1번 출력된다. N이 주어졌을 때, fibonacci(N)을 호출했을 때, 0과 1이 각각 몇 번 출력되는지 구하는 프로그램을 작성하시오.
 */
public class Num1003 extends Thread{
	private static List<Map<String, Integer>> fiboList = new ArrayList<>();
	@Override
	public void run() {
		for(int i = 0; i<= 40; i++) {
			fibonacci(i);
		}
		Scanner scan = new Scanner(System.in);
		String cntStr = scan.nextLine();
		try{
			int cnt = Integer.parseInt(cntStr);
			int [] numArr = new int[cnt];
			for(int i = 0; i< cnt; i++) {
				String numStr = scan.nextLine();
				int num = Integer.parseInt(numStr);
				numArr[i] = num;
			}
			for(int idx: numArr) {
				System.out.println(fiboList.get(idx).get("0") + " " + fiboList.get(idx).get("1"));	
			}
		} catch (Exception e) {
			scan.close();
			return;
		}
		scan.close();
	}
	private static void fibonacci(int n) {
    	Map<String, Integer> map = new HashMap<>();
    	if(n == 0) {
    		map.put("0", 1);
    		map.put("1", 0);
    	} else if(n == 1) {
    		map.put("0", 0);
    		map.put("1", 1);
    	} else if(n == 2) {
    		map.put("0", 1);
    		map.put("1", 1);
    	} else {
    		int zero = fiboList.get(n-1).get("0");
    		int one = fiboList.get(n-1).get("1");
    		
    		map.put("0", one);
    		map.put("1", zero+one);
    	}
    	fiboList.add(map);
	}
}
