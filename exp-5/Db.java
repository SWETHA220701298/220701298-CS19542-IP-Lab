
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.sql.*;
/**
 * Servlet implementation class Db
 */
@WebServlet("/Db")
public class Db extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String URL = "jdbc:mysql://localhost:3307/ip";
			Connection con = DriverManager.getConnection(URL,"root","");
			PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?,?,?,?,?,?)");
			ps.setString(1, request.getParameter("n"));
			ps.setInt(2, Integer.parseInt(request.getParameter("age")));
			ps.setString(3, request.getParameter("dob"));
			ps.setInt(4, Integer.parseInt(request.getParameter("pn")));
			ps.setString(5, request.getParameter("cn"));
			ps.setString(6, request.getParameter("cc"));
			ps.setInt(7, Integer.parseInt(request.getParameter("cre")));
			ps.setString(8,request.getParameter("yr"));
			int res = ps.executeUpdate();
			if(res != 0) 
				out.println("1 row inserted.");
			else
				out.println("Insertion failure");
			out.print("<br><form name='f1' action='Select'>");
			out.print("<input type='submit' value='View'>");
			out.println("</form>");
			ps.close();
			con.close();
		}
		catch(Exception e) {
			out.println(e);
		}	
	}
}
