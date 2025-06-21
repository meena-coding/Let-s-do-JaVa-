package in.aryancoding.challenge78;

public class cutomer {

    public static void main(String[] args) {

        BankAccount account = new BankAccount("0934","Aryan Kankarwal");

        account.depositMoney(500);
        account.withdrawMoney(600);
        System.out.println(account.withdrawMoney(600));
        account.depositMoney(-98);
        account.withdrawMoney(0);
    }
}
