package factorydesignpattern;

public class TwoWheelerVehicleFactory implements VehicleFactory {

	@Override
	public Vehicle creatVehicle() {
		// TODO Auto-generated method stub
		return new TwoWheelerVehicle();

	}

}
