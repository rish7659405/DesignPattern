package main.strategyPattern;
import java.util.*;

public class StrategyMainPicker {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        StrategyContext strategyContext=new StrategyContext();
        System.out.println("enter your arithmetic strategy=\n");
        String x=sc.nextLine();
        System.out.println("enter your first number=\n");
        int m=sc.nextInt();
        System.out.println("enter your second number=\n");
        int l=sc.nextInt();
        if(x.equalsIgnoreCase("additionStrategy"))
        {strategyContext.setStrategy(new AdditionStrategy());
        }
        else if(x.equalsIgnoreCase("subtractionStrategy"))
        {strategyContext.setStrategy(new SubtractionStrategy());
        }
        else if(x.equalsIgnoreCase("multiplication"))
        {strategyContext.setStrategy(new MultiplicationStrategy());
        }
        else{System.out.println("strategy not supported");}
        if(Objects.nonNull(strategyContext.getStrategy()
        ))strategyContext.execute(m,l);
    }
}
