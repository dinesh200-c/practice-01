import java.util.Scanner;
import java.util.Arrays;
class Ride {
	String rideId;
	String fromLocation;
	String toLocation;
	int seatsLeft;
	int totalSeats;
	String startDate;
	String endDate;
	String isStarted;
	String finished;
	int tc=0;
	
	public Ride(String rideId, String fromLocation, String toLocation, int seatsLeft, int totalSeats,
			String startDate, String endDate, String isStarted, String finished) {
		super();
		this.rideId = rideId;
		
		this.startDate = startDate;
		this.endDate = endDate;
		this.isStarted = isStarted;
		this.finished = finished;
	
	
	if(seatsLeft > totalSeats) {
		System.out.println("more seats");
	}
	else {
		tc++;
	}
	 if(fromLocation == toLocation) {
		System.out.println("Both are same locations");
	}
	 else {
		 tc++;
	 }
	 if(seatsLeft< 0) {
		System.out.println("less than zero");
		tc++;
	}
	 else {
		 tc++;
	 }
	if(tc == 3) {
		this.seatsLeft = seatsLeft;
		this.totalSeats = totalSeats;
		this.fromLocation = fromLocation;
		this.toLocation = toLocation;
	}
	
	
	}

@Override
	public String toString() {
		return "Ride [rideId=" + rideId + ", fromLocation=" + fromLocation + ", toLocation=" + toLocation
				+ ", seatsLeft=" + seatsLeft + ", totalSeats=" + totalSeats + ", startDate=" + startDate + ", endDate="
				+ endDate + ", isStarted=" + isStarted + ", finished=" + finished + "]";
	}
	}
public class Ajk {
	
	public static void main(String[] args) {
	
	 Ride ride = new Ride("R1001","Banglore","Delhi",-5,50,"25-04-2022","30-04-2022","yes","yes");
	 System.out.println(ride);
}
}