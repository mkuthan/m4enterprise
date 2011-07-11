package com.googlecode.m4enterprise;

import static org.junit.Assert.assertEquals;

import java.util.ResourceBundle;

import org.junit.After;
import org.junit.Before;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

public class DeployIT {

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

    public void smokeDeploymentTest() throws Exception {
	HtmlPage page = webClient.getPage(testProperties.getString("url"));
	assertEquals(testProperties.getString("title"), page.getTitleText());
    }
}
