package controller;

import model.BlogService;
import model.ServiceProvider;
import model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by jason on 5/10/2016.
 */
@WebServlet(name = "LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String message = "";
        BlogService blogService = ServiceProvider.getBlogService();
        if (!blogService.getAllUsers().isEmpty()) {
            for (User u : blogService.getAllUsers()) {
                if (username == "" || password == "" || !u.getUsername().equals(username) || !u.checkPassword(password)) {
                    message = "Username or password not recognised.";
                    request.setAttribute("error", message);
                    RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
                    rd.include(request, response);
                } else {
                    if (u.getUsername().equals(username) && u.checkPassword(password)) {
                        request.getSession().setAttribute("loggedUser", u);
                        blogService.loginUser(username, password);
                        RequestDispatcher rd = request.getRequestDispatcher("/blogger/myaccount.jsp");
                        Cookie cookie = new Cookie("cUsername", username);
                        cookie.setMaxAge(333333333);
                        response.addCookie(cookie);
                        rd.forward(request, response);
                    }
                }
            }
        } else {
            message = "Username or password not recognised.";
            request.setAttribute("error", message);
            RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
            rd.include(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

