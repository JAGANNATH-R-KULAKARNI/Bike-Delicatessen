package Bikes;

public class RoyalEnfield implements Showroom
{
	protected String[] subBikes= {"Royal_Enfield_Meteor_350","Royal_Enfield_Himalayan","Royal_Enfield_Coninental_GT_350"};
	private String bikeName="dummy";
	private double EngineCapacity;
	private double Mileage;
	private double Weight;
	private String BikeType="dummy";
	private String Color="red";
	private double Torque;
	private double FuelCapacity;
	private double SeatHeight;
	private double minPrice;
	private double maxPrice;
	private double power;
	private String littleInfo="dummy";
	private String moreInfo="dummy";
	private String image="dummy";
	protected String Info="Royal Enfield is an Indian multinational motorcycle manufacturing company headquartered in Chennai, Tamil Nadu, India. It has a tag of \"the oldest global motorcycle brand in continuous production\"[3] manufactured in factories in Chennai in India. Licensed from Royal Enfield by the indigenous Indian Madras Motors, it is now a subsidiary of Eicher Motors Limited, an Indian automaker.[4] The company makes classic-looking motorcycles including the Royal Enfield Bullet, Classic 350, Meteor 350, Classic 500, Interceptor 650, Continental and many more. Royal Enfield also make adventurous and offroading motorcycles like Royal Enfield Himalayan. Their motorcycles are equipped with single-cylinder and twin-cylinder engines.[5] First produced in 1901, Royal Enfield is the oldest motorcycle brand in the world still in production, with the Bullet model enjoying the longest motorcycle production run of all time.";
	
	
	public String getBikeName() {
		return bikeName;
	}
	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
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
	public double getPower() {
		return power;
	}
	public void setPower(double power) {
		this.power = power;
	}
	public String getLittleInfo() {
		return littleInfo;
	}
	public void setLittleInfo(String littleInfo) {
		this.littleInfo = littleInfo;
	}
	public String getMoreInfo() {
		return moreInfo;
	}
	public void setMoreInfo(String moreInfo) {
		this.moreInfo = moreInfo;
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
	public String getImage() {
		return image;
	}
	public String getInfo() {
		return Info;
	}
	public void setInfo(String info) {
		Info = info;
	}
}
