package ATM;

public class Atm {
    User currentUser = new User();

    void validate(int acNumber, int pin){

    }

    void start(){
        Bank bank = new Bank();
        Gui gui = new Gui();

        gui.printAcDetails(bank);

        //login page
        int cardNum = gui.loginPage();
        if(bank.isAvailable(cardNum) && cardNum != 0){
            currentUser.account = new Account(bank.loadData(cardNum));
        }
        else{
            gui.throwError("Card not Available!");
        }

        //registration page
        int acNum = gui.registrationPage();
        if(bank.findAccount(acNum)){

        }
        else{
            gui.throwError("A/c not found!");
        }

//        gui.registrationPage(bank);
//        gui.registrationPage(bank, bank.ac2);

//        gui.printAcDetails(bank);
//
//        int cardno = gui.loginPage(bank);
//        System.out.println("Card no: " + cardno);
//        if(cardno != 0){
//            currentUser.account = new Account(bank.loadData(cardno));
//
//            System.out.println("currentUser Acno: " + currentUser.account.acNumber);
//            System.out.println("currentUser AcH: " + currentUser.account.acHolderName);
//            System.out.println("currentUser Ac bal: " + currentUser.account.balance);
//            System.out.println("currentUser Card: " + currentUser.account.cardNumber);
//            System.out.println("currentUser Pin: " + currentUser.account.pin);
//        }
//        System.out.println("currentUser " + );
    }
}
