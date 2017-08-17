import java.util.*;
class fact{
public static void main(String[] aaa){
int f=1,n;
Scanner s=new Scanner(System.in);
System.out.print("enter the number");
n=s.nextInt();
for(int i=2;i<=n;i++)
{
f*=i;
}
System.out.println("factorial of"+n+"is"+f);
}
}


OUTPUT:
enter the number6
factorial of 6 is720