package lab1program;

import java.util.Scanner;

public class PowerOf2 {

	
		
public static boolean checkNumber(int n)
{
while(n%2==0)
{
n=n/2;
}
if(n==1)
{
return true;
}
else
{
return false;
}
}
public static void main(String[] args) {
	System.out.println("enter your choice");

	Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();    
	    System.out.println(checkNumber(n));    

}}