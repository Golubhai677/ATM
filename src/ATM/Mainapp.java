package ATM;

public class Mainapp {
    public static void main(){
        Bank b1 = new Bank();
        for(int i = 0; i < 2; i++){
            b1.accounts[i].check();
        }
    }
}
