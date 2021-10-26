import java.util.*;

public class PerItemExpense extends Expense {
    private double rate;
    private String item;

    public PerItemExpense(String descrip,
                          String item,
                          double rate){
        super(descrip + "(at " + rate +"dollars per " + item +")");
        this.rate = rate;
        this.item = item;
    }

    public void ask(Scanner sc){
        System.out.println("Enter amount of " + item + ": ");
        setAmount(sc.nextDouble()*rate);
    }

    
}
