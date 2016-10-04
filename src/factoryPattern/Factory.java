package factoryPattern;

import java.io.IOException;

public class Factory {

	public FactoryProduction setFactory(String companyName) {
		if(companyName == null) {
			System.out.println("No factory selected!");
		} else if(companyName == "Nike") {
			return new NikeFactory();
		} else if(companyName == "Adidas") {
			return new AdidasFactory();
		} else {
			System.out.println("Unkown factory!");
		}
		return null;
	}
}
