package Week14.BankingSystem;

public class Transaction {

  public static final int TYPE_DEPOSIT_CHECKING = 0;
  public static final int TYPE_WITHDRAW_CHECKING = 1;
  public static final int TYPE_DEPOSIT_SAVINGS = 2;
  public static final int TYPE_WITHDRAW_SAVINGS = 3;

  private int type;
  private double amount;
  private double initialBalance;
  private double finalBalance;

  /**
   * hi.
   *
   * @param type           is ty.
   * @param amount         is am.
   * @param initialBalance is init.
   * @param finalBalance   is final.
   */
  public Transaction(int type, double amount, double initialBalance, double finalBalance) {
    this.type = type;
    this.amount = amount;
    this.initialBalance = initialBalance;
    this.finalBalance = finalBalance;
  }

  /**
   * hi.
   *
   * @param input is in.
   * @return in.
   */
  private String getTransactionTypeString(int input) {
    if (input == TYPE_DEPOSIT_CHECKING) {
      return "Nạp tiền vãng lai";
    }
    if (input == TYPE_WITHDRAW_CHECKING) {
      return "Rút tiền vãng lai";
    }
    if (input == TYPE_DEPOSIT_SAVINGS) {
      return "Nạp tiền tiết kiệm";
    }
    if (input == TYPE_WITHDRAW_SAVINGS) {
      return "Rút tiền tiết kiệm";
    }
    return null;
  }

  /**
   * hi.
   *
   * @return h.
   */
  public String getTransactionSummary() {
    return String.format("- Kiểu giao dịch: %s. Số dư ban đầu: $%.2f. "
            + "Số tiền: $%.2f. Số dư cuối: $%.2f.",
        getTransactionTypeString(type), initialBalance, amount, finalBalance);
  }

}
