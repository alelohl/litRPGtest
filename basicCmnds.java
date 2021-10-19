package raven.litrpg.game;

public class basicCmnds {

	static void stats() {
		
		//--------- General Stats --------------------------------------//
		System.out.println("/////////////////////////////////////////////");
		System.out.println("Name: " + variables.name);
		System.out.println("Class: " + variables.chosenClass);
		System.out.println("Level: " + variables.level);
		System.out.println("XP: " + variables.totalXpPoints + "/" + variables.maxXpPoints);
		System.out.println("Health: " + variables.totalHealth + "/" + variables.maxHealth);
		System.out.println("Mana: " + variables.totalMana + "/" + variables.maxMana);
		
		System.out.println("---------");
		
		//--------- Attribute Stats -----------------------------------//
		System.out.println("Vitality: " + variables.vitality);
		System.out.println("Strength: " + variables.strength);
		System.out.println("Agility: " + variables.agility);
		System.out.println("Intelligence: " + variables.intelligence);
		System.out.println("/////////////////////////////////////////////");
	}
	
}
