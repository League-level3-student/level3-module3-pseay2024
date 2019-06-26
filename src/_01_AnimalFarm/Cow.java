package _01_AnimalFarm;

public class Cow extends Animal{
	@Override
	public void makeNoise() {
		System.out.println("Moo");
		
	}

	@Override
	public void walk() {
		System.out.println("Cow eats food after a short walk.");
	}
}
