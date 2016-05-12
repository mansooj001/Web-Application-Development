package controller;

import model.BlogService;
import model.ServiceProvider;
import model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by jason on 5/12/2016.
 */
@WebServlet(name = "BlogPostServlet")
public class BlogPostServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String subject = request.getParameter("subject");
        String text = request.getParameter("text");
        BlogService blogService = ServiceProvider.getBlogService();
        User loggedUser = (User) request.getSession().getAttribute("loggedUser");
        blogService.addBlogPostForUser(subject, text, loggedUser);
        request.setAttribute("blogPostList", loggedUser.getMyPosts());
        RequestDispatcher rd = request.getRequestDispatcher("/blogger/myposts.jsp");
        rd.include(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
