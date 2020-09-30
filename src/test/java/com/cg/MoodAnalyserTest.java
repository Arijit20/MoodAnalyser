package com.cg;

import org.junit.Test;

import com.cg.MoodAnalyserMain;

import static org.junit.Assert.*;

import org.junit.Assert;

public class MoodAnalyserTest {
	@Test
	public void TestMoodAnalysis() {
		MoodAnalyserMain moodAnalyser = new MoodAnalyserMain();
		String mood = moodAnalyser.analyseMood("I am in sad mood");
		Assert.assertEquals("SAD", mood);
	}
}
