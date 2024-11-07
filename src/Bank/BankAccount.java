package Bank;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BankAccount  {
    private String accountNumber;
    private double balance;
    private List<Transaction> transactionHistory = new ArrayList<>();


    public BankAccount(String accountNumber) {

        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public List<Transaction> getTransactionHistory() {
        return transactionHistory;
    }

    public void setTransactionHistory(List<Transaction> transactionHistory) {
        this.transactionHistory = transactionHistory;
    }

    public void deposit (double amount){
        setBalance(balance+amount);
//        String amountStringified = amount + "kd deposited to your account,\n current balance: "+ balance;
        Date date = new Date();
        Transaction transaction = new Transaction(date,"deposit", amount);
        this.transactionHistory.add(transaction);
    }
    public void withdrawal(double amount){
        if (balance> amount){
        balance -=amount;
        Date date = new Date();
        Transaction transaction = new Transaction(date,"withdrawal", amount);
        this.transactionHistory.add(transaction);
    }}
    public void displayTransactionHistory(){
        System.out.println(transactionHistory.toString());;
    }

}
