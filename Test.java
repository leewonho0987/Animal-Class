package Class_Test;

import java.util.List;
import java.util.Scanner;

public class Test {
	

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int selected, selected2, num;
		String Name;
		String search;;
		int Weight;
		int Length;
		
		
		Animal_Farm animal_farm = new Animal_Farm("동물농장");

		while(true)
		{
				
			System.out.println(" ");
			System.out.println("원하시는 기능을 선택하라");
			System.out.println("1번 동물 추가");
			System.out.println("2번 모든 동물의 정보를 출력");
			System.out.println("3번 이름 검색");
			System.out.println("4번 동물 울음소리 내기");
			System.out.print("5번 종료  \n ---> ");
			selected = scanner.nextInt();
		
			if(selected == 1)
			{
				System.out.print("원하는 동물의 종류를 클릭하라 \n 1번 Dog 2번 Cat 3번 Chicken \n>>");
				num = scanner.nextInt();
				scanner.nextLine();
				
				if ( num == 1)
				{
					System.out.print("동물의 이름을 입력해 주세요 >> ");
					Name = scanner.nextLine();
					
					System.out.print("동물의 길이를 입력해 주세요 ( CM ) >> ");
					Weight = scanner.nextInt();
					
					System.out.print("동물의 무게를 입력해 주세요 ( KG ) >> ");
					Length = scanner.nextInt();
					
					animal_farm.add_Dog(Name, Weight, Length);
					
					System.out.println(" 정상적으로 추가 되었습니다 ");
					continue;
					 
				}
				
				else if ( num == 2)
				{
					System.out.print("동물의 이름을 입력해 주세요 >> ");
					Name = scanner.nextLine();
					
					System.out.print("동물의 길이를 입력해 주세요 ( CM ) >> ");
					Weight = scanner.nextInt();
					
					System.out.print("동물의 무게를 입력해 주세요 ( KG ) >> ");
					Length = scanner.nextInt();
					
					animal_farm.add_Cat(Name, Weight, Length);
					
					System.out.println(" 정상적으로 추가 되었습니다 ");
					continue;
					 
				}
				
				else if ( num == 3)
				{
					System.out.print("동물의 이름을 입력해 주세요 >> ");
					Name = scanner.nextLine();
					
					System.out.print("동물의 길이를 입력해 주세요 ( CM ) >> ");
					Weight = scanner.nextInt();
					
					System.out.print("동물의 무게를 입력해 주세요 ( KG ) >> ");
					Length = scanner.nextInt();
					
					animal_farm.add_Chicken(Name, Weight, Length);
					
					System.out.println(" 정상적으로 추가 되었습니다 ");
					continue;
					 
				}
				
				else 
				{
					System.out.println("잘못된 입력입니다.");
				}
			}
			

			if(selected == 2) 
			{
			    for (Animal animal : animal_farm.Animals) 
			    {
			    	System.out.println("동물 종류: " + animal.getAnimalType());
			        System.out.println("동물 이름: " + animal.Name);
			        System.out.println("동물 길이: " + animal.Length + "cm");
			        System.out.println("동물 무게: " + animal.Weight + "kg");
			        System.out.println(" ");
			    }
			    continue;
			}
			
			
			
			if(selected == 3)
			{
				scanner.nextLine();
				System.out.print("동물의 이름을 입력해 주세요 \n (띄어쓰기는 하지 말아주세요) \n >> ");
				search = scanner.nextLine();
				List<Animal> animalsByName1 = animal_farm.AnimalSearch(search);
	
				if (!animalsByName1.isEmpty()) {
				    for (Animal animal : animalsByName1) {
				        System.out.println("동물 이름: " + animal.getName());
				        System.out.println("동물 길이: " + animal.getLength() + "cm");
				        System.out.println("동물 무게: " + animal.getWeight() + "kg");
				        System.out.println(" ");
				    }
				} else {
				    System.out.println(search + "라는 이름을 가진 동물이 없습니다.");
				}
			}
			
	
			
			else if(selected == 4)
			{
				System.out.println("1번 단일 동물 울기 // 2번 모든 동물이 울기");
				selected2 = scanner.nextInt();
			
				if(selected2  == 1 )
				{
					scanner.nextLine();
					System.out.print("소리내고 싶은 동물의 이름을 입력하세요 \n >>");
					search= scanner.nextLine();
					List<Animal> animalsByName1 = animal_farm.AnimalSearch(search);
					if(!animalsByName1.isEmpty())
					{
						for(Animal animal : animalsByName1)
						{
							animal.speak();
						}
					}
					else
					{
						System.out.println(search + " 이름을 가진 동물이 없습니다. ");
					}
				}
				
				else if(selected2 == 2)
					animal_farm.speak();
				else
					System.out.println("잘못된 입력입니다");
			
			}
			
			else if (selected == 5)
			{
				break;
			}
			
			else
			{
				System.out.println("다시 입력해 주세요");
				System.out.println(" ");
			}
			
	    
		}
    
	}

}