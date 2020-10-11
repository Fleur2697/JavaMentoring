package task3.orders;

import java.util.ArrayList;

public class Order implements Comparable<Order> {
    private int orderNumber;
    private ArrayList<OrderEntry> entries;

    public Order(int orderNumber) {
        this.orderNumber = orderNumber;
        this.entries = new ArrayList<>();
    }

    public void addEntry(OrderEntry orderEntry) {
        this.entries.add(orderEntry);
    }

    public int calculateTotalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < this.entries.size(); i++) {
            totalPrice += this.entries.get(i).calculatePrice();
        }
        return totalPrice;
    }

    @Override
    public int compareTo(Order otherOrder) {
        return this.orderNumber - otherOrder.orderNumber;
    }

    @Override
    public String toString() {
        return String.valueOf(orderNumber);
    }
}
