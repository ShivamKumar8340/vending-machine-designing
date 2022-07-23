package com.sunglowsys.controller;

import com.sunglowsys.coins.CoinBundle;

public interface VendingMachineController {

    CoinBundle calculateChange(VendingMachineRequest request);


}
