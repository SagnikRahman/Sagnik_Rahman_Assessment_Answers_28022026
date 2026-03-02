package Practice;

import java.util.Arrays;
import java.util.Comparator;

class Item {
    int value;
    int weight;

    Item(int value, int weight) {
        this.value = value;
        this.weight = weight;
    }
}

class ItemComparator implements Comparator<Item> {
    public int compare(Item a, Item b) {
        double r1 = (double) a.value / a.weight;
        double r2 = (double) b.value / b.weight;
        return Double.compare(r2, r1);
    }
}

public class FractionalKnapsack {

    public static double fractionalKnapsack(int W, int[] values, int[] weights) {

        int n = values.length;
        Item[] items = new Item[n];

        for (int i = 0; i < n; i++) {
            items[i] = new Item(values[i], weights[i]);
        }

        Arrays.sort(items, new ItemComparator());

        double totalValue = 0.0;

        for (int i = 0; i < n; i++) {
            if (items[i].weight <= W) {
                W -= items[i].weight;
                totalValue += items[i].value;
            } else {
                double fraction = (double) W / items[i].weight;
                totalValue += items[i].value * fraction;
                break;
            }
        }

        return totalValue;
    }

    public static void main(String[] args) {
        int[] values = {60, 100, 120};
        int[] weights = {10, 20, 30};
        int W = 50;

        System.out.println(fractionalKnapsack(W, values, weights));
    }
}
