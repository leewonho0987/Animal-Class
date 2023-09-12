package Class_Test;


public class Dog extends Animal
{
	 
    Dog(String name, int Weight, int Lenght)
    {
    	this.Name = name;
    	this.Weight = Weight;
    	this.Length = Lenght;
    }
    

	public void speak()
	{
		System.out.println("이름 : " + getName() + " 왕왕 ");
	}
	
	public  String getAnimalType()
	{
		return "강아지";
	}
	
}
