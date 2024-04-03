package org.example.AboutUser;

public class Reply {
    public Post parent;
    public Boolean typeOfPost;

    public Reply(Post parent, Boolean typeOfPost) {
        this.parent = parent;
        this.typeOfPost = typeOfPost;
    }

    public Post getParent() {
        return parent;
    }

    public void setParent(Post parent) {
        this.parent = parent;
    }

    public Boolean getTypeOfPost() {
        return typeOfPost;
    }

    public void setTypeOfPost(Boolean typeOfPost) {
        this.typeOfPost = typeOfPost;
    }
}
