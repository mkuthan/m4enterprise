package com.googlecode.mkuthan.core;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ApplicationServiceIT {

    private ApplicationService applicationService;

    @Before
    public void setUp() throws Exception {
	applicationService = new ApplicationService();
    }

    @Test
    public void testApplicationService() {
	assertEquals("Hello: Marcin", applicationService.sayHello("Marcin"));
    }

}
