package com.MTS.automationDemo;

import org.junit.Test;

public class AutoDemoRun extends AutoDemoHead {
	
	
	@Test
	public void combinedTest() throws Exception{
		launchApp();
		monkeyTest();
		verifyTiger();
		clickHomeButton();
	}	
}
