import java.util.ArrayList;

public class Account {

  private double balance;
  private ArrayList<Transaction> transitionList = new ArrayList<>();

  /**
   * hi.
   *
   * @param amount .
   */
  private void deposit(double amount) {
    if (amount > 0) {
      balance += amount;
    } else {
      System.out.println("So tien ban nap vao khong hop le!");
    }
  }

  /**
   * hi.
   *
   * @param amount .
   */
  private void withdraw(double amount) {
    if (amount > balance) {
      System.out.println("So tien ban rut vuot qua so du!");
    } else if (amount > 0) {
      balance -= amount;
    } else {
      System.out.println("So tien ban rut ra khong hop le!");
    }
  }

  /**
   * hi.
   *
   * @param amount    .
   * @param operation .
   */
  public void addTransaction(double amount, String operation) {
    if (operation.equals(Transaction.DEPOSIT)) {
      deposit(amount);
      transitionList.add(new Transaction(Transaction.DEPOSIT, amount, this.balance));

    } else if (operation.equals(Transaction.WITHDRAW)) {
      withdraw(amount);
      transitionList.add(new Transaction(Transaction.WITHDRAW, amount, this.balance));
    } else {
      System.out.println("Yeu cau khong hop le!");
    }
  }

  /**
   * hi.
   */
  public void printTransaction() {
    for (int i = 0; i < transitionList.size(); i++) {
      double amount = transitionList.get(i).getAmount();
      double balance = transitionList.get(i).getBalance();
      if (transitionList.get(i).getOperation().equals(Transaction.DEPOSIT)) {
        System.out.printf("Giao dich %d: ", i + 1);
        System.out.printf("Nap tien $%.2f. ", amount);
        System.out.printf("So du luc nay: $%.2f.\n", balance);
      } else {
        System.out.printf("Giao dich %d: ", i + 1);
        System.out.printf("Rut tien $%.2f. ", amount);
        System.out.printf("So du luc nay: $%.2f.\n", balance);
      }
    }
  }

  public static void main(String[] args) {

  }
}
