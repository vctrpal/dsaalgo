package abstractfactorydesignpattern;

public class EuropeanCarFactory implements CarFactory {

	@Override
	public Car createCar() {
		// TODO Auto-generated method stub
		return new HatchBack();
	}

	@Override
	public CarSpecification createCarSpecification() {
		// TODO Auto-generated method stub
		return new EuropeanCarSpecification();
	}

}
