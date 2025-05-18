package abstractfactorydesignpattern;

public class NorthAmericanCarFactory implements CarFactory {

	@Override
	public Car createCar() {
		// TODO Auto-generated method stub
		return new Sedan();
	}

	@Override
	public CarSpecification createCarSpecification() {
		// TODO Auto-generated method stub
		return new NorthamericanCarSpecification();
	}

}
