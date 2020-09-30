package com.cg;

public class MoodAnalyserMain {
	private String message;
	
	public MoodAnalyserMain() {
	}
	
	public MoodAnalyserMain(String message) {
		this.message = message;
	}
	
	public String analyseMood() {
		try {
			if (message.contains("Happy"))
				return "SAD";
			else
				return "HAPPY";
		}catch(NullPointerException e) {
			return "HAPPY";
		}
	}
}
