package factoryPattern;

public class NikeFactory implements FactoryProduction {

	@Override
	public void createBoot() {
		System.out.println("Nike boot was created!");
	}

	@Override
	public void createTop() {
		System.out.println("Nike top was created!");
	}

	@Override
	public void createPant() {
		System.out.println("Nike pant was created!");
	}

	@Override
	public void createSock() {
		System.out.println("Nike sock was created!");
	}
	

}
