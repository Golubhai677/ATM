package ATM;

public class Atm {
    User currentUser;

    void validate(int acNumber, int pin){

    }

    void start(){
        Bank bank = new Bank();
        Gui gui = new Gui();

        gui.printAcDetails(bank);

        gui.registrationPage(bank.ac1);
        gui.registrationPage(bank.ac2);

        System.out.println("ac Card num: " + bank.ac1.cardNumber);
        System.out.println("ac Pin: " + bank.ac1.pin);

        gui.printAcDetails(bank);
    }
}
