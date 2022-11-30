package com.bridgelabz;

public class SnakeAndLadder {
	public static void main(String[] args) {
		int playerPosition = 0;
		System.out.println("Position of player is " + playerPosition);
		// To Get Number Between 1-6
		int randomCheck = (int) Math.floor(Math.random() * 10) % 6 + 1;
		System.out.println(randomCheck);
}
}
