import java.util.Random;
public class Number
{
public static void main(String[]args)
{
Random num=new Random();
int i,j,swap=0;
int a[]=new int[10];
int c=a.length;
for(i=0;i<c;i++)
a[i]=num.nextInt(100);
System.out.println("Random Numbers:");
for(i=0;i<c;i++)
System.out.println(+a[i]);
for(i=0;i<c;i++)
{
for(j=0;j<c;j++)
{
if(a[i]>a[j])
{
swap=a[i];
a[i]=a[j];
a[j]=swap;
}
}
}
System.out.println("Descending Order:");
for(i=0;i<c;i++)
{
System.out.println(+a[i]);
}
}
}
