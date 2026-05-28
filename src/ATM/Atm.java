package ATM;

public class Atm {
    //int currentUserIndex;
    int cardNum;

    void start(){
        Bank bank = new Bank();
        Gui gui = new Gui();

        //for login
        while(true){
            cardNum = gui.welcomeScreen();
            if(bank.isAvailable(cardNum) && cardNum != 0){
                //currentUserIndex = bank.getIndex(cardNum);
                break;
            }
            else{
                gui.throwError("Card number not Available!");
            }
        }

        //gui.showDetails(bank.accounts.get(currentUserIndex));
        gui.showDetails(bank.account);

    }

}
