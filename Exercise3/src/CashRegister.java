//This class represents the Model of MVC
import java.util.ArrayList;
public class CashRegister {

    ArrayList<Observer> y = new ArrayList<Observer>();
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

    void notifyObservers(){
        for(Observer x:y)
            x.updateInfo(productEntered);
    }

    void registerObserver(Observer x){
        y.add(x);
    }

    void registerObservers(){
        y.add(receipt);
        y.add(screen);
    }
    public void updateInfo(){
       notifyObservers();
    }




}
