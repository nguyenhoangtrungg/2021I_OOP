package Week14.BankingSystem;

public class CheckingAccount extends Account {

  public CheckingAccount() {
  }

  /**
   * hi.
   *
   * @param accountNumber is ac.
   * @param balance       is b.
   */
  public CheckingAccount(long accountNumber, double balance) {
    super(accountNumber, balance);
  }

  @Override
  public void deposit(double input) {
    try {
      double money = getBalance();
      doDepositing(input);
      addTransaction(new Transaction(Transaction.TYPE_DEPOSIT_CHECKING,
          input, money, getBalance()));
    } catch (BankException bankException) {
      System.out.println(bankException.getMessage());
    }
  }

  @Override
  public void withdraw(double input) {
    try {
      double money = getBalance();
      doWithdrawing(input);
      addTransaction(new Transaction(Transaction.TYPE_WITHDRAW_CHECKING,
          input, money, getBalance()));
    } catch (BankException bankException) {
      System.out.println(bankException.getMessage());
    }
  }
}
