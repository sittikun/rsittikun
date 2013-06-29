package com.rsittikun;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class RsittikunServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world");
		String str1 = req.getParameter("a");
		resp.getWriter().println("a = "+str1);
		
	}
}
