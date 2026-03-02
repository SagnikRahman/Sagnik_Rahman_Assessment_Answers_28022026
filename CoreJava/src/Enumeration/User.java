package Enumeration;

public class User {
    private String name;
    private Role role;

    public User(String name, Role role) {
        this.name = name;
        this.role = role;
    }

    public void tryToAccess(User target) {
        System.out.println("User [" + this.name + "] is attempting to manage [" + target.name + "]...");
        
        if (this.role.canManage(target.role)) {
            System.out.println("ACCESS GRANTED: " + this.role.getDescription() + " is active.");
        } else {
            System.out.println("ACCESS DENIED: Insufficient clearance level.");
        }
        System.out.println("------------------------------------------------");
    }
}