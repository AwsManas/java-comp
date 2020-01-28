import java.util.*;
class runtime
{
 public static void main(String a[])
 {
  A ref  ;
  ref = new A();
  ref.show();
  ref = new B();
  ref.show();
 }
}
class A
{
 int i = 10;
 void show()
        {
        System.out.println("Inside Class A! "+i);
        }
}
class B extends A
{
int item = 3;
void show()
        {
        System.out.println("Inside class B!"+item+" "+super.i);
        }
}
