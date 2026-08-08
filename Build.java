public class Build
{
public static void main(String[]args)
{
int a[]={5,10};
int b=5;
try
{
int x=a[2]/b-a[1];
}
catch(ArithmeticException e)
{
System.out.println("Division by Zero");
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Build In Exception");
System.out.println("");
System.out.println("Array Index Error");
}
catch(ArrayStoreException e)
{
System.out.println("Wrong Data Type");
}
int y=a[1]/a[0];
System.out.println("y="+y);
}
}
