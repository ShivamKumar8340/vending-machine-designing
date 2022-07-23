package com.sunglowsys.coins;

public class CoinBundle {
    public int number1RupeeCoins;
    public int number2RupeesCoins;
    public int number5RupeesCoins;
    public int number10RupeesCoins;
    public int number20RupeesCoins;
    public int number50RupeesCoins;
    public int number100RupeesCoins;

    public CoinBundle(int... enteredCoins) {
        this.number1RupeeCoins = enteredCoins[0];
        this.number2RupeesCoins = enteredCoins[1];
        this.number5RupeesCoins = enteredCoins[2];
        this.number10RupeesCoins = enteredCoins[3];
        this.number20RupeesCoins = enteredCoins[4];
        this.number50RupeesCoins = enteredCoins[5];
        this.number100RupeesCoins = enteredCoins[6];

    }


    public int getTotal(){
        int total = 0;
        total = total + this.number1RupeeCoins* Coin.ONE_RUPEE.getValue();
        total = total + this.number2RupeesCoins*Coin.TWO_RUPEES.getValue();
        total = total + this.number5RupeesCoins* Coin.FIVE_RUPEES.getValue();
        total = total + this.number10RupeesCoins*Coin.TEN_RUPEES.getValue();
        total = total + this.number20RupeesCoins*Coin.TWENTY_RUPEES.getValue();
        total = total + this.number50RupeesCoins*Coin.FIFTY_RUPEES.getValue();
        total = total + this.number100RupeesCoins*Coin.HUNDRED_RUPEES.getValue();
        return total;
    }
}
