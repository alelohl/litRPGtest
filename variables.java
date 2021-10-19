package raven.litrpg.game;

public class variables {

	//-------------- Game run variable --------------------//
	public static boolean gameRunning;
	
	//-------------------- Player Stats -------------------//
	public static String name;
	public static int level = 0;
	
	public static String chosenClass;
	
	public static int vitality = 5;;
	public static int strength = 10; 
	public static int agility = 10;
	public static int intelligence = 10;
	
	public static int maxHealth = vitality;
	public static int totalHealth = maxHealth;
	
	public static int maxMana = 5;
	public static int totalMana = maxMana;
	
	public static int maxXpPoints = 100;
	public static int totalXpPoints = 0;
	
	//--------------------- Monster Stats ------------------//
	public static String mobName;
	public static int mobLevel = 1;
	
	public static int mobVitality = 5;
	public static int mobStrength = 10; 
	public static int mobAgility = 10;
	public static int mobIntelligence = 10;
	
	public static int mobMaxHealth = 1;
	public static int mobTotalHealth = mobMaxHealth;
	
	public static int mobMaxMana = 1;
	public static int mobTotalMana = mobMaxMana;
	
	//--------------------- fight variable -----------------//
	
	public static boolean fight;
	
	public variables() {
		
		
		
	}
	
}
