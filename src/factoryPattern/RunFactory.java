package factoryPattern;

public class RunFactory {

	public static void main(String[] args) {
		Factory factory = new Factory();
		
		FactoryProduction product1 = factory.setFactory("Nike");
		FactoryProduction product2 = factory.setFactory("Adidas");
//		FactoryProduction product3 = factory.setFactory("Puma");
		
		product1.createBoot();
		product2.createPant();
//		product3.createBoot();
	}
}
