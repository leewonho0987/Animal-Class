package Class_Test;

public class Cat extends Animal
{
	
    Cat(String name, int Weight, int Lenght)
    {
    	this.Name = name;
    	this.Weight = Weight;
    	this.Length = Lenght;
    }
 

	public void speak()
	{
		System.out.println("이름 : " + getName() + " 냐옹 ");
	}
	
	public  String getAnimalType()
	{
		return "고양이";
	}
	
}
