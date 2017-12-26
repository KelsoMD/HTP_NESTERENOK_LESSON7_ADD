package by.htp.airco;
import by.htp.aircraft.*;

public class MainApp {

	public static void main(String[] args) {
		AirCo virgin = new AirCo("Virgin");	
		virgin.addPlane(new SmallCP());
		virgin.addPlane(new SmallPP());
		virgin.addPlane(new MiddleCP());
		virgin.addPlane(new MiddlePP());
		virgin.addPlane(new LargeCP());
		virgin.addPlane(new LargePP());
		System.out.println();
		System.out.println(virgin.getCargoCapacity());
		System.out.println(virgin.getPassCapacity());
		for (int i = 0;i<virgin.getPlanes().length;i++) {
			System.out.println(virgin.getPlanes()[i].getName());
		}
		virgin.quickSort();
		System.out.println();
		for (int i = 0;i<virgin.getPlanes().length;i++) {
			System.out.println(virgin.getPlanes()[i].getName());
		}
		virgin.consumptionInRange(200, 100);
	}

}
