package ATM;
import java.io.*;

public class File {

    public void input(String account) {

        try (FileWriter writer = new FileWriter("src//ATM//test.txt",true)) {
            writer.write(account+"\n");
            System.out.println("file has been written");
        } catch (IOException e) {
            System.out.println("Could not write file");
        }
    }

    public String output(int account_no) {

        try(BufferedReader reader=new BufferedReader(new FileReader("src//ATM//test.txt"))){
            System.out.println("That file exits");
            String line;
            int i=0;
            while((line=reader.readLine())!=null) {
                //line= reader.readLine();
                i++;
                String[] arr=line.split(" ");

                int num = Integer.parseInt(arr[0]);


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

