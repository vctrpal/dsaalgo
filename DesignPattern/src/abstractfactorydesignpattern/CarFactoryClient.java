package abstractfactorydesignpattern;

public class CarFactoryClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NorthAmericanCarFactory objNorthAmericanCarFactory = new NorthAmericanCarFactory();
		Car sedanCar = objNorthAmericanCarFactory.createCar();
		CarSpecification northAmericaCarSpecification = objNorthAmericanCarFactory.createCarSpecification();
		sedanCar.assembleCar();
		northAmericaCarSpecification.carSpecification();
		
	}

}
 