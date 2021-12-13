import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Shop superStore = new Shop();

        String productInStock1 = superStore.addProductToStock();
        String productInStock2 = superStore.addProductToStock();
        String productInStock3 = superStore.addProductToStock();
        String productInStock4 = superStore.addProductToStock();

        String productDeleteFromStock1 = superStore.deleteProductFromStock();

        String customer1 = superStore.addCustomer();
        JOptionPane.showMessageDialog(null, customer1);

        double balance1 = superStore.customerBalance();

        String productsAddedToCart = superStore.addToCart();
    }

}
