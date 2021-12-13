public class Product {
    public final String name;
    private final double price;
    private final String measurement;
    private double stock;

    public Product(String name, double price, String measurement, double stock) {
        this.name = name;
        this.price = price;
        this.measurement = measurement;
        this.stock = stock;
    }


    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }


    public String getMeasurement() {
        return measurement;
    }

    public double getStock() {
        return stock;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
