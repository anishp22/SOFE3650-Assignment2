//This class represents the Model of MVC
public class CashRegister {
    private Product productEntered;
    private ProductDatabase database = new ProductDatabase();
    private TicketPrinter receipt = new TicketPrinter();
    private Display screen = new Display();
    private Keyboard registerKeyboard = new Keyboard();
    private Scanner productScanner = new Scanner();

    public Product getCurrentProduct(Product productInfo){
        return productInfo;
    }

    public void setCurrentProductUPC(int upcCode){
        if (productScanner.scannedUPCCode(upcCode) == 0){
            screen.displayItem("The UPC code scanned is invalid, please enter the code manually.");
            productEntered = database.getProductInfo(registerKeyboard.setUPCCode());

        }
        else {
            productEntered = database.getProductInfo(upcCode);
        }
    }

    public void updateInfo(){
        receipt.displayProduct(productEntered);
        screen.displayProduct(productEntered);

    }

}
