import javax.swing.*;
import java.util.ArrayList;
import java.util.Objects;

public class Shop {
    public ArrayList<Product> products = new ArrayList<>();
    private ArrayList<Customer> customers = new ArrayList<>();

    public String addProductToStock(){
        String name = JOptionPane.showInputDialog("Enter product name");
        double price = Double.parseDouble(JOptionPane.showInputDialog("Enter price"));
        String [] availableMeasurements = {"kg", "l", "pieces"};
        String measurement = (String) JOptionPane.showInputDialog(
                null,
                "Select measurement",
                "Product measurement",
                JOptionPane.QUESTION_MESSAGE,
                null,
                availableMeasurements,
                availableMeasurements[0]);
        double stock = Double.parseDouble(JOptionPane.showInputDialog("Enter current stock"));

        Product product = new Product(name, price, measurement, stock);
        this.products.add(product);
        System.out.println(product.getName() + " added  to stock");
        return name;
    }

    public String deleteProductFromStock(){
        String deleteName = JOptionPane.showInputDialog("Delete product (name)");
        products.removeIf(product -> product.getName().equals(deleteName));
        System.out.println(deleteName + " deleted from stock.");
        System.out.println(products + " remaining in stock.");
        return deleteName;
    }

    public String addCustomer(){
        String customerName = JOptionPane.showInputDialog("Enter your name");
        System.out.println("Welcome, " + customerName);
        return customerName;
    }

    public double customerBalance() {
        double customerStartBalance = Double.parseDouble(JOptionPane.showInputDialog("Enter start balance"));
        double purchaseValue = 0; // need to get product values from stock
        double customerClosingBalance = customerStartBalance ; //need to add calculation
        if(purchaseValue > customerClosingBalance){
            System.out.println("You do not have enough money");
        }
        return customerClosingBalance;
    }

    public String addToCart() {
        String chosenProduct = JOptionPane.showInputDialog("Choose product");
        if(products.contains(chosenProduct)){  //THIS DOES NOT WORK :(
            System.out.println(chosenProduct + " added");
        }else{
            System.out.println("Not found");
        }

        return chosenProduct;
    }

}
