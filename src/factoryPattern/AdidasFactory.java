package factoryPattern;

public class AdidasFactory implements FactoryProduction{

	@Override
	public void createBoot() {
		System.out.println("Adidas boot was created!");
	}

	@Override
	public void createTop() {
		System.out.println("Adidas top was created!");
	}

	@Override
	public void createPant() {
		System.out.println("Adidas pant was created!");
	}

	@Override
	public void createSock() {
		System.out.println("Adidas sock was created!");
	}

}
