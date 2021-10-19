package raven.litrpg.game;

public class expLogic {

	//-------------------- Level Up function ----------------------------------------------------------------------------------------------------------------------//
	
	static void levelUp() {
		if (variables.totalXpPoints == variables.maxXpPoints) {
			variables.level++;
			System.out.println("You leveled up. You're now level: " + variables.level);
			
			variables.maxXpPoints = variables.maxXpPoints * 2;
			
			variables.vitality = variables.vitality + 5;
			variables.strength = variables.strength + 5;
			variables.agility = variables.agility + 5;
			variables.intelligence = variables.intelligence + 5;
			
			basicCmnds.stats();
			
		}
	}
	
}
