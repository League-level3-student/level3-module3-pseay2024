package _01_AnimalFarm;

public class Horse extends Animal{

	@Override
	public void makeNoise() {
		System.out.println("Horse Noises");
	}

	@Override
	public void walk() {
		System.out.println("The horse is not tired after a 50km trot");
	}

}
