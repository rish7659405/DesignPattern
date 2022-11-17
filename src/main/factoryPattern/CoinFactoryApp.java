package main.factoryPattern;

import java.util.*;

public class CoinFactoryApp {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the coin type");
        String value=sc.nextLine();
        CoinFactoryBuilder coinFactoryBuilder=new CoinFactoryBuilder();
        Coin coin= Optional.ofNullable(coinFactoryBuilder.getCoin(value)).orElse(null);
        if(Objects.nonNull(coin))
            System.out.println(coin.getDescription());
        else
            System.out.println("coin not available");





    }

}
