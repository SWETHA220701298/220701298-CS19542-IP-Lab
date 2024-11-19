

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


/**
 * Servlet implementation class Form
 */
@WebServlet("/Form")
public class Form extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		String n = request.getParameter("n");
		String n2 = request.getParameter("cn");
		String co = request.getParameter("cc");
		Integer a = Integer.parseInt(request.getParameter("age"));
		String d = request.getParameter("dob");
		String p = request.getParameter("pn");
		Integer cr = Integer.parseInt(request.getParameter("cre"));
		String y = request.getParameter("yr");
		out.println("Name: "+n);
		out.println("<br><br>");
		out.println("Age:"+a);
		out.println("<br><br>");
		out.println("DOB: "+d);
		out.println("<br><br>");
		out.println("Phone_no: "+p);
		out.println("<br><br>");
		out.println("Course_name : "+n2);
		out.println("<br><br>");
		out.println("Course_code : "+co);
		out.println("<br><br>");
		out.println("Credit      : "+cr);
		out.println("<br><br>");
		out.println("Year        : "+y);
		out.println("<br><h3>Registration Successfully Completed</h3>");
	}

}
