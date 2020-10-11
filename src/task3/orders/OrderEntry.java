package task3.orders;

public class OrderEntry {
    private int quantity;
    private Product product;

    public OrderEntry(int quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int calculatePrice() {
        int calculateEntryPrice = this.quantity * this.product.getPrice();
        return calculateEntryPrice;
    }
}
