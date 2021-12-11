package Week14.BankingSystem;

public class SavingsAccount extends Account {

  public SavingsAccount() {
  }

  /**
   * hi.
   *
   * @param accountNumber is acc.
   * @param balance       is ba.
   */
  public SavingsAccount(long accountNumber, double balance) {
    super(accountNumber, balance);
  }

  @Override
  public void deposit(double input) {
    try {
      double money = getBalance();
      doDepositing(input);
      addTransaction(new Transaction(Transaction.TYPE_DEPOSIT_SAVINGS,
          input, money, getBalance()));
    } catch (BankException bankException) {
      System.out.println(bankException.getMessage());
    }
  }

  @Override
  public void withdraw(double input) {
    try {
      double money = getBalance();
      if (money >= 5000 && input <= 1000) {
        doWithdrawing(input);
        addTransaction(new Transaction(Transaction.TYPE_WITHDRAW_SAVINGS,
            input, money, getBalance()));
      }
    } catch (BankException bankException) {
      System.out.println(bankException.getMessage());
    }
  }
}
