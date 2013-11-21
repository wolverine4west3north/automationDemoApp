package com.MTS.automationDemo;

import java.io.File;
import java.io.IOException;

import org.sikuli.script.Key;
import org.sikuli.script.Screen;

import com.gorillalogic.monkeytalk.java.MonkeyTalkDriver;
import com.gorillalogic.monkeytalk.java.api.Application;

public class AutoDemoHead {
	Screen s = new Screen();
	private static MonkeyTalkDriver mt;
	private Application app;
	
	
	public void monkeyTest() throws IOException{
		mt = new MonkeyTalkDriver(new File("."), "Android");
		mt.setThinktime(500);
		mt.setTimeout(5000);
		app = mt.app();
		app.label("textView1").verify("Welcome to the automation example");
		app.button("Click To Continue").tap();
		app.label("textView1").verify("If you're seeing this...");
		app.label("textView2").verify("It Worked!");
	}
	
	public void launchApp() throws Exception{
		s.click("res/emulator.png");
		s.click("res/appIcon.png");
		s.wait("res/launched.png", 5.0);
		s.wait(1.0);
	}
	
	public void verifyTiger() throws Exception{
		s.wait(1.0);
		s.hover("res/tiger.png");
	}
	
	public void clickHomeButton() throws Exception{
		s.type(Key.HOME);
		s.wait(1.0);
		s.hover("res/appIcon.png");
	}
	
}
