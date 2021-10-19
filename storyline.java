package raven.litrpg.game;

import java.util.Scanner;

public class storyline {

	static void introSettings() {
		
		Scanner scanner = new Scanner(System.in);
		
		//--------------- Name Setting ---------------------------------//
		System.out.println("What´s your name?");
		String inputName = scanner.nextLine();
		
		variables.name = inputName;
		
		System.out.println("Name: " + variables.name);
		
		//--------------- Class Setting --------------------------------//
		System.out.println("You can now choose your class.");
		System.out.println("The classes you can choose are: Warrior, Mage");
		String inputClass = scanner.nextLine();
		
		variables.chosenClass = inputClass;
		
		System.out.println("Your Class is now " + variables.chosenClass);
		
	}
	
	static void basicStoryOne() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("You can now choose to fight monster or rest");
		System.out.println("Do you want to Fight: Yes / No");
			
		if(scanner.next("Yes") != null) {
			variables.fight = true;
			return;
		}else {
			return;
		}
	}
	
}
