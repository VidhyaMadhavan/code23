import java.util.*;
class printprime
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int count,n;
System.out.print("range:");
n=sc.nextInt();
for(int i=2;i<n;i++)
{
count=0;
for(int j=2;j<i;j++)
{
if(i%j==0)
{
count++;
break;
}
}
if(count==0)
{
System.out.println(i);
}
}
}
}
