package com.example.tests;

import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.regex.Pattern;

public class Untitled extends SeleneseTestCase {
	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", "4444", "*chrome", "http://www.mhc-e1mas.com/test2");
		selenium.start();
	}

	@Test
	public void testUntitled() throws Exception {
selenium.open("/");
		selenium.type("//input[@name='email']", "tester@gmail.com");
		selenium.type("//input[@name='pass']", "tester");
		selenium.click("//button[@name='btn-login']");
		selenium.click("//div[@id='navbar']/ul[2]/li/a/span[2]");
		selenium.click("//a[contains(text(),'Sign Out')]");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
