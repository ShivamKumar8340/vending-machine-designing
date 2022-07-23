package com.sunglowsys.coins;

public enum Coin {
    ONE_RUPEE(1), TWO_RUPEES(2), FIVE_RUPEES(5), TEN_RUPEES(10),  TWENTY_RUPEES(20), FIFTY_RUPEES(50), HUNDRED_RUPEES(100);

    private final int value;

    Coin(int value){
        this.value = value;
    }

    public static int[] parseCoins(String coins){
        String[] numberCoinsInText = coins.split(",");
        int[] result = new int[numberCoinsInText.length];
        for(int index=0; index<numberCoinsInText.length; index++) {
            result[index] = Integer.parseInt(numberCoinsInText[index]);
        }
        return result;
    }

    public int getValue(){
        return this.value;
    }
}
