package task3.orders;

public class Product {
    private int price;
    private String category;
    private String name;

    public Product(int price, String categories, String name) {
        this.price = price;
        this.category = categories;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.price + " " + this.category + " " + this.name;
    }
}
