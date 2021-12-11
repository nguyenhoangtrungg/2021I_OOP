package Week14.BankingSystem;

import java.util.ArrayList;
import java.util.List;

public abstract class Account {

  public static final String CHECKING = "CHECKING";
  public static final String SAVINGS = "SAVINGS";

  protected long accountNumber;
  protected double balance;
  protected List<Transaction> transactionList = new ArrayList<>();

  public Account() {
  }

  /**
   * hi.
   *
   * @param accountNumber is aN.
   * @param balance       is b.
   */
  public Account(long accountNumber, double balance) {
    this.accountNumber = accountNumber;
    this.balance = balance;
  }

  public long getAccountNumber() {
    return accountNumber;
  }

  public double getBalance() {
    return balance;
  }

  /**
   * hi.
   *
   * @param input is in.
   */
  public void doDepositing(double input) throws BankException {
    if (input > 0) {
      this.balance += input;
    } else {
      throw new InvalidFundingAmountException(input);
    }
  }

  /**
   * hi.
   *
   * @param input is in.
   */
  public void doWithdrawing(double input) throws BankException {
    if (input > balance) {
      throw new InsufficientFundsException(input);
    } else if (input <= 0) {
      throw new InvalidFundingAmountException(input);
    } else {
      balance -= input;
    }
  }

  public abstract void deposit(double input);

  public abstract void withdraw(double input);

  /**
   * hi.
   */
  public String getTransactionHistory() {
    StringBuilder ans = new StringBuilder(
        "Lịch sử giao dịch của tài khoản " + accountNumber + ":\n");
    for (Transaction transaction : transactionList) {
      ans.append(transaction.getTransactionSummary()).append("\n");
    }
    return ans.toString();
  }

  /**
   * hi.
   *
   * @param input is in.
   */
  public void addTransaction(Transaction input) {
    transactionList.add(input);
  }

  @Override
  public boolean equals(Object that) {
    if (that == this) {
      return true;
    }

    if (!(that instanceof Account)) {
      return false;
    }

    Account c = (Account) that;
    return c.accountNumber == this.accountNumber;
  }
}
