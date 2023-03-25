/*
 * Class: Room
 * @author Kush Patel
 * @version 1.0
 * Course: ITEC 3860 Spring 2022
 * Written: 2/4/2022
 * 
 * This class - Runs the game.
 * 
 * 
 * */

package MiniGame1;

import java.io.*;
import java.util.*;

public class Game {

	public static void main(String[] args) throws Exception {

		List<Room> map = new ArrayList();

		File file = new File("C:\\Users\\kjp25\\eclipse-workspace\\ITEC3860\\src\\MiniGame1\\Room");
		Scanner read = new Scanner(file);
		List<String> temp = new ArrayList<String>();

		while (read.hasNextLine()) {
			temp.add(read.nextLine());
		}

		String[] roomArray = temp.toArray(new String[0]);

		for (int i = 0; i < roomArray.length; i += 3) {
			map.add(new Room(roomArray[i], roomArray[i + 1], roomArray[i + 2]));
		}

		Object[] tempMap = map.toArray(new Object[0]);

		Scanner input = new Scanner(System.in);

		int i = 0;
		int num = 1;
		System.out.println("Welcome to my adventure game. You will proceed through rooms based upon your entries.\n"
				+ "enter 1 to play the game\n");

		while (num != 0) {

			num = input.nextInt();

			if (num == 1) {
				System.out.println(tempMap[i]);
			} else if (num == 2) {
				System.out.println(tempMap[i + 1]);
			} else if (num == 3) {
				System.out.println(tempMap[i + 2]);
			} else if (num == 4) {
				System.out.println(tempMap[i + 3]);
			} else if (num == 5) {
				System.out.println(tempMap[i + 4]);
			} else if (num == 6) {
				System.out.println(tempMap[i + 5]);
			} else if (num == 7 || num == 8) {
				System.out.println(tempMap[i + 6]);
			} else if (num == 0) {
				break;
			} else {
				System.out.println("invalid input");
			}

		}

	}

}
