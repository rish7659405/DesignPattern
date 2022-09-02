package main.strategyPattern;

public class AdditionStrategy implements Strategy {

    @Override
    public void execute(int a, int b) {
        int c=a+b;
        System.out.println("execute addition="+c);
    }
}
