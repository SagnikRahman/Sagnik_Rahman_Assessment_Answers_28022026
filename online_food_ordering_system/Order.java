package online_food_ordering_system;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<FoodItem> items = new ArrayList<>();

    public void addItem(FoodItem item) {
        items.add(item);
    }

    public double calculateTotalBill() {
        double total = 0;
        for (FoodItem item : items) {
            double discount = item.calculateDiscount(); 
            total += item.getPrice() - discount;
        }
        return total;
    }
}