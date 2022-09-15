package minecraftFinal;


abstract class Item
{
	/*
	 * Member variables
	 */
	
	// each Item has a name
	private String name;
	
	// Items can be stacked, depends on the type of item, how many? 
	private int stackMax;

	/*
	 * Member Functions
	 */
	
	public Item(String itemName) 
	{
		this.name = itemName;
		
		if(itemName.equals("Chicken") ) { setStackMax(64); }
		else if(itemName.equals("Beef") ) { setStackMax(64); }
		else if(itemName.equals("Sword") ) { setStackMax(1); }
		else if(itemName.equals("Axe") ) { setStackMax(1); }
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}



	// used to display the Item
	abstract public String toString();

	// used to update name
	protected String getName() { return name;}
	protected void setName(String name) { this.name = name;  }

	// used to update countStack
	protected int getStackMax() { return stackMax; }
	protected void setStackMax(int stackMax) { this.stackMax = stackMax; }
	
}
/*
 * Food and weapon extends item which means it inherits some of the traits
 * Food also has its own member variables associated with it heart delt and cooked
 * weapon also has its own member variables associated with it strength left and damage inflicted
 * item does not have these data members so they are stored in their respective classes
 * item does however contain item name and stack max which can be inherited to every other weapon/food that extends item
 * you would update these items in the respective classes using the super call.
 * the item and weapon class also have a to string method with n overide to overide the one in item class
 */
