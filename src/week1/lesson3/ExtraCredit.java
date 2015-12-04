package week1.lesson3;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ExtraCredit {

	public static void main(String[] args) {
		ZonedDateTime zf = ZonedDateTime.now();
		String fromZoneName = zf.getZone().toString();

		String toZoneName = "Australia/Sydney";
		double flightSpeed = 1300.00;
		double travelDistance = 25000.00;

		FlightPassanger f1 = new FlightPassanger(fromZoneName, toZoneName, zf, flightSpeed, travelDistance);

		f1.displayInfo();

		f1.setFromCity("Europe/Paris");
		f1.setDate(ZonedDateTime.of(2015, 11, 28, 20, 23, 56, 0, ZoneId.of("Europe/Paris")));
		f1.setTravelDistance(12000);
		f1.calculateArrivalTime();

		System.out.println("-----------After Alteration-------------");
		f1.displayInfo();

	}
}

class FlightPassanger {
	private String fromCity;
	private String toCity;
	private ZonedDateTime date;
	private double flightSpeed;
	private double travelDistance;
	private double duration;
	private ZonedDateTime destinationDate;

	public String getFromCity() {
		return fromCity;
	}

	public void setFromCity(String fromCity) {
		this.fromCity = fromCity;
	}

	public String getToCity() {
		return toCity;
	}

	public void setToCity(String toCity) {
		this.toCity = toCity;

	}

	public ZonedDateTime getDate() {
		return date;
	}

	public void setDate(ZonedDateTime date) {
		this.date = date;
	}

	public double getFlightSpeed() {
		return flightSpeed;
	}

	public void setFlightSpeed(double flightSpeed) {
		this.flightSpeed = flightSpeed;
	}

	public double getTravelDistance() {
		return travelDistance;
	}

	public void setTravelDistance(double travelDistance) {
		this.travelDistance = travelDistance;
	}

	public double getDuration() {
		return duration;
	}

	public ZonedDateTime getDestinationDate() {
		return destinationDate;
	}

	public FlightPassanger(String departureLocation, String destinationLocation, ZonedDateTime departureDate,
			double flightSpeed, double travelDistance) {
		this.fromCity = departureLocation;
		this.toCity = destinationLocation;
		this.date = departureDate;
		this.flightSpeed = flightSpeed;
		this.travelDistance = travelDistance;
		this.duration = travelDistance / flightSpeed;
		calculateArrivalTime();
	}

	public void calculateArrivalTime() {
		ZoneId destZoneId = ZoneId.of(toCity);
		this.duration = travelDistance / flightSpeed;
		this.destinationDate = date.withZoneSameInstant(destZoneId).plusMinutes((long) (duration * 60));
		// return destinationDate;
	}

	public void displayInfo() {
		System.out.println("Flight Duration: " + this.getDuration());
		System.out.println("From Start Location: " + this.getFromCity());
		System.out.println("From Destination Location: " + this.getFromCity());
		System.out.println("Time at start" + this.getDate());
		System.out.println("Time at arrival destination" + this.getDestinationDate());
	}

}