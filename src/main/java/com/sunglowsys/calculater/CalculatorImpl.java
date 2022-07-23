package com.sunglowsys.calculater;

import com.sunglowsys.coins.Coin;
import com.sunglowsys.coins.CoinBundle;

public class CalculatorImpl implements Calculator {

    @Override
    public int calculateTotal(CoinBundle enteredCoins) {
        return enteredCoins.getTotal();
    }

    @Override
    public CoinBundle calculateChange(int amountMoneyToReturn) {
        CoinBundle change = new CoinBundle(new int[7]);
        int remainingAmount = amountMoneyToReturn;
        change.number100RupeesCoins = remainingAmount / Coin.HUNDRED_RUPEES.getValue();
        remainingAmount = remainingAmount % Coin.HUNDRED_RUPEES.getValue();

        change.number50RupeesCoins = remainingAmount / Coin.FIFTY_RUPEES.getValue();
        remainingAmount = remainingAmount % Coin.FIFTY_RUPEES.getValue();

        change.number20RupeesCoins = remainingAmount / Coin.TWENTY_RUPEES.getValue();
        remainingAmount = remainingAmount % Coin.TWENTY_RUPEES.getValue();

        change.number10RupeesCoins = remainingAmount / Coin.TEN_RUPEES.getValue();
        remainingAmount = remainingAmount % Coin.TEN_RUPEES.getValue();

        change.number5RupeesCoins = remainingAmount / Coin.FIVE_RUPEES.getValue();
        remainingAmount = remainingAmount % Coin.FIVE_RUPEES.getValue();

        change.number2RupeesCoins = remainingAmount / Coin.TWO_RUPEES.getValue();
        remainingAmount = remainingAmount % Coin.TWO_RUPEES.getValue();

        change.number1RupeeCoins = remainingAmount / Coin.ONE_RUPEE.getValue();


        return change;
    }
}
