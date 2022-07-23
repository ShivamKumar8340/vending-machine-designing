package com.sunglowsys.controller;

import com.sunglowsys.calculater.Calculator;
import com.sunglowsys.calculater.CalculatorImpl;
import com.sunglowsys.coins.CoinBundle;

public class VendingMachineControllerImpl implements VendingMachineController{
    private Calculator calculator = new CalculatorImpl();

    @Override
    public CoinBundle calculateChange(VendingMachineRequest request) {
        int total = calculator.calculateTotal(request.enteredCoins);
        int totalChange = total - request.product.getPrice();
        return calculator.calculateChange(totalChange);

    }
}
