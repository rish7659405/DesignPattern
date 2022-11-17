package main.factoryPattern;

public class TitaniumCoin implements  Coin{
    public static final String TITANIUM_COIN="This is Titanium coin";

    @Override
    public String getDescription() {
        return TITANIUM_COIN;
    }
}

