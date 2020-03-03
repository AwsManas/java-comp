import java.io.*;
import java.util.Scanner;
class rd
{
        public static void main(String a[])
        {
        try{
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the filename : ");
        String fname = s.nextLine();
        System.out.println("Reading file");
        //FileInputStream d = new FileInputStream(fname);
        File file = new File(".\\"+fname);
        BufferedReader br = new BufferedReader(new FileReader(file));
         String st;
         while ((st = br.readLine()) != null)
        System.out.println(st);
        }
        catch(Exception e)
        {
        System.out.println("OOPS");
        }
        }
}
