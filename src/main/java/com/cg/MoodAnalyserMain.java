package com.cg;

public class MoodAnalyserMain {
	public String analyseMood(String message) {
			if (message.contains("sad"))
				return "SAD";
			else
				return "HAPPY";
		}
	}

