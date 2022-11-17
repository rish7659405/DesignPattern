package main.factoryPattern;

public class CoinFactoryBuilder {

    public Coin getCoin(String type)
    {
        if(CoinType.GOLD.name().equalsIgnoreCase(type))
        {return new GoldCoin();}
        else if(CoinType.PLATINUM.name().equalsIgnoreCase(type))
        {return new PlatinumCoin();}
        else if(CoinType.TITANIUM.name().equalsIgnoreCase(type))
        {return new TitaniumCoin();}
        return null;

    }
}
