package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("How much money would you like to start with?");
		double startAmount = in.nextDouble();
		System.out.println("What is the win chance?");
		double winChance = in.nextDouble();
		System.out.println("How many time would you like to play?");
		int simNum  = in.nextInt() + 1;
		double winLimit = startAmount + 40;
		double currentMoney = startAmount;
		int totalSimulations = 0;
		String result; 
		
		while (simNum > 1) {
			currentMoney = startAmount;
		while (currentMoney < winLimit && currentMoney>0 )
				{
				if (Math.random()< winChance) {
					currentMoney++; 
					
					totalSimulations++;
				}
				else {
					currentMoney--; 
					
					totalSimulations++;
				}
				
				}
			if (currentMoney==winLimit) {
			
				 result = "Win";
			}
			else {
				
				 result = "Lose";
			}
			simNum--;
			System.out.println("Simulation " + simNum + ": " + totalSimulations + " " + result);
		    
		}
		
	} 
		
	}
