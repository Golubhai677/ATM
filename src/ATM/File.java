package ATM;
import java.io.*;

public class File {

    public void input(String account) {

        try (FileWriter writer = new FileWriter("test.txt")) {
            writer.write(account);
            System.out.println("file has been written");
        } catch (IOException e) {
            System.out.println("Could not write file");
        }
    }

    public String output(int account_no) {

        try(BufferedReader reader=new BufferedReader(new FileReader("test.txt"))){
            System.out.println("That file exits");
            String line;

            for(int i=0;i<2;i++) {
                line= reader.readLine();
                String arr[]=line.split(" ");

                int num = Integer.parseInt(arr[3]);

                if(account_no==num){
                    System.out.println("number found");
                    return line;
                }
            }

        }
        catch(IOException e){
            System.out.println("something wrong");
        }
        return null;
    }
}

