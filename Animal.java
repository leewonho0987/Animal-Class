package Class_Test;

abstract class Animal
{
	protected String Name;
	protected int Weight;
	protected int Length;
	
	public abstract String getAnimalType();
	
	public String getName()
	{
		return Name;
	}
	
	public int getWeight()
	{
		return Weight;
	}
	
	public int getLength()
	{
		return Length;
	}
	
	public abstract void speak();

}
