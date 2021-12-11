package Week14.BankingSystem;

import org.junit.Assert;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Main {

  public static void main(String[] args) throws FileNotFoundException {
    Bank bank = new Bank();
    File file = new File("E:\\GitHub\\2021I_OOP\\src\\Week14\\BankingSystem\\input.txt");
    InputStream inputStream = new FileInputStream(file);
    bank.readCustomerList(inputStream);
    System.out.println(bank.getCustomersInfoByIdOrder());

    Customer cus1 = bank.getCustomerList().get(0);
    System.out.println(cus1.getAccountList());

    Account acc1 = cus1.getAccountList().get(0);
    acc1.deposit(100);
    acc1.deposit(-1);
    acc1.withdraw(50);

    System.out.println(acc1.getTransactionHistory());

    Account acc2 = cus1.getAccountList().get(1);
    acc2.deposit(100);
    acc2.withdraw(1200);
    System.out.println(acc2.getTransactionHistory());
  }
}
