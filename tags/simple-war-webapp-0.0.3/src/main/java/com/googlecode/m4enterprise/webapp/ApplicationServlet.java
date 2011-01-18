package com.googlecode.m4enterprise.webapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.googlecode.m4enterprise.core.ApplicationService;

public class ApplicationServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    private ApplicationService applicationService;

    @Override
    public void init(ServletConfig config) throws ServletException {
	applicationService = new ApplicationService();

	super.init(config);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	String name = getInitParameter("name");
	PrintWriter out = res.getWriter();
	out.println(applicationService.sayHello(name));
    }

}
