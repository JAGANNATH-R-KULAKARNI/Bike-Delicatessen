package Bikes;

public class Hero implements Showroom
{
	protected String[] subBikes= {"HeroSuperSplendor","Hero_XPulse_200"};
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
	protected String Info="HERO\nFounded In The Year - 19th January 1984\r\n"
			+ "Founder - Dr. Brijmohan Lall Munjal Ji\r\n"
			+ "Headquarters - New Delhi, India\r\n"
			+ "CEO - Pawan Munjal\r\n"
			+ "Revenue - Rs 34,658 Crores in 2019 ($ 4.9 Billion)\r\n"
			+ "Cheapest Bike - Hero HF Delux Rs 39,485 Onwards\r\n"
			+ "Costliest Bikes - Hero Xtreme 200S Rs 1.1 Lakhs INR Onwards\r\n"
			+ "Best Selling Bike - Hero Splendor\r\n"
			+ "Flagship Bike - Hero Xtreme 200S\r\n"
			+ "Types Of Bikes - Commuter Bikes, Naked, Faired,Adventure Bikes\r\n"
			+ "Upcoming Bikes - Hero Hastur 650";
	
	
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
