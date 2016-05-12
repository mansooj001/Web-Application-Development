package model;

/**
 * Created by jason on 5/12/2016.
 */
public class BlogPost {
    private long creationTime;
    private String subject;
    private String text;

    public BlogPost(String subject, String text) {
        creationTime = System.currentTimeMillis();
        this.subject = subject;
        this.text = text;
    }

    public long getCreationTime() {
        return creationTime;
    }

    public String getText() {
        return text;
    }

    public String getSubject() {
        return subject;
    }
}
