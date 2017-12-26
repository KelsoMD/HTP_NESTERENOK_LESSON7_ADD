package by.htp.airco;
import by.htp.aircraft.*;

public class AirCo {
	
	private String name;
	private Airplane[] planes;
	
	public AirCo() {
		planes = new Airplane[0];
	}
	public AirCo(int storage, String name) {
		this.name = name;
		planes = new Airplane[storage];
	}
	public AirCo(String name) {
		this.name = name;
		planes = new Airplane[0];
	}
	
	public Airplane[] getPlanes() {
		return planes;
	}
	public void addPlane(Airplane plane) {
		Airplane[] temp = new Airplane[planes.length + 1];
		for (int i = 0; i < planes.length; i++) {
			temp[i] = planes[i];
		}
		temp[planes.length] = plane;
		planes = temp;
	}
	
	public int getCargoCapacity() {
		int cCapacity=0;
		CargoAirPlane temp = null;
		for (Airplane plane : planes) {
			if(plane.getTypeName().equals("C")) {
				temp = (CargoAirPlane) plane;
				cCapacity = cCapacity + temp.getCargoCapasity();
			}
		}
		return cCapacity;
	}
	
	public int getPassCapacity() {
		int pCapacity=0;
		PassengerPlane temp = null;
		for (Airplane plane : planes) {
			if(plane.getTypeName().equals("P")) {
				temp = (PassengerPlane) plane;
				pCapacity = pCapacity + temp.getPassengerCapasity();
			}
		}
		return pCapacity;
	}
	
	public void quickSort() {
		Airplane bubble = new Airplane();
		int flag = 1;
		while (flag != 0) {
			flag = 0;
			for (int i = 1; i < this.planes.length; i++) {
				if (planes[i - 1].getDistance() > planes[i].getDistance()) {
					flag++;
					bubble = planes[i];
					planes[i] = planes[i - 1];
					planes[i - 1] = bubble;
				}
			}
		}
	}
	
	public void consumptionInRange(int top, int bot) {
		for (Airplane plane : planes) {
			if(plane.getConsumption()>=bot && plane.getConsumption()<=top) {
				System.out.println(plane.getName()+" "+plane.getConsumption());
			}
		}
	}

}
