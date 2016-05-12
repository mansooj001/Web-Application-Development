package model;

import java.util.ArrayList;

/**
 * Created by jason on 5/9/2016.
 */
public class User {
    private String username, password, email, name;
    private ArrayList<BlogPost> myBlogposts = new ArrayList<>();

    public User(String username, String password, String email, String name) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public boolean checkPassword(String password) {
        return this.password.equals(password);
    }

    public String getName() {
        return name;
    }

    public void addBlogPost(BlogPost blogPost) {
        myBlogposts.add(blogPost);
    }

    public ArrayList<BlogPost> getMyPosts() {
        return myBlogposts;
    }


}
