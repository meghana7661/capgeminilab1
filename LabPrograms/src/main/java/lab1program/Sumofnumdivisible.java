package lab1program;
import java.util.*;
public class Sumofnumdivisible {
    static int calculatesum(int N)
    {
        
int sum=0;     
for(int i=0;i<N;i++) {
	if(i%3==0||i%5==0)
	{
		sum=sum+i;
	}
}
        return sum; }
	public static void main(String[] args) {
		System.out.println("enter your choice");

	Scanner sc=new Scanner(System.in);
        int N = sc.nextInt();
         
        System.out.println(calculatesum(N));sc.close();}}