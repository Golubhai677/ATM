package ATM;

public class Bank {
    static int cardno = 5000;

    Account ac1 = new Account("sid", 1234, 13134);
    Account ac2 = new Account("fev", 1235, 5343);

    Account[] accounts = {ac1, ac2};

    int generateCard(){
        return cardno++;
    }

    boolean isAvailable(int cardno){
        for(Account account : accounts){
            if(account.cardNumber == cardno) return true;
        }
        return false;
    }

    Account loadData(int cardno){
        for(Account account : accounts){
            if(account.cardNumber == cardno){
                return account;
            }
        }
        return null;
    }

    boolean findAccount(int accountNo){
        for(Account account : accounts){
            if(account.acNumber == accountNo) return true;
        }
        return false;
    }
}