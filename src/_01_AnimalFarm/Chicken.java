package _01_AnimalFarm;

public class Chicken extends Animal{

	@Override
	public void makeNoise()
	{
		System.out.println("Chicken Noises");
	}

	@Override
	public void walk() {
		System.out.println("The chicken continued to walk after it was beheaded");
	}

}
