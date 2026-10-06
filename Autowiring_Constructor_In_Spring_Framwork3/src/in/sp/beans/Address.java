package in.sp.beans;

public class Address {
	private int houseno;
	private String city;
	private int pin;
	public Address(int houseno, String city, int pin) {
		super();
		this.houseno = houseno;
		this.city = city;
		this.pin = pin;
	}
	public String toString() {
		return "#"+houseno+","+city+","+pin;
	}
}
