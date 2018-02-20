

public class Transportation {

	Vehicle type_of_vehicle;
	String comfort,time,cost;
	
	
	public Transportation(String comfort,String time,String cost) {
		this.comfort = comfort;
		this.time = time;
		this.cost = cost;
	}
	
	public void setTransportationVehicle(Vehicle vehicle) {
		this.type_of_vehicle = vehicle;
	}
	public void start_travelling() {
		this.type_of_vehicle.drive();
		System.out.println("Comfort:" + this.comfort);
		System.out.println("Time:" + this.time);
		System.out.println("Cost:" + this.cost);
	}
}
