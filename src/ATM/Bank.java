package ATM;

public class Bank {

    Account ac1 = new Account("sid", 1234, 1111, 13134);
    Account ac2 = new Account("fev", 1235, 1111, 5343);

    Account[] accounts = {ac1, ac2};

    boolean findAccount(int accountNo){
        for(Account account : accounts){
            if(account.acNumber == accountNo) return true;
        }
        return false;
    }
}