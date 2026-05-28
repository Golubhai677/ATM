package ATM;

public class Account {
    int acNumber;
    String acHolderName;
    double balance;
    int cardNumber;
    int pin;

    void printDetails(){
        System.out.println("Ac Number: " + acNumber);
        System.out.println("Ac Holder Name: " + acHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Pin: " + pin);
    }

}