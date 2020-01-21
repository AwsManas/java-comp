import java.util.*;
class token
{
  public static void main(String args[])
        {
        Scanner s = new Scanner(System.in);
        String inp = s.nextLine();
        StringTokenizer st = new StringTokenizer(inp);
        String ID = st.nextToken();
        String Fname = st.nextToken();
        String Lname = st.nextToken();
        String nm = Fname + " " + Lname;
        Float sal = Float.parseFloat(st.nextToken());
        System.out.print("Name = "+nm+" \n"+"ID =  "+ID+" \n"+"Sal = INR ");
        System.out.print(sal);
        }

}
