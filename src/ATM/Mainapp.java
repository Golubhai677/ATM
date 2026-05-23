package ATM;

public class Mainapp {
    public static void main(){
        BankAccount account = new BankAccount();

        account.acHolderName = "sidharth";
        account.balance = 2344;

        System.out.println(account.acHolderName);
    }
}
