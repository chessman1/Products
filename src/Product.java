
public class Product implements Comparable<Product> {

    private int id;
    private double price;
    private String description;

    public Product(int id, double price, String description) {
        setId(id);
        setPrice(price);
        setDescription(description);
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            throw new IllegalArgumentException("Price can't be negative");
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if (description != null) {
            this.description = description;
        } else {
            throw new IllegalArgumentException("description can't be null");
        }
    }

    @Override
    public String toString() {
        return String.format("[%d, %.2f, %s]", id, price, description);
    }

    @Override
    public int compareTo(Product o) {
        return id - o.id;
    }

    public void setId(int id) {
        if (id >= 0) {
            this.id = id;
        } else {
            throw new IllegalArgumentException("Id can't be negative");
        }
    }

}
