package com.codingdojo.ObjectMaster1;

public class Human {
	
	//add 4 attributes for humans, and initiate them with asked values of integers. 
	public int strength= 3;
	public int stealth=3;
	public int intelligence= 3;
	public int health = 100;
	
	
	//method that reduces the health of the attacked human by the strength of the current human.
	public void attack(Human AnotherHuman) {
		health -= strength; 
	}
	

	
//end
}
