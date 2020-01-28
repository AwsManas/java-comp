import java.util.*;
class student {
 String usn;
 String name;
 String branch;
 int pno;
 void entry()
        {
        Scanner in  = new Scanner(System.in);
        System.out.println("Enter the details:-");
        this.usn = in.next();
        this.name = in.next();
        this.branch = in.next();
        this.pno = in.nextInt();
        }
void display()
        {
        System.out.println("The details are  :-");
        System.out.println(usn+"\t"+name+"\t"+branch+"\t"+pno);
        }
 public static void main(String a[])
        {
        int count = 3;
         student [] s = new student[10];
         for(int i=0; i<count; i++)
        {
        s[i] = new student();
        s[i].entry();
        }
        System.out.println("ID\tNAME\tBRANCH\tPHONE");
        for(int i=0; i<count; i++)
        s[i].display();
        }
}
