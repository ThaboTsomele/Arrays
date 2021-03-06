/*
*
*	Write a program to collect scores (they range from 0 to 100) and then provide some
*	statistics about the set of data. Write a program in Java that asks the user to enter
*	a score. You will store this score into an array. This happens over and over again until
*	the user enters -1 to stop.

*	Solve this without importing ArrayList class. 
*	Initialize size of an array to 0
*	Expand the size of the array by 1 on each new input.
*
*/

import java.util.Scanner;
import java.util.Arrays;

class Main{
		
	private static int initialSize = 0;	
	private static int[] scores = new int[initialSize];
	private static Scanner input;
	private static int index;
	
	public static void main(String[] args){
		displayMainMenu();
		input = new Scanner(System.in);
		int scoreInput = input.nextInt();
		
		switch(scoreInput){
			case 1:
				System.out.println("ENTER -1 TO EXIT \n");
				do{
					System.out.print("Enter a score >: ");
					scoreInput = input.nextInt();
					if(scoreInput != -1){
						if(scoreInput >= 0 && scoreInput <= 100){
							initialSize = initialSize+1;
							int[] tempArray = new int[initialSize];
							for(int i=0; i<scores.length; i++){     
								tempArray[i] = scores[i];
							}
							scores = tempArray;
							scores[index++] = scoreInput;
						}else{
							System.out.println("Enter a score between 0 and 100:");
						}
					}
				}while(scoreInput != -1);
			break;
			case 0:
				System.out.println("Exiting the app.....");
				System.exit(0);
			break;
		}
		displayScore();
	}
	
	public static void displayScore(){
		if(scores.length != 0){
			System.out.println("\nScores entered: "+Arrays.toString(scores));
		}
	}
	
	public static void displayMainMenu(){
		System.out.println("\n\t\tSCORES MENU\n");
		System.out.println("1. Enter 1 to enter scores: ");
		System.out.println("2. Enter 0 to exit the application: ");
		System.out.print(">: ");
	}
}
