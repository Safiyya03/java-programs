import java.io.*;
import java.lang.*;
import java.util.*;
public class EMail
{
public static void main(String[] args)throws IOException
{
System.out.println("Email.");
Properties prop=new Properties();
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
String name,mail_id;
FileInputStream fin=null;
Boolean changed=false;
try
{
fin=new FileInputStream("phonebook.dat");
}
catch(FileNotFoundException e)
{
}
try
{
if(fin!=null)
{
prop.load(fin);
fin.close();
}
}
catch(IOException e)
{
System.out.println("Error.");
}
do
{
System.out.println("Enter Name:");
name=br.readLine();
if(name.equals("quit"))
continue;
System.out.println("Enter E-Mail ID:");
mail_id=br.readLine();
prop.put(name,mail_id);
changed=true;
}
while(name.equals("quit"));
if(changed)
{
FileOutputStream fout=new
FileOutputStream("phone book.txt");
prop.store(fout,"address book");
fout.close();
}
do
{
System.out.println("Enter");
name=br.readLine();
if(name.equals("quit"))
break;
mail_id=(String)prop.get(name);
if(mail_id!=null)
{
System.out.println("Your Name:"+name);
System.out.println("Mail Id Is"+mail_id);
}
}
while(true);
}
}

