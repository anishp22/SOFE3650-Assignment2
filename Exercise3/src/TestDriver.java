public class TestDriver {
    public static void main(String args[]){
        CashRegister cashRegister = new CashRegister();
        cashRegister.registerObservers();

        cashRegister.setCurrentProductUPC(111);         //scanned a product with upc code 111 which is milk
        cashRegister.updateInfo();

        cashRegister.setCurrentProductUPC(9999999);         //"manually" entered an upc, made it incorrect to also show what happens
        //when the upc is not in the DB
        cashRegister.updateInfo();

    }
}
