package model;

import java.util.ArrayList;

/**
 * Created by jason on 5/12/2016.
 */
public class ServiceProvider {

    private static BlogService blogService = new BlogService();

    public static BlogService getBlogService() {
        return blogService;
    }
}
