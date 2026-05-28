package ATM;

public class Bank {
   static int cardno = 5000;

   Account ac1 = new Account("sid", 1234, 13134);
   Account ac2 = new Account("fev", 1235, 5343);

   Account[] accounts = {ac1, ac2};


   int generateCard(){
       return cardno++;
   }

   boolean isAvailable(int cardno){
       for(Account account : accounts){
           if(account.cardNumber == cardno) return true;
       }
       return false;
   }

   Account loadData(int cardno){
       for(Account account : accounts){
           if(account.cardNumber == cardno) return account;
       }
       return null;
   }

   boolean findAccount(int accountNo){
       for(Account account : accounts){
           if(account.acNumber == accountNo) return true;
       }
       return false;
   }
// String filepath = "src//ATM//accounts.txt";

//     ArrayList<Account> accounts = new ArrayList<>();

//     Bank(){
//         readData();
//     }

//     String accountToString(Account account){
//         return account.acNumber + "," + account.acHolderName + "," + account.balance + "," + account.cardNumber + "," + account.pin;
//     }

//     Account stringToAccount(String rawData){
//         Account tempAc = new Account();

//         String[] arrOfData = rawData.split(",");

//         tempAc.acNumber = Integer.parseInt(arrOfData[0]);
//         tempAc.acHolderName = arrOfData[1];
//         tempAc.balance = Double.parseDouble(arrOfData[2]);
//         tempAc.cardNumber = Integer.parseInt(arrOfData[3]);
//         tempAc.pin = Integer.parseInt(arrOfData[4]);

//         return tempAc;
//     }

//     void writeData(ArrayList<Account> accounts){
//         try(FileWriter writer = new FileWriter(filepath)){
//
//             for(Account account : accounts){
//                 writer.write(accountToString(account) + "\n");
//             }
//             System.out.println("File has been written.");
//         } catch(IOException e){
//             System.out.println("Couldn't load file!");
//         }
//     }

//     void readData(){
//         try(BufferedReader reader = new BufferedReader(new FileReader(filepath))){
//             String line;
//
//             while((line = reader.readLine()) != null){
//                 accounts.add(stringToAccount(line));
//             }
//
//             System.out.println("Data retrieve Successfully.");
//         }
//         catch(IOException e){
//             System.out.println("something wrong");
//         }
//     }

//     int isAvailable(int acNum){
//         for(Account account : accounts){
//             if(account.acNumber == acNum) return accounts.indexOf(account);
//         }
//         return -1;
//     }
}