package model;

import java.util.ArrayList;

/**
 * Created by jason on 5/12/2016.
 */
public class BlogService {

    private ArrayList<User> allUsers = new ArrayList<>();

    public void addBlogPostForUser(String subject, String text, User user) {
        if (subject == "" || text == "") {
            throw new IllegalArgumentException();
        } else {
            BlogPost blogPost = new BlogPost(subject, text);
            user.addBlogPost(blogPost);
        }
    }

    public boolean registerUser(String userName, String password, String email, String name) {
        if (!allUsers.isEmpty())
            for (User u : allUsers) {
                if (u.getUsername().equals(userName)) {
                    return false;
                }
            }
        allUsers.add(new User(userName, password, email, name));
        return true;
    }

    public User loginUser(String userName, String password) {
        if (!allUsers.isEmpty())
            for (User u : allUsers) {
                if (u.getUsername() == userName && u.checkPassword(password)) {
                    return u;
                }
            }
        return null;
    }

    public ArrayList<User> getAllUsers() {
        return allUsers;
    }

    public ArrayList<BlogPost> getAllBlogPosts() {
        for (User u : allUsers) {
            return u.getMyPosts();
        }
        return null;
    }
}
