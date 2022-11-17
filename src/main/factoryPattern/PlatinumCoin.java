package main.factoryPattern;

public class PlatinumCoin implements Coin{
    public static final String PLATINUM_COIN="This is Platinum coin";

    @Override
    public String getDescription() {
        return PLATINUM_COIN;
    }
}
