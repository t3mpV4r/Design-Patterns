

public class StrategyTest {

	public static void main(String[] args) {
		Vehicle typeof_vehicle = new Car();
		Transportation transport = new Transportation("high","short","high");
		transport.setTransportationVehicle(typeof_vehicle);
		transport.start_travelling();
		

	}

}
