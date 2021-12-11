

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Bank {

  private List<Customer> customerList = new ArrayList<>();

  /**
   * hi.
   *
   * @param input is in.
   */
  public void readCustomerList(InputStream input) {
    Scanner scanner = new Scanner(input);
    Customer customer = null;
    while (scanner.hasNextLine()) {
      String line = scanner.nextLine();
      String[] customerInfo = line.split(" ");
      if (isInteger(customerInfo[customerInfo.length - 1])) {
        StringBuilder name = new StringBuilder();
        for (int i = 0; i < customerInfo.length - 1; i++) {
          name.append(customerInfo[i]).append(" ");
        }
        customer = new Customer(Long.parseLong(customerInfo[customerInfo.length - 1]),
            name.toString().trim());
        customerList.add(customer);
      } else {
        if (customerInfo[1].equals(Account.CHECKING)) {
          assert customer != null;
          customer.addAccount(new CheckingAccount(Long.parseLong(customerInfo[0]),
              Double.parseDouble(customerInfo[2])));
        } else if (customerInfo[1].equals(Account.SAVINGS)) {
          assert customer != null;
          customer.addAccount(new SavingsAccount(Long.parseLong(customerInfo[0]),
              Double.parseDouble(customerInfo[2])));
        }
      }
    }
  }

  /**
   * hi.
   *
   * @return is r.
   */
  public String getCustomersInfoByNameOrder() {
    List<Customer> list = new ArrayList<>(this.customerList);
    list.sort(Comparator.comparing(Customer::getFullName));
    StringBuilder ans = new StringBuilder();
    for (Customer customer : list) {
      ans.append(customer.getCustomerInfo()).append("\n");
    }
    return ans.toString().trim();
  }

  /**
   * hi.
   *
   * @return hi.
   */
  public String getCustomersInfoByIdOrder() {
    List<Customer> list = new ArrayList<>(this.customerList);
    list.sort(Comparator.comparing(Customer::getIdNumber));
    StringBuilder ans = new StringBuilder();
    for (Customer customer : list) {
      ans.append(customer.getCustomerInfo()).append("\n");
    }
    return ans.toString().trim();
  }

  public List<Customer> getCustomerList() {
    return customerList;
  }

  /**
   * hi.
   *
   * @param input is input.
   * @return hi.
   */
  private static boolean isInteger(String input) {
    try {
      Long.parseLong(input);
    } catch (NumberFormatException | NullPointerException e) {
      return false;
    }
    return true;
  }
}
