package subBikes;
import Bikes.RoyalEnfield;

public class Royal_Enfield_Meteor_350 extends RoyalEnfield
{
	private String bikeName="Royal_Enfield_Meteor_350";
	private double Mileage=41.88;
	private double EngineCapacity=349;
	private String BikeType="cruiser";
	private String Color="yellow";
	private double power=20.4;
	private double Torque=27;
	private double minPrice=180000;
	private double maxPrice=199000;
	private double FuelCapacity=15;
	private double SeatHeight=765;
	private double Weight=190;
	private String image="C:\\Users\\user\\eclipse-workspace\\Bike_Delicatessen\\src\\Images\\Royal_Enfield_Meteor_350.jpg";
	private String littleInfo="Royal Enfield upped the prices of the Meteor 350 back in April 2021. The hike ranges from Rs 5,000 to Rs 6,000, and the asking price of the base model has gone up from Rs 1,78,744 to Rs 1,84,319 (ex-showroom Delhi). No mechanical or cosmetic change has been made to the motorcycle. If you’re planning on buying the Royal Enfield Meteor 350";
	private String moreInfo="The Royal Enfield Meteor 350 is powered by an all-new 349cc air-cooled SOHC 2-valve motor with fuel-injection. The powerplant generates 20.4PS at 6100rpm and 27Nm at 4000rpm, working in conjunction with a 5-speed transmission. The engine is counterbalanced for optimum refinement, which is a first for a 350cc Royal Enfield. The engine nestles inside a double downtube split cradle frame which is suspended on a 41mm telescopic front fork and twin 6-stage preload-adjustable emulsion shock absorbers at the rear. Braking hardware consists of a 300mm front disc and a 270mm rear unit with dual-channel ABS as standard. The 350cc Royal Enfield bike sports a 19-inch front and 17-inch rear alloy wheel wrapped with tubeless 100-section front and 140-section rear tubeless tyres. At 191kg kerb, the Meteor 350 is 6kg lighter than its predecessor, the Thunderbird 350X.";
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