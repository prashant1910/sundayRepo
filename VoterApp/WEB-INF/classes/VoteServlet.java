package com.nt.servlet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class VoteServlet extends HttpServlet
{	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
	{	PrintWriter pw=null;
		pw=res.getWriter();
		res.setContentType("text/html");
		String name1=req.getParameter("name");
		 int age1=Integer.parseInt(req.getParameter("age"));
		if(age1>=18)
		pw.println("<marquee><h1 style='color:red'>Mr./Mrs."+name1 +"you are eligible to vote <h1></marquee>");
		else
		pw.println("<marquee><h1 style='color:red'>Mr./Mrs."+name1 +"you are not eligible to vote </h1></marquee>");
		pw.println("<br><br><a href='http://localhost:2525/VoterApp/page1.html'><img src='pic.jpg' height=42' width='42'></a> ");
		pw.close();

	}
}