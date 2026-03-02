package social_network_interaction_system;

public class MainDriver {
    public static void main(String[] args) {

        Platform platform = new Platform();

        platform.addUser(0, "Alexander");
        platform.addUser(1, "Isabella");
        platform.addUser(2, "Emma");

        platform.follow(1, 0);
        platform.post(0, "Hiking in the mountains...");

        platform.follow(2, 0);
        platform.post(0, "Enjoying a beautiful day!");

        platform.unfollow(1, 0);
    }
}
