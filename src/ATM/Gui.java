package ATM;

import java.util.Scanner;

public class Gui{
    Scanner scanner = new Scanner(System.in);
    int cardNo;

    int loginPage(Bank bank){
        System.out.print("Enter Card number: ");
        int cardno = scanner.nextInt();
        if(bank.isAvailable(cardno)){
            return cardno;
        }
        else{
            System.out.println("ERROR: Card number not found!");
            return 0;
        }
    }

    void registrationPage(Bank bank){

        System.out.print("Enter A/c Number: ");
        Account account = new Account(bank.findAccount(scanner.nextInt()));

        account.printDetails();

//        if(account){
//            System.out.print("Set Pin: ");
//            account.pin = scanner.nextInt();
//
//            System.out.println("Generating Card Number...");
//            account.cardNumber = bank.generateCard();
//
//            System.out.println("Your Card Number is: " + account.cardNumber);
//            System.out.println("Your Pin is: " + account.pin);
//
//        }
//        else{
//            System.out.println("Account number not found!");
//        }
    }

    void printAcDetails(Bank b1){

        for(Account account : b1.accounts){
            account.printDetails();
        }
    }
}
