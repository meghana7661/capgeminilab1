package lab1program;

import java.util.Scanner;

public class DiffBtwSumofSq {
	static int calculateDifference(int n){
		 
		int l, k, m;
		    l = (n * (n + 1) * (2 * n + 1)) / 6;
		    k = (n * (n + 1)) / 2;
		    k = k * k;
		    m =  k-l;
		     
		    return m;
		 
		}
	public static void main(String[] args) {
		System.out.println("enter your choice");

		Scanner sc=new Scanner(System.in);
	        int n = sc.nextInt();
			    System.out.println(calculateDifference(n));    
			     sc.close();
			}
}
