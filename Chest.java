package minecraftFinal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Chest
{
	/* ********************** COMMENT HERE - HOW DOES ALL BELOW THIS FIT TOGETHER!!! *************
	- use space here
	- use space here
	- use space here
	- use space here
	the chest class holds items which can inturn be a weapon or a food
	
	********************************************************************* */
	//declaring our arraylist of items called chest
	private ArrayList <Item> chest;
	//declaring our current size array vaiable
	private int [] currentSize; 
	//this item is the number of items in that slot
	
	
	public Chest() 
	{
		// comment what is happening below
		chest = new ArrayList <Item> (32);
		currentSize = new int[32];
	}
	//the constructor that initializes an array of items 32 in size and sets the current size
	//doesnt return anything 
	
	//returns the size of the chest called
	private int getSize() { return chest.size(); }
	
	// should be private since used internally by this class
	//returns true if the chest is full returns false if chest is empty
	public boolean isFull() { 
		for(int i =0; i<32;i++) {
			if(currentSize[i] == 0) {
				return false;
			}
		}
		return true;
	}  
	
	public void addToChest(Item e)
	{
		// see if already in chest
		
			// if already in chest, if full, look for another, else, create a new stack IF there is room
		
		// if not in chest, create a new stack IF there is room
		boolean go = true;
		for(int i = 0; i < 32; i++) {
			if(currentSize[i] != 0) {
				Item temp = (Item) chest.get(i);
				if(temp instanceof Food) { //checks if the item is a food
					if(temp == e) {
						if(currentSize[i] != chest.get(i).getStackMax()) {//adds to open slot of same item
							currentSize[i]++;//increment size by 1 (added to another stack)
							go = false;
							break;
						}
					}
				}
				if(temp instanceof Weapon) { //checks if the item is a weapon
					//after coding this part i realized you cant stack weapons so this is mostly useless
					if(temp == e) {
						if(currentSize[i] != chest.get(i).getStackMax()) {//adds to open slot of same item
							currentSize[i]++; //increment size by 1 (added to another stack)
							go = false;
							break;
						}
					}
				}
			}
		}
		if(!isFull() && go) { //if not full and no other place to put it add to next space available
			int index = nextAvailable();
			chest.add(index, e); //adds to chest
			currentSize[index]++; //increments the current size by 1
		}else { //full so just print
			System.out.println(chest);
		}
		
	}
	//checks the currentSize array which would be 0 if a plave is empty and returns that index else returns -1 meaning full
	public int nextAvailable() 
	{
		for(int i=0; i < 32; i++) {
			if(currentSize[i] == 0) {
				return i;
			}
		}
		return -1;
	}
	
	public int find(Item element) //located the index of the first appearence of an element
	{
		// use ArrayList find methods to determine if the Items match
		return chest.indexOf(element.getName());
	}

	
//	public int allMatchingItemLocations(Item e) //i couildnt figure this method out but the rest works
//	{
//		for(int i =0; i <32; i++) {
//			if(chest.get(i).equals(e)) {
//				return i;
//			}
//		}
//		
//	}

	@Override
	public String toString() 
	{
		Iterator <Item> it = chest.iterator();  
		String itemsInChest = "Items in THIS chest\n";
		int count = 1;
		while (it.hasNext())
		{
			Item anItem = it.next(); // gathering and placing into a temp Employee
			itemsInChest += "[" + count + "] " + anItem.getName() + " (" + currentSize[count - 1] + "/" + anItem.getStackMax() + ") \n";
			count++;
		}
		
		return itemsInChest;
	}
	
	
}