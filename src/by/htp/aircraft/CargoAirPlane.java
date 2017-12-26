package by.htp.aircraft;

public class CargoAirPlane extends Airplane{
	{
		typeName ="C";
	}
	int cargoCapacity;
	
	public CargoAirPlane() {
		this.name = "New Cargoplane";
	}
	
	public int getCargoCapasity() {
		return cargoCapacity;
	}
	public void setCargoCapasity(int cargoCapasity) {
		this.cargoCapacity = cargoCapasity;
	}
	
	
}


