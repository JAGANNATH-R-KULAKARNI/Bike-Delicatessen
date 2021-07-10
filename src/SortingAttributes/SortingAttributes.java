package SortingAttributes;

public class SortingAttributes 
{
private double EngineCapacity=0;
private double Mileage=0;
private double Weight=0;
private String BikeType="";
private String Color="";
private double Torque=0;
private double FuelCapacity=0;
private double SeatHeight=0;
private double minPrice=0;
private double maxPrice=0;
private double power=0;
private String message="exit";
private boolean onlyName=false;
private String name="";

public String getBikeType() {
	return BikeType;
}
public void setBikeType(String bikeType) {
	BikeType = bikeType;
}
public String getColor() {
	return Color;
}
public void setColor(String color) {
	Color = color;
}

public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public double getEngineCapacity() {
	return EngineCapacity;
}
public void setEngineCapacity(double engineCapacity) {
	EngineCapacity = engineCapacity;
}
public double getMileage() {
	return Mileage;
}
public void setMileage(double mileage) {
	Mileage = mileage;
}
public double getWeight() {
	return Weight;
}
public void setWeight(double weight) {
	Weight = weight;
}
public double getTorque() {
	return Torque;
}
public void setTorque(double torque) {
	Torque = torque;
}
public double getFuelCapacity() {
	return FuelCapacity;
}
public void setFuelCapacity(double fuelCapacity) {
	FuelCapacity = fuelCapacity;
}
public double getSeatHeight() {
	return SeatHeight;
}
public void setSeatHeight(double seatHeight) {
	SeatHeight = seatHeight;
}
public double getMinPrice() {
	return minPrice;
}
public void setMinPrice(double minPrice) {
	this.minPrice = minPrice;
}
public double getMaxPrice() {
	return maxPrice;
}
public void setMaxPrice(double maxPrice) {
	this.maxPrice = maxPrice;
}
public double getPower() {
	return power;
}
public void setPower(double power) {
	this.power = power;
}
public boolean isOnlyName() {
	return onlyName;
}
public void setOnlyName(boolean onlyName) {
	this.onlyName = onlyName;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}



};
