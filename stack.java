import java.util.*;
class stack
{
int top = -1;
int [] s = new int[10];
int max = 10;
void push(int ele)
        {
        if(top==max-1)
        System.out.println("Overflow!");
        else
                {
                s[++top] = ele;
                }
        }
        void  pop ()
        {
        if(top==-1)
        {
        System.out.println("Underflow!");
        }
        else
        {
        System.out.println("Popped value is "+s[top]);
         top--;
        }
        }
void display()
        {
        for(int i=0; i<=top; i++)
        System.out.print(s[i]+" ");
        System.out.println();
        }
public static void main(String a[])
        {
        Scanner in = new Scanner(System.in);
        stack p = new stack();
         while(true)
        {
        System.out.println("1:Push 2:Pop 3: Display 4:Exit");
        int ch = in.nextInt();
        switch(ch)
        {
         case 1 : int ele = in.nextInt();
                  p.push(ele);
                  break;
        case  2 : p.pop();
                  break;
        case 3 : p.display();
                  break;
        case 4 : System.exit(0);
        default :
        }
        }
        }
}
                   
