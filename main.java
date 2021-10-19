package raven.litrpg.game;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		variables.gameRunning = true;
		
		storyline.introSettings();
		storyline.basicStoryOne();
		
		Scanner scanner = new Scanner(System.in);
		
		while(variables.gameRunning) {			
			if(scanner.next("Stats") != null) {
				basicCmnds.stats();
			}
			
			
			
		}
		
		
		
		
		
		

	}

}
