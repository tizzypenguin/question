package com.tzpg.main;

import com.tzpg.util.ChooseQuestion;

public class Main {
	public static void main(String[] args) {
		int questionNum = 1004;
		ChooseQuestion.getQuestion(questionNum).start();
	}
}
