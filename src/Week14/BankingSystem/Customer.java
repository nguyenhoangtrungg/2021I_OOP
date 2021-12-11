package Week14.BankingSystem;

import java.util.ArrayList;
import java.util.List;

public class Customer {

  private long idNumber;
  private String fullName;
  private List<Account> accountList = new ArrayList<>();

  public Customer() {

  }

  /**
   * hi.
   *
   * @param idNumber is id.
   * @param fullName is full.
   */
  public Customer(long idNumber, String fullName) {
    this.idNumber = idNumber;
    this.fullName = fullName;
  }

  /**
   * hi.
   *
   * @return get cus.
   */
  public String getCustomerInfo() {
    return "Số CMND: " + idNumber + ". Họ tên: " + fullName + ".";
  }

  /**
   * hi.
   *
   * @param input is i.
   */
  public void addAccount(Account input) {
    accountList.add(input);
  }

  /**
   * hi.
   *
   * @param input is in.
   */
  public void removeAccount(Account input) {
    accountList.remove(input);
  }

  public long getIdNumber() {
    return idNumber;
  }

  public void setIdNumber(long idNumber) {
    this.idNumber = idNumber;
  }

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public List<Account> getAccountList() {
    return accountList;
  }
}
