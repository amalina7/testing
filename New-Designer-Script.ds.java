package com.example.tests;

import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.regex.Pattern;

public class Untitled extends SeleneseTestCase {
	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", "4444", "*chrome", "http://www.ofisgate.com");
		selenium.start();
	}

	@Test
	public void testUntitled() throws Exception {
selenium.open("/");
		selenium.click("//a[contains(text(),'Network Monitoring Control Center (NMCC)')]");
		selenium.click("//a[contains(text(),'About Training')]");
		selenium.click("//a[contains(text(),'About OVP')]");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
