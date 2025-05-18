package factorydesignpattern;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TwoWheelerVehicleFactory objTwoWheelerVehicleFactory = new TwoWheelerVehicleFactory();
		Client objClient = new Client(objTwoWheelerVehicleFactory);
		Vehicle objVehicle = objClient.getVehicle();
		objVehicle.printVehicle();

	}

}
