package com.sunglowsys.calculater;

import com.sunglowsys.coins.CoinBundle;

public interface Calculator {
    int calculateTotal(CoinBundle enteredCoins);
    CoinBundle calculateChange(int enteredByUserMoney);
}
