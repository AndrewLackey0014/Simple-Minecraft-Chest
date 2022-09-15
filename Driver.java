package minecraftFinal;


import java.util.ArrayList;
import java.util.Iterator;

public class Driver 
{
	public static void main(String args[])
	{
		Item Chicken = new Food("Chicken", true); //creates an item->food chicken
		System.out.println(Chicken);
		Item Beef = new Food("Beef", true);// creates an item->food beef
		System.out.println(Beef);
		
		Item Sword = new Weapon("Sword", 1000); //creates an item->weapon sword
		System.out.println(Sword);
		Item Axe = new Weapon("Axe", 800); //creates an item->weapon axe
		System.out.println(Axe);
		
		Chest chest = new Chest(); //creates an empty chest for us to add things to
//		chest.addToChest(Chicken);// adding these items from line 22-25
//		chest.addToChest(Chicken);
//		chest.addToChest(Beef);
//		chest.addToChest(Beef);
		chest.addToChest(Sword);
		chest.addToChest(Axe);
		chest.addToChest(Axe);
		chest.addToChest(Sword);
		chest.addToChest(Axe);
		chest.addToChest(Axe);
		chest.addToChest(Chicken);
		chest.addToChest(Beef);
		chest.addToChest(Beef);
		chest.addToChest(Chicken);
		chest.addToChest(Beef);
		chest.addToChest(Beef);
		chest.addToChest(Axe);
		chest.addToChest(Axe);
		chest.addToChest(Sword);
		chest.addToChest(Axe);
		chest.addToChest(Axe);
		chest.addToChest(Chicken);
		chest.addToChest(Beef);
		chest.addToChest(Beef);
		chest.addToChest(Axe);
		chest.addToChest(Axe);
		chest.addToChest(Sword);
		chest.addToChest(Axe);
		chest.addToChest(Axe);
		chest.addToChest(Sword);
		chest.addToChest(Sword);
		chest.addToChest(Sword);
		chest.addToChest(Sword);
		chest.addToChest(Sword);
		chest.addToChest(Chicken);
		chest.addToChest(Beef);
		chest.addToChest(Beef);
		chest.addToChest(Chicken);
		chest.addToChest(Beef);
		chest.addToChest(Beef);
		chest.addToChest(Axe);
		chest.addToChest(Axe);
		chest.addToChest(Sword);
		chest.addToChest(Axe);
		chest.addToChest(Axe);
		chest.addToChest(Sword);
		chest.addToChest(Sword);
		chest.addToChest(Sword);
		chest.addToChest(Sword);
		chest.addToChest(Sword);
		System.out.println(chest.isFull());
		System.out.println(chest);
		
		System.out.println(chest);
		
	}
}