package Class_Test;

import java.util.ArrayList;
import java.util.List;

public class Animal_Farm extends Animal {
	
	String name;
	
	protected List<Animal> Animals = new ArrayList<>();
	
	Animal_Farm(String name)
	{
		this.name = name;
		
		add_Dog("파트라슈", 20, 50);
		add_Cat("채리", 10, 25);
		add_Chicken("다악", 5, 10);
	}
	

	public void add_Dog(String Name, int Weight, int Length)
	{
		Dog dog = new Dog(Name, Weight, Length);
		Animals.add(dog);
	}
	
	public void add_Cat(String Name, int Weight, int Length)
	{
		Cat cat = new Cat(Name, Weight, Length);
		Animals.add(cat);
	}
	
	public void add_Chicken(String Name, int Weight, int Length)
	{
		Chicken chicken = new Chicken(Name, Weight, Length);
		Animals.add(chicken);
	}
	
	public List<Animal> AnimalSearch (String Name)
	{
		List <Animal> animalsearch = new ArrayList<>();
		
		for(Animal  animal : Animals)
		{
			if(animal.getName().equals(Name))
			{
				animalsearch.add(animal);
			}
		}	
		return animalsearch;
	}

	public void speak()
	{
		for(Animal animal : Animals)
		{
			animal.speak();
		}
	}


	@Override
	public String getAnimalType() {
		return null;
	}
}
