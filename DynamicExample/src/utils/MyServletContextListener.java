package utils;

import model.BlogPost;
import model.BlogService;
import model.ServiceProvider;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.xml.ws.Service;

/**
 * Created by jason on 5/12/2016.
 */
public class MyServletContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        BlogService blogService = ServiceProvider.getBlogService();
        blogService.registerUser("zelda", "test", "email", "Jason Mansoor");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
