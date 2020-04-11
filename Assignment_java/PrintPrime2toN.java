package assignment1;

import java.util.Scanner;

public class PrintPrime2toN {
	public static void main(String args[]) {
		 //Your Code Here
		System.out.println("Enter a Number:");
		 Scanner in=new Scanner(System.in);
		 int N=in.nextInt();
		for (int i = 2; i <= N; i++) {
			int count = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 0) {
				System.out.println(i + "");
			}

		}
	}

}
