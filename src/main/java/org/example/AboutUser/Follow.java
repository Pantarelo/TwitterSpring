package org.example.AboutUser;

import org.example.User;

public class Follow {
    public User user;
    public Long timestamp;
    public User following;

    public Follow(User user, Long timestamp, User following) {
        this.user = user;
        this.timestamp = timestamp;
        this.following = following;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public User getFollowing() {
        return following;
    }

    public void setFollowing(User following) {
        this.following = following;
    }
}
