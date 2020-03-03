import java.io.*;
import java.util.zip.*;
class com
{
        public static void main(String s[]) throws IOException
        {
        FileInputStream fis = new FileInputStream("F1.txt");
        FileOutputStream fos = new FileOutputStream("F2.txt");
        DeflaterOutputStream dos = new DeflaterOutputStream(fos);
//      FileInputStream f2is = new FileInputStream("F2.txt");
//      InflatorInputStream iis = new InflatorInputStream(f2is);
//      FileOutputStream f2os = new FileOutputStream("F3.txt");
        int data;
        while((data = fis.read())!=-1)
        dos.write(data);
        fis.close();
        dos.close();
        fos.close();
        System.out.println("Compression done");

        InputStream f2is = new FileInputStream("F2.txt");
        InflaterInputStream iis = new InflaterInputStream(f2is);
        FileOutputStream f2os = new FileOutputStream("F3.txt");
        while((data=iis.read())!=-1)
        f2os.write(data);
        iis.close();
        f2is.close();
        f2os.close();
}
}
/*
f1.txt:-
i am too fat
compress me please
please

f2.txt:-
x<9c>ËTHÌU(ÉÏWHK,áJÎÏ-(J-.VÈMU(ÈIM,Nå<82>R\^@^_'^M¿
*/
