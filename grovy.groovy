package com.example.tests

import com.thoughtworks.selenium.*

class Untitled extends GroovySeleneseTestCase {

    @Override
    void setUp() throws Exception {
        super.setUp('http://www.ofisgate.com', '*chrome')
        setDefaultTimeout(30000)
        setCaptureScreenshotOnFailure(false)
    }

    void testUntitled() throws Exception {
selenium.open("/");
        selenium.click("//a[contains(text(),'Network Monitoring Control Center (NMCC)')]")
        selenium.click("//a[contains(text(),'About Training')]")
        selenium.click("//a[contains(text(),'About OVP')]")
    }
}
