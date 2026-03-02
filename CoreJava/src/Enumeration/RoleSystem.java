package Enumeration;

public class RoleSystem {
    public static void main(String[] args) {
        User adminUser = new User("Alice", Role.ADMIN);
        User hrUser = new User("Bob", Role.HR);
        User studentUser = new User("Charlie", Role.STUDENT);

        // Scenario 1: Admin manages HR
        adminUser.tryToAccess(hrUser);

        // Scenario 2: HR manages Student
        hrUser.tryToAccess(studentUser);

        // Scenario 3: Student tries to manage Admin (Failure)
        studentUser.tryToAccess(adminUser);
    }
}