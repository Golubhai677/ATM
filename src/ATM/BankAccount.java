package ATM;

public class BankAccount {
    int acNumber;
    String acHolderName;
    int pin;
    double balance;

    BankAccount(String acHolderName, int acNumber, int pin, double balance){
        this.acHolderName = acHolderName;
        this.acNumber = acNumber;
        this.pin = pin;
        this.balance = balance;
    }

    void check(){
        System.out.println("your'e welcome " + acHolderName);
    }

    void withdraw(double amount){

    }

    void deposit(double amount){

    }

    void checkBalance(){

    }

    void changePin(int newPin){

    }

}
