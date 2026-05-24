package ATM;

public class Account {
    int acNumber;
    String acHolderName;
    int pin;
    double balance;
    int cardNumber;

    Account(String acHolderName, int acNumber, int pin, double balance){
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
