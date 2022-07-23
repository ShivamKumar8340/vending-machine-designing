package com.sunglowsys;

import com.sunglowsys.coins.Coin;
import com.sunglowsys.vendingMachine.VendingMachine;
import com.sunglowsys.vendingMachine.VendingMachineImpl;

import java.util.Scanner;

public class TestVendingMachine {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        VendingMachine machineInterface = new VendingMachineImpl();

        machineInterface.displayProducts();

        String selectedProduct = scanner.nextLine();
        machineInterface.selectProduct(Integer.parseInt(selectedProduct));

        machineInterface.displayEnterCoinsMessage();

        String userEnteredCoins = scanner.nextLine();
        int[] enteredCoins = Coin.parseCoins(userEnteredCoins);
        machineInterface.enterCoins(enteredCoins);

        machineInterface.displayChangeMessage();

    }
}
