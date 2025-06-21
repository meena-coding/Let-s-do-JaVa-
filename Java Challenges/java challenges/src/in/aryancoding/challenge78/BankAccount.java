package in.aryancoding.challenge78;

class BankAccount {

    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public void depositMoney(double money) {

        balance += money;
    }

    public double withdrawMoney(double money) {

        if (money <= 0) {
            System.out.println("Invalid withdrawal.");
        } else if (balance >= 0) {
            balance -= money;
        } else {
            money = balance;
            balance = 0;
        }
        return money;
    }

    public BankAccount(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
    }
}
