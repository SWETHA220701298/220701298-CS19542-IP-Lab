
import java.sql.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
/**
 * Servlet implementation class Select
 */
@WebServlet("/Ajax")
public class Ajax extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String URL = "jdbc:mysql://localhost:3307/ip";
			String n = request.getParameter("name"); 
			Connection con = DriverManager.getConnection(URL,"root","");
			PreparedStatement ps = con.prepareStatement("Select * from student where Name=?");
			ps.setString(1, n);
			ResultSet rs = ps.executeQuery();
			out.println("<table border='1'>");
			out.println("<tr>");
			out.println("<th> Name </th>");
			out.println("<th> Age </th>");
			out.println("<th> DOB </th>");
			out.println("<th> Phone_no </th>");
			out.println("<th> Course_name </th>");
			out.println("<th> Course_code </th>");
			out.println("<th> Course_credit </th>");
			out.println("<th> Year </th>");
			out.println("</tr>");
			while(rs.next()) {
				out.println("<tr>");
				out.println("<td>" +rs.getString(1) + "</td>");
                out.println("<td>" + rs.getInt(2) +"</td>");
                out.println("<td>" +rs.getDate(3) + "</td>");
                out.println("<td>" + rs.getInt(4) +"</td>");
                out.println("<td>" + rs.getString(5) +"</td>");
                out.println("<td>" + rs.getString(6) +"</td>");
                out.println("<td>" + rs.getInt(7) +"</td>");
                out.println("<td>" + rs.getString(8) +"</td>");
			}
			out.println("</table>");
			con.close();
		}
		catch(Exception e) {
			out.println(e);
		}
	}
}
