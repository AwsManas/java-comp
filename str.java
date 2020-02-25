import java.util.*;
class str
{
public static void main(String a[])
        {
        String s2 = new String("LoL - ");
        String s = "HEllo World"; // Literal string
        System.out.println("Character at pos 5 = "+s.charAt(5));
        System.out.println("Lenght of string is "+s.length());
        System.out.println("Substring b/w pos 5 and 10 = "+s.substring(5,10));
        System.out.println(s2.concat(s));
        System.out.println("Index of world = "+s.indexOf("World"));
        System.out.println(s.equals(s2));
        System.out.println(s2.trim());
        System.out.println(s2.replace('L','o'));
        }
}
