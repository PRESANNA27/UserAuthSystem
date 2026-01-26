package backend;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SignupServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h2>Signup Successful</h2>");
        out.println("<p>Name: " + name + "</p>");
        out.println("<p>Email: " + email + "</p>");
    }
}
