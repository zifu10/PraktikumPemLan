package TugasPemLan6;

public class Invoice implements Payable {
    String productName;
    Integer quantity;
    Integer pricePerItem;

    public Invoice(String productName, Integer quantity, Integer pricePerItem) {
        this.productName = productName;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    @Override
    public double getPayableAmount() {
        return quantity * pricePerItem;
    }

    @Override
    public String toString() {
        return  "Product Name   : " + productName +
                "\nQuantity       : " + quantity +
                "\nPrice Per Item : " + pricePerItem;
    }
}