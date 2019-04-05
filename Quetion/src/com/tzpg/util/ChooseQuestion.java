package com.tzpg.util;

public class ChooseQuestion {

	public static Thread getQuestion(int number) {
		String className = "com.tzpg.question.Num"+number;
		try {
			Class<?> returnClass = Class.forName(className);
			Object returnObject = returnClass.newInstance(); 
			if(returnObject instanceof Thread) {
				return (Thread) returnObject;
			} else {
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
