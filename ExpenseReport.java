public class ExpenseReport {
  public static void main(String[] args) {
    Expense[] e = {
      new Expense("lodging"),
      new Expense("meals"),
      new Expense("incidentals"),
      new PerItemExpense("milage", "miles", 0.56),
      new SplitExpense("split meal","split meal")
      //new SplitMealExpense("split meal", /*,,,*/)
      // Enter the number of people in your party
      // Cost of the meal
      //divide it byt the nnumber of people to get your share
    };
    ReportGenerator.create(e);
  }
}
