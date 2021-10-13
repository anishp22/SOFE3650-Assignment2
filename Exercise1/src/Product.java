public class Product {
    public String productName;              //String which contains the name of the product
    public double productPrice;              //double for the price of the products
    public int upcCode;                        //int for the upcCode of the products

    public Product(String productName, double productPrice, int upcCode) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.upcCode = upcCode;
    }
}
