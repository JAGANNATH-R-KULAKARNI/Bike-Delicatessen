package Bikes;

public class KTM implements Showroom
{
	protected String[] subBikes= {"KTM_390_Duke"};
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
	protected String Info="KTM AG (formerly KTM Sportmotorcycle AG[4][5]) is an Austrian motorcycle and sports car manufacturer owned by Pierer Mobility AG and Indian manufacturer Bajaj Auto. It was formed in 1992 but traces its foundation to as early as 1934. Today, KTM AG is the parent company of the KTM Group, consisting of a number of motorcycle brands.\r\n"
			+ "\r\n"
			+ "KTM is known for its off-road motorcycles (enduro, motocross and supermoto). Since the late 1990s, it has expanded into street motorcycle production and developing sports cars – namely the X-Bow. In 2015, KTM sold almost as many street as off-road bikes.[6]\r\n"
			+ "\r\n"
			+ "Since 2012, KTM has been the largest motorcycle manufacturer in Europe for four consecutive years.[7][8] Globally, the company is among the leading off-road motorcycle manufacturers.[9][10] In 2016, KTM sold 203,423 motor vehicles worldwide.[11]";
	
	
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
