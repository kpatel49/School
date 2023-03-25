package Recursion;

import java.util.Scanner;

public class TowerOfHanoi {
  /** Main method */
  public static void main(String[] args) {
    // Create a Scanner
    Scanner input = new Scanner(System.in);
    System.out.print("Enter number of disks: ");
    int n = input.nextInt();

    // Find the solution recursively
    System.out.println("The moves are:");
    moveDisks(n, "start", "finish", "intermediate");
  }

  /** The method for finding the solution to move n disks
      from fromTower to toTower with auxTower */
  public static void moveDisks(int n, String start,
      String finish, String intermediate) {
    if (n == 1) // Stopping condition
      System.out.println("Move disk " + n + " from " +
        start + " to " + finish);
    else {
      moveDisks(n - 1, start, intermediate, finish);
      System.out.println("Move disk " + n + " from " +
        start + " to " + finish);
      moveDisks(n - 1, intermediate, finish, start);
    }
  }
}