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
            System.out.println("Your Card Number is: 123456");
            account.cardNumber = 123456;
        }
        else{
            System.out.println("Account number not found!");
        }
    }
}
