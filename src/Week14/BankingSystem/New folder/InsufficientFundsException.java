

public class InsufficientFundsException extends BankException {

  public InsufficientFundsException(double input) {
    super(String.format("Số dư tài khoản không đủ $%.2f để thực hiện giao dịch", input));
  }
}