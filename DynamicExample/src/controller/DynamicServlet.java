package controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by jason on 4/14/2016.
 */
public class DynamicServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstDigit = request.getParameter("firstDigit");
        String secondDigit = request.getParameter("secondDigit");
        int result = 0;
        if (request.getParameter("add") != null) {
            result = Integer.parseInt(firstDigit) + Integer.parseInt(secondDigit);
        } else if (request.getParameter("subtract") != null) {
            result = Integer.parseInt(firstDigit) - Integer.parseInt(secondDigit);
        } else if (request.getParameter("multiply") != null) {
            result = Integer.parseInt(firstDigit) * Integer.parseInt(secondDigit);
        } else if (request.getParameter("divide") != null) {
            result = Integer.parseInt(firstDigit) / Integer.parseInt(secondDigit);
        }
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println(" <head>");
        out.println(" <meta charset=\"UTF-8\">");
        out.println(" <title>Dynamic Example</title>");
        out.println(" </head>");
        out.println(" <body>");
        out.println(" <h2>Dynamic webapplication example</h2>");
        out.println(" <h2>" + firstDigit + " and " + secondDigit + " make " + result);
        out.println(" </body>");
        out.println("</html>");
    }
}
