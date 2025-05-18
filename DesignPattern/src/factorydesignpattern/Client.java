package factorydesignpattern;

public class Client {
	
	private Vehicle objVehicle;
	
	public Client(VehicleFactory vehiclefactory) {
		
		objVehicle = vehiclefactory.creatVehicle();
		
	}
	
	public Vehicle getVehicle() {
		return objVehicle;
	}

}
