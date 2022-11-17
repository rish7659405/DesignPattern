package main.factoryPattern;

public class GoldCoin implements Coin{
    public static final String GOLD_COIN="This is gold coin";

    @Override
    public String getDescription() {
        return GOLD_COIN;
    }
}
