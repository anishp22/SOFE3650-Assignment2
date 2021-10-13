public class Display implements View {
    public void displayItem(String itemInfo){
        System.out.println(itemInfo);
    }

    public void displayProduct(Product product){
        System.out.println(String.format("Display Screen --> Name: %s, Price: %s, UPCCode: %s", product.productName, product.productPrice, product.upcCode));
    }
}
