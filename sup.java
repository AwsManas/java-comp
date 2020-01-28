import java.util.*;
class sup
{
public static void main(String a[])
        {
        B obj = new B();
        System.out.println(obj.i+" "+obj.j);
        B obj2 = new B(1,5);
        System.out.println(obj2.i+" "+obj2.j);
        }
}
class A
{
int i;
A()
{
i= 3;
}
A(int i)
{
this.i = i;
}
}
class B extends A
{
int j;
B()
{
super(); // calling for default
j = 10+super.i;
}
B(int i,int j)
{
super(j);
this.j = i;
}
}
