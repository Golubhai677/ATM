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

//    void assignCard(int cardNumber, int pin){
//        this.cardNumber = cardNumber;
//        this.pin = pin;
//    }

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
