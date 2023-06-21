package Chapter8.BankPackage;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String bankName;
    private String sortCode;
    private Customer[] customers;
    // private ArrayList<Customer>customers;
//  private List<Customer>customers;

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getSortCode() {
        return sortCode;
    }

    public void setSortCode(String sortCode) {
        this.sortCode = sortCode;
    }

    public Customer[] getCustomers() {
        return customers;
    }

    public void setCustomers(Customer[] customers) {
        this.customers = customers;
    }



}
