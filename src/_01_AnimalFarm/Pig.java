package _01_AnimalFarm;

public class Pig extends Animal{

	@Override
	public void makeNoise() {
		System.out.println("[insert pig noises here]");
		
	}

	@Override
	public void walk() {
		System.out.println("Pig is tired after a long walk(for him) of 1 foot.");
	}

}
