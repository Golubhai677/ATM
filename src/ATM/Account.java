package ATM;

public class Account {
    int acNumber;
    String acHolderName;
    double balance;
    int cardNumber;
    int pin;

    Account(String acHolderName, int acNumber, double balance){
        this.acHolderName = acHolderName;
        this.acNumber = acNumber;
        this.balance = balance;
    }

    Account(Account account){
        this.acHolderName = account.acHolderName;
        this.acNumber = account.acNumber;
        this.balance = account.balance;
        this.cardNumber = account.cardNumber;
        this.pin = account.pin;
    }

    void printDetails(){
        System.out.println("your'e welcome " + acHolderName);
        System.out.println("Ac Number: " + acNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Pin: " + pin);
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
