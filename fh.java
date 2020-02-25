import java.io.*;
import java.util.*;
class fh
{
public static void main(String args[])
        {
        try
        {
        Scanner s = new Scanner(System.in);
        String ch = s.nextLine();
        FileWriter fw=new FileWriter("file.txt");
        fw.write(ch);
        fw.close();
        }
        catch(Exception e)
        {
        System.out.println("An exception occured!");
        }
}
}
