package social_network_interaction_system;

import java.util.Set;
import java.util.TreeSet;

class User implements Comparable<User> {
    private Integer id;
    private String name;
    private Set<User> followers;
    private Set<User> following;

    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.followers = new TreeSet<>();
        this.following = new TreeSet<>();
    }

    @Override
    public int compareTo(User other) {
        return this.id.compareTo(other.id);
    }

    public String getName() {
        return name;
    }

    public void addFollowers(User user) {
        followers.add(user);
    }

    public void removeFollowers(User user) {
        followers.remove(user);
    }

    public void followUser(User user) {
        following.add(user);
        user.addFollowers(this);
    }

    public void unfollowUser(User user) {
        following.remove(user);
        user.removeFollowers(this);
    }

    public void post(String content) {
        System.out.println(name + " posted: \"" + content + "\".");
        notifyFollowers(content);
    }

    public void notifyFollowers(String message) {
        for (User follower : followers) {
            follower.update(message, this);
        }
    }

    public void update(String message, User followee) {
        System.out.println(name + " received notification: " + followee.getName() + " posted: \"" + message + "\".");
    }
}