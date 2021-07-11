package subBikes;
import Bikes.Yamaha;

public class Yamaha_Fascino_125 extends Yamaha
{
	private String bikeName="Yamaha_Fascino_125";
	private double Mileage=50;
	private double EngineCapacity=125;
	private String BikeType="scooter";
	private String Color="blue";
	private double power=8.2;
	private double Torque=10.3;
	private double minPrice=72030;
	private double maxPrice=75530;
	private double FuelCapacity=5.2;
	private double SeatHeight=780;
	private double Weight=99;
	private String image="C:\\Users\\user\\eclipse-workspace\\Bike_Delicatessen\\src\\Images\\Yamaha_Fascino_125.jpg";
	private String littleInfo="The Yamaha Fascino has already won hearts with its unique appearance and slick design. The new Fascino 125 Fi comes with the visual impression of a Classic European styling along with new features and technologies as it gets an all-new exterior design, higher quality bodywork, newly designed headlight, new gauges and other features";
	private String moreInfo="The all new Fascino 125 Fi is powered by a BS VI compliant, air cooled, fuel injected (Fi), 125 cc blue core engine that produces a power output which is +30% and fuel economy +16% higher compared to the earlier 113 cc scooter and the body weight is 99 kgs, which is 4 kgs lighter than Yamaha’s earlier scooters.\r\n"
			+ "The unique “Stop & start system” prevents engine idling and subsequently starts with a single throttle twist which uses the sensors to assess the riding environment. The “Smart motor generator (SMG)” fitted to the new Fascino 125 Fi brings a quieter engine start without the need for a separate conventional electric starter.";
	
	
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
	public void setImage(String image) {
		this.image = image;
	}
	
	
	
}