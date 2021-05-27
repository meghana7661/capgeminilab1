package lab1program;
import java.util.Scanner;
public class FibonacciUsingRecursion {
	public static int fibonacciRecursion(int n){
		if(n == 0){
			return 0;}
		if(n == 1 || n == 2){
				return 1;
			}
		return fibonacciRecursion(n-2) + fibonacciRecursion(n-1);
		}
	         
	public static void main(String[] args) {

		System.out.println("enter your choice");

		Scanner sc=new Scanner(System.in);
	        int max = sc.nextInt();  		
	        System.out.print("Fibonacci Series of "+max+" numbers: ");
			for(int i = 0;
					i < max;
					i++){   
					System.out.print(fibonacciRecursion(i) +" ");//
				}
			}}