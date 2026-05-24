import java.io.*;
public class File {
    //public static class Input {
    public static void input(String m) {
        try (FileWriter writer = new FileWriter("test.txt")) {
            writer.write(m);
            System.out.println("file has been written");
        } catch (IOException e) {
            System.out.println("Could not write file");
        }
    }
    public static String output(int x) {
        try(BufferedReader reader=new BufferedReader(new FileReader("test.txt"))){
            System.out.println("That file exits");
            String line,line2;
//                line= reader.readLine();
//                String arr[]=line.split(" ");
            for(int i=0;i<2;i++) {
                line= reader.readLine();
                String arr[]=line.split(" ");
                int num = Integer.parseInt(arr[3]);
                if(x==num){
                    System.out.println("number found");
                    return line;
                }
                //System.out.println(arr[0]);
            }

        }
        catch(IOException e){
            System.out.println("something wrong");
        }
        return "0";
    }

    //}
}
