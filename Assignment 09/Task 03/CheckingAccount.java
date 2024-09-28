public class CheckingAccount extends Account {
    public static int count;

    CheckingAccount() {
        super(0);
        CheckingAccount.count++;
    }
    CheckingAccount(double balance) {
        super(balance);
        CheckingAccount.count++;
    }
}
