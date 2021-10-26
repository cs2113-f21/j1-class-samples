import java.util.Scanner;

public class SplitExpense extends Expense{
    private String item;

    public SplitExpense(String descr, String item){
        super(descr + " (split meal)");
        this.item = item;
    }

    public void ask(Scanner sc){
        System.out.print("Enter the ammount of "+ this.item + ": ");
        double cost = sc.nextDouble();
        System.out.print("Enter the number of people:");
        int people = sc.nextInt();
        setAmount(cost/(double)people);
    }
    
}
