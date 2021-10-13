public class Display extends Observer {
    public void displayItem(String itemInfo){
        System.out.println(itemInfo);
    }

    //exe2
    //public void displayProduct(Product product){
    //  System.out.println(String.format("Display Screen --> Name: %s, Price: %s, UPCCode: %s", product.productName, product.productPrice, product.upcCode));
    //}

    @Override
    public void updateInfo(Product productEntered){
        System.out.println(String.format("Display Screen --> Name: %s, Price: %s, UPCCode: %s", productEntered.productName, productEntered.productPrice, productEntered.upcCode));
    }
}
