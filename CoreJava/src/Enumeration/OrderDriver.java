package Enumeration;

public class OrderDriver {
    public static void main(String[] args) {
        OrderStatus currentStatus = OrderStatus.PLACED;
        OrderStatus nextMove = OrderStatus.SHIPPED;

        System.out.println("Current Code: " + currentStatus.getCode());

        if (currentStatus.canTransitionTo(nextMove)) {
            currentStatus = nextMove;
            System.out.println("Status updated to: " + currentStatus);
        } else {
            System.out.println("Invalid Move: Cannot go from " + currentStatus + " to " + nextMove);
        }
    }
}