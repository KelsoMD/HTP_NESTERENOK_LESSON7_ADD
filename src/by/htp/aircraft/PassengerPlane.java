package by.htp.aircraft;

public class PassengerPlane extends Airplane{
	{
		typeName ="P";
	}
	int passengerCapacity;
	
	public PassengerPlane() {
		this.name = "New Passenger plane";
	}
	
	
	public int getPassengerCapasity() {
		return passengerCapacity;
	}
	public void setPassengerCapasity(int passengerCapasity) {
		this.passengerCapacity = passengerCapasity;
	}
	
	
}
