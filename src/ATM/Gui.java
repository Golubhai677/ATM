package ATM;

import java.util.Scanner;

public class Gui{
    Scanner scanner = new Scanner(System.in);
    int cardNo;

    int loginPage(){
        System.out.print("Enter Card number: ");
        cardNo = scanner.nextInt();
        return cardNo;
    }

    void registrationPage(Account account){
        Bank bank = new Bank();

        System.out.print("Enter A/c Number: ");
        if(bank.findAccount(scanner.nextInt())){
            System.out.print("Set Pin: ");
            account.pin = scanner.nextInt();

            System.out.println("Generating Card Number...");
            account.cardNumber = bank.generateCard();

            System.out.println("Your Card Number is: " + account.cardNumber);
            System.out.println("Your Pin is: " + account.pin);

//            account.assignCard(account.cardNumber, account.pin);
        }
        else{
            System.out.println("Account number not found!");
        }
    }

    void printAcDetails(Bank b1){

        for(Account account : b1.accounts){
            account.printDetails();
        }
    }
}
