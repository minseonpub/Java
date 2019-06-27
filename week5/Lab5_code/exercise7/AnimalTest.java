
public class AnimalTest 
{

	public static void main(String[] args)
	{
		// non-polymorphism class
		Sheep sheep = new Sheep();
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		System.out.printf("Use non-polymorphism\n");
		dog.cry();
		cat.cry();
		sheep.cry();
		
		// polymorphism class
		System.out.printf("\nUse polymorphism\n");
		Animal[] animal = new Animal[3];
		
		animal[0] = dog;
		animal[1] = cat;
		animal[2] = sheep;
		
		for(Animal currentAnimal : animal)
		{
			currentAnimal.cry();
		}
	}
}
