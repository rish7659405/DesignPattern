package main.strategyPattern;

public class SubtractionStrategy implements Strategy {
    @Override
    public void execute(int a, int b) {
        int c = Math.abs(a - b);
        System.out.println("implementing absolute subtraction=" + c);
    }
}
