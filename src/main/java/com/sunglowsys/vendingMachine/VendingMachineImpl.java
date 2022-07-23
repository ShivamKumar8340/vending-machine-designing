package com.sunglowsys.vendingMachine;


import com.sunglowsys.controller.VendingMachineController;
import com.sunglowsys.controller.VendingMachineRequest;
import com.sunglowsys.coins.CoinBundle;
import com.sunglowsys.controller.VendingMachineControllerImpl;
import com.sunglowsys.products.Product;

public class VendingMachineImpl implements VendingMachine {

    private VendingMachineController controller = new VendingMachineControllerImpl();
    private int selectedProduct;
    private CoinBundle change;


    @Override
    public void displayProducts() {
        System.out.println(" *********************************************");
        System.out.println("     WELCOME TO THE VENDING MACHINE           ");
        System.out.println(" *********************************************");
        System.out.println("            Products available:               ");
        System.out.println("                                              ");
        for(Product product: Product.values()){
            if(!Product.EMPTY.equals(product)) {
                System.out.println("     " + product.getSelectionNumber() + "  " + product.name() + " - Price: " + product.getPrice() + "   ");
            }
        }
        System.out.println("                                              ");
        System.out.println(" Please select your product: ");


    }

    @Override
    public void selectProduct(int product) {
        this.selectedProduct = product;
    }

    @Override
    public void displayEnterCoinsMessage() {
        System.out.println(" Please enter coins/notes as follows: ");
        System.out.println(" num of 1 rupee coins,num of 2 rupees coins,num of 5 rupees coins,num of 10 rupees notes,num of 20 rupees notes,num of 50 rupees notes,num of 100 rupees notes  ");
        System.out.println("                                              ");
        System.out.println(" Example: If you would like to enter 2 ten rupees notes:0,0,0,2,0,0,0");
        System.out.println("Please enter coins/notes:");

    }

    @Override
    public void enterCoins(int... coins) {
        VendingMachineRequest request = new VendingMachineRequest(selectedProduct, coins);
        change = controller.calculateChange(request);

    }

    @Override
    public void displayChangeMessage() {
        System.out.println("                                              ");
        System.out.println("Your change is :"+ change.getTotal()+" rupees split as follows: ");
        System.out.println("    100 rupees notes: "+ change.number100RupeesCoins);
        System.out.println("    50 rupees notes: "+ change.number50RupeesCoins);
        System.out.println("    20 rupees notes: "+ change.number20RupeesCoins);
        System.out.println("    10 rupees notes: "+ change.number10RupeesCoins);
        System.out.println("    5 rupees notes: "+ change.number5RupeesCoins);
        System.out.println("    2 rupees coins: "+ change.number2RupeesCoins);
        System.out.println("    1 rupees coins: "+ change.number1RupeeCoins);

    }
}
