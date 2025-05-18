package factorydesignpattern;

public class FourWheelerVehicleFactory implements VehicleFactory {

	@Override
	public Vehicle creatVehicle() {
		// TODO Auto-generated method stub
		return new FourWheelerVehicle();
	}

}
