
package bankaccount;

public class Bankaccount {
private String accountNumber;
    private double balance;

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
    public void displayInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
    public static void main(String[] args) {
        Bankaccount b =new Bankaccount();
        b.setAccountNumber("395773");
        b.setBalance(4587);
        b.displayInfo();
    }
    
}
