class thrs
{
        public static void main(String args[])
        {
        div ob = new div();
        try
        {
        ob.d(10,0);
        }
        catch(ArithmeticException e)
                {
                System.out.println(e.getMessage());
                }
        }
}
class div
{
 int d(int a,int b) throws ArithmeticException
        {
        if(b==0)
        throw new ArithmeticException("Thrown out lol");
        else
        return a/b;
        }
}
