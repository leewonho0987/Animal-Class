package Class_Test;

public class Chicken extends Animal
{
	
    Chicken(String name, int Weight, int Lenght)
    {
    	this.Name = name;
    	this.Weight = Weight;
    	this.Length = Lenght;
    }
   
	public void speak()
	{
		System.out.println("이름 : " + getName() + " 꼬끼오 ");
	}
	
	public  String getAnimalType()
	{
		return "닭";
	}
	
}