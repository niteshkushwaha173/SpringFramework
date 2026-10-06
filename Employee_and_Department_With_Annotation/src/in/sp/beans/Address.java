package in.sp.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
@Value("1234")
private int houseno;
@Value("NH 27")
private String street;
@Value("noida")
private String city;
@Value("Utter pradesh")
private String state;
@Value("123430")
private int pincode;

@Override 
public String toString() {
	return "#"+houseno+","+street+","+city+","+state+","+pincode;
}
}
