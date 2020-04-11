package assignment1;

import java.util.Scanner;

public class CheckPrime {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number which want to check whether prime or Not: ");
		int N=in.nextInt();
		int divisor=2;
		while(divisor<=N-1) {
			if(N % divisor==0) {
				System.out.println("Eneterd number is Not Prime");
				return;
			}
		}
		System.out.println("Entered number is Prime");
		System.out.println("Entered number is Prime");
	}

}

