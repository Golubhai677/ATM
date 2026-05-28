package ATM;

import java.util.Scanner;

public class Gui {
    Scanner scanner = new Scanner(System.in);

    int welcomeScreen(){
        System.out.print("Enter your Card Number: ");
        return  scanner.nextInt();
    }

    void throwError(String massage){
        System.out.println("Error: " + massage);
    }

    //for debugging
    void showDetails(Account account){
        System.out.println("A/c Number: " + account.acNumber);
        System.out.println("Card Number: " + account.cardNumber);
        System.out.println("Pin: " + account.pin);
    }
}