package com.googlecode.m4enterprise;

import java.util.ResourceBundle;
import java.util.logging.Logger;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

public class DeployIT {

    private static Logger logger = Logger.getLogger(DeployIT.class.getName());

    private static ResourceBundle testProperties = ResourceBundle.getBundle("test");

    private WebClient webClient;

    @Before
    public void setUp() {
	webClient = new WebClient();
    }

    @After
    public void tearDown() {
	webClient.closeAllWindows();
    }

    @Test(timeout = 120 * 1000)
    public void smokeDeploymentTest() throws Exception {
	int waitTime = 1000;
	while (true) {
	    try {
		HtmlPage page = webClient.getPage(testProperties.getString("url"));
		String title = page.getTitleText();
		if ("Hello World".equals(title)) {
		    break;
		}
		logger.info("Page title does not match: " + title);
	    } catch (Exception e) {
		logger.info(e.getMessage());
	    }
	    Thread.sleep(waitTime *= 1.5);
	}
    }
}
