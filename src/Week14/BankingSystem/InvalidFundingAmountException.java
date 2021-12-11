package Week14.BankingSystem;

public class InvalidFundingAmountException extends BankException {

  public InvalidFundingAmountException(double input) {
    super(String.format("Số tiền không hợp lệ: $%.2f", input));
  }
}
