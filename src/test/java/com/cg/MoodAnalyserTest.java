package com.cg;

import org.junit.Test;

import com.cg.MoodAnalyserMain;

import static org.junit.Assert.*;

import org.junit.Assert;

public class MoodAnalyserTest {
	@Test
	public void TestMoodAnalysis() {
		MoodAnalyserMain moodAnalyser = new MoodAnalyserMain("I am in any Moodg");
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("HAPPY", mood);
	}
}
