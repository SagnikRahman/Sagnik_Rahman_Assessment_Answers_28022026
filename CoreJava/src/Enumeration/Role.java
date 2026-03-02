package Enumeration;

public enum Role {
    ADMIN(10, "Full System Access"),
    HR(5, "Employee Management"),
    STUDENT(1, "Access to Learning Materials");

    private final int clearanceLevel;
    private final String description;

    Role(int clearanceLevel, String description) {
        this.clearanceLevel = clearanceLevel;
        this.description = description;
    }

    public int getClearanceLevel() { return clearanceLevel; }
    public String getDescription() { return description; }

    public boolean canManage(Role otherRole) {
        return this.clearanceLevel > otherRole.clearanceLevel;
    }
}