package problemSolving; 

import java.util.Scanner;
import java.io.*;
import java.util.*;

public class GCD {
	static int gcd(int a, int b) {
		if (a%b==0) {
			return b;
		}
		else {
			return gcd(b, a%b);
		}
	}
	public static void main(String[] args)throws IOException {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 1st number : ");
		int a = input.nextInt();
		System.out.println("Enter 2nd number : ");
		int b = input.nextInt();
		System.out.println("GCD of "+a+" & "+b+" is : "+gcd(a,b));
	}
}