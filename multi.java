class multi
{
        public static void main(String args[])
        {
        C ob = new C();
        ob.data();
        ob.info();
        }
}
interface A
{
        public void  data();
}
interface B
{
        public  void data();
        public  void info();
}
class C implements A,B
{
        public void data()
        {
        System.out.println("In function data");
        }
        public void info()
        {
        System.out.println("In function info");
        }
}
