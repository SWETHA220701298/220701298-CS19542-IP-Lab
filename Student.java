
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


@WebServlet("/Student")
public class Student extends HttpServlet {
    
    // Sample array of student names
    private String[] studentNames = {
        "Alice", "Bob", "Charlie", "David", "Eva",
        "Frank", "Grace", "Hannah", "Ivy", "Jack",
        "Karen", "Leo", "Mona", "Nina", "Oscar",
        "Paul", "Quincy", "Rachel", "Steve", "Tom",
        "Uma", "Victor", "Wendy", "Xander", "Yara",
        "Vani", "Sree", "Mohan", "Nandy", "Aishu", 
        "Alex", "Barath", "Barathi", "Charu", "Charan",
        "Ciby", "Divya", "Zane","Swedha"
    };

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve the 'query' parameter from the request
        String query = request.getParameter("query");
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");

        // Ensure query is not null or empty
        if (query != null && !query.trim().isEmpty()) {
            boolean found = false;
            query = query.toLowerCase();  // Case-insensitive search

            // Loop through student names to find matches
            for (String name : studentNames) {
                if (name.toLowerCase().startsWith(query)) {
                    out.println("<div>" + name + "</div>");  // Send matching names as HTML divs
                    found = true;
                }
            }

            // If no matches found, display message
            if (!found) {
                out.println("<div>No matching student name found.</div>");
            }
        } else {
            // If query is empty or null, display a message
            out.println("<div>Please enter a name to search.</div>");
        }
    }
}
