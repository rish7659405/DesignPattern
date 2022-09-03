package main.strategyPattern;

public class MultiplicationStrategy implements Strategy {
    @Override
    public void execute(int a, int b) {
        int c = a * b;
        System.out.println("Multiplication Strategy=" + c);
    }
}
