package social_network_interaction_system;

import java.util.HashMap;
import java.util.Map;

class Platform {
    private Map<Integer, User> users;

    public Platform() {
        users = new HashMap<>();
    }

    public void addUser(Integer id, String name) {
        users.put(id, new User(id, name));
        System.out.println(name + " added successfully.");
    }

    public void follow(Integer followerId, Integer followeeId) {
        User follower = users.get(followerId);
        User followee = users.get(followeeId);

        follower.followUser(followee);
        System.out.println(follower.getName() + " is now following " + followee.getName() + ".");
    }

    public void unfollow(Integer followerId, Integer followeeId) {
        User follower = users.get(followerId);
        User followee = users.get(followeeId);

        follower.unfollowUser(followee);
        System.out.println(follower.getName() + " has unfollowed " + followee.getName() + ".");
    }

    public void post(Integer userId, String content) {
        users.get(userId).post(content);
    }
}
