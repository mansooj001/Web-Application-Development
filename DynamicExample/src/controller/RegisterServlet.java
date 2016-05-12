package controller;

import model.BlogService;
import model.ServiceProvider;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by jason on 5/9/2016.
 */
@WebServlet(name = "RegisterServlet")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String message = "";
        String username = request.getParameter("username");
        String password1 = request.getParameter("password1");
        String password2 = request.getParameter("password2");
        String email = request.getParameter("email");
        String name = request.getParameter("name");
        BlogService blogService = ServiceProvider.getBlogService();
        if (!password1.equals(password2)) {
            message = "Passwords do not match! Please try again.";
            request.setAttribute("error", message);
            RequestDispatcher rd = request.getRequestDispatcher("/register.jsp");
            rd.include(request, response);
        } else {
            if ((username.equals("")) || (password1.equals("")) || (password2.equals("")) || (email.equals("")) || (name.equals(""))) {
                message = "Please fill in all fields";
                request.setAttribute("error", message);
                RequestDispatcher rd = request.getRequestDispatcher("/register.jsp");
                rd.include(request, response);
            }
        }

        if (blogService.getAllUsers().contains(username) || blogService.getAllUsers().contains(email)) {
            message = "Account already exists";
            request.setAttribute("error", message);
            RequestDispatcher rd = request.getRequestDispatcher("/register.jsp");
            rd.include(request, response);
        }
        blogService.registerUser(username, password1, email, name);
        RequestDispatcher rd = request.getRequestDispatcher("/welcome.jsp");
        rd.forward(request, response);
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
