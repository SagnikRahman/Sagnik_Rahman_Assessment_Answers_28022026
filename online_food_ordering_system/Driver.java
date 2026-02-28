package online_food_ordering_system;

public class Driver {
    public static void main(String[] args) {
        FoodItem veg1 = new VegItem(1, "Paneer Tikka Butter Masala", 250);
        FoodItem nonVeg1 = new NonVegItem(2, "Chicken Biryani", 345);

        Order order = new Order();
        order.addItem(veg1);
        order.addItem(nonVeg1);

        System.out.println("Total Bill: Rs. " + order.calculateTotalBill());
    }
}
