import java.util.*;
class thr
{
 public static void main(String args[])
        {
        Scanner s = new Scanner(System.in);
           try
                {
                int a = 10;
                int b = s.nextInt();
                if(b==0)
                throw new ArithmeticException("Message");
                int c= a/b;
                System.out.println(c);
                }
                catch(ArithmeticException e)
                {
                System.out.println(e.getMessage());
                }
                finally
                {
                System.out.println("Here after everything");
                }
        }
}
