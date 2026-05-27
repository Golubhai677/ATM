package ATM;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
import javax.swing.*;
 class frame extends JFrame implements ActionListener{
    JTextField Text;
    JButton[] numButtons = new JButton[10];
    String s0="",s1="",s2="";
     frame()
    {
        setTitle("Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Display field
        Text = new JTextField(15);
        Text.setEditable(false);
        Text.setBackground(Color.WHITE);
        Text.setHorizontalAlignment(JTextField.RIGHT);
         JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 5, 5)); // 4x4 grid with spacing
        panel.setBackground(Color.BLUE);
        //button field
        for(int i=0;i<=9;i++)
        {
            numButtons[i]=new JButton(String.valueOf(i));
            numButtons[i].addActionListener(this);
        }
        //add field
        panel.add(Text);
        for(int i=0;i<=9;i++)
        {
            panel.add(numButtons[i]);
        }
        
    }
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();

        if (s.charAt(0) >= '0' && s.charAt(0) <= '9') {
            if (!s1.equals("")) {
                s2 += s;
            } else {
                s0 += s;
            }
            Text.setText(s0 + s1 + s2);
        } else if (s.equals("C")) {
            s0 = s1 = s2 = "";
            Text.setText("");
        } else if (s.equals("=")) {
            double result = 0;
            if (s1.equals("+"))
                result = Double.parseDouble(s0) + Double.parseDouble(s2);
            else if (s1.equals("-"))
                result = Double.parseDouble(s0) - Double.parseDouble(s2);
            else if (s1.equals("*"))
                result = Double.parseDouble(s0) * Double.parseDouble(s2);
            else if (s1.equals("/"))
                result = Double.parseDouble(s0) / Double.parseDouble(s2);

            Text.setText(String.valueOf(result));
            s0 = String.valueOf(result);
            s1 = s2 = "";
        } else {
            s1 = s;
            Text.setText(s0 + s1 + s2);
        }
    }
};
public class Gui 
{
    Scanner scanner = new Scanner(System.in);

    int registrationPage(){
        System.out.print("Enter A/c Number: ");
        return scanner.nextInt();
    }

    int loginPage(){
        System.out.print("Enter Card number: ");
        return scanner.nextInt();
//        int cardno = scanner.nextInt();
//        if(bank.isAvailable(cardno)){
//            return cardno;
//        }
//        else{
//            System.out.println("ERROR: Card number not found!");
//            return 0;
//        }
    }

//    void registrationPage(Bank bank){
//
//        System.out.print("Enter A/c Number: ");
//        Account account = new Account(bank.findAccount(scanner.nextInt()));
//
//        account.printDetails();

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
//    }

    void throwError(String massage){
        System.out.println("Error: " + massage);
    }

    void printAcDetails(Bank b1){

        for(Account account : b1.accounts){
            account.printDetails();
        }
    }
}
