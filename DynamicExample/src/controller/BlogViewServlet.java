package controller;

import model.BlogPost;
import model.BlogService;
import model.ServiceProvider;
import model.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class BlogViewServlet extends HttpServlet {
    @Override
    public void init() {
        BlogService blogService = ServiceProvider.getBlogService();

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BlogService blogservice = ServiceProvider.getBlogService();
        User loggedUser = (User) req.getSession().getAttribute("loggedUser");

        for (BlogPost b : loggedUser.getMyPosts()) {
            String Subject = b.getSubject();
            String Text = b.getText();
            long date = b.getCreationTime();
            System.out.println(date + " " + Subject + " " + Text);

        }
    }
}