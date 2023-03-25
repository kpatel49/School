package Recursion;

import java.util.Scanner;

public class App2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many cookies in a jar?");
		int numOfCookies = input.nextInt();
		cookiesInJar(numOfCookies);

	}
	public static void cookiesInJar(int cookies) {
		
		//base case
		if(cookies == 0) {
			System.out.println("Whaaaaaang ... my cookies are all gone!!!!!");
		}
		else {
			System.out.println("I pick one cookie and eat one. Now I have "+ (cookies -1) + " in a jar");
			cookiesInJar(cookies - 1);
		}
	}

}
