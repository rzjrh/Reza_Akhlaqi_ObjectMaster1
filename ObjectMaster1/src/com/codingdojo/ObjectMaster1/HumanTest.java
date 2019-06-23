package com.codingdojo.ObjectMaster1;

public class HumanTest {

	public static void main(String[] args) {
		
		//create objects for all three classes of human's extension
		Ninja NJ = new Ninja();
		Wizard Wiz = new Wizard();
		Samurai Sam = new Samurai();
		
		Sam.attack(Wiz);
		NJ.attack(Wiz);
		Wiz.attack(NJ);
		Wiz.attack(Sam);
		Wiz.attack(NJ);
		Sam.attack(NJ);
		
		
		Sam.displayHealth();
		NJ.displayHealth();
		Wiz.displayHealth();
	}

}
