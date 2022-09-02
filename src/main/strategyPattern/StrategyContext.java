package main.strategyPattern;

public class StrategyContext {
    private Strategy strategy;

    public void setStrategy(Strategy strategy)
    {
        this.strategy=strategy;
    }
    public Strategy getStrategy()
    {return this.strategy;}

    public void execute(int a ,int b)
    {
        strategy.execute(a,b);
    }
}
