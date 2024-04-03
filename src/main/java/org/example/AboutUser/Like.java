package org.example.AboutUser;

import org.example.User;

public class Like {
    private String id;
    public User user;
    public Post post;

    public Like(String id, User user, Post post) {
        this.id = id;
        this.user = user;
        this.post = post;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }
}
