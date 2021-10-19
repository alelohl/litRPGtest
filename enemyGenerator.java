package raven.litrpg.game;

public class enemyGenerator {
	
	static void generateSkeleton() {
		System.out.println("A Skeleton appeared");
		
		//---------------- Attributes of a Skeleton ---------------------------------------------------------------------------------------------------------------------------------------------------------------//
		System.out.println("/////////////////////////////////////////////");
		System.out.println("Name: Skeleton");
		System.out.println("Class: Skeleton Warrior");
		System.out.println("Level: " + variables.mobLevel);
		System.out.println("Health: " + variables.mobTotalHealth + "/" + variables.mobMaxHealth * (int) (Math.random() * ((10 - 5) + 5)));  //--Randomly generates a max health value in a range of 5 - 10
		System.out.println("Mana: " + variables.mobTotalMana + "/" + variables.mobMaxMana * (int) (Math.random() * ((10 - 5) + 5)));
		System.out.println("/////////////////////////////////////////////");
	}
	
  }
	
