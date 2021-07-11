package subBikes;
import Bikes.Honda;

public class Honda_Activa_6G extends Honda
{
	private String bikeName="Honda_Activa_6G";
	private double Mileage=50;
	private double EngineCapacity=109.51;
	private String BikeType="scooter";
	private String Color="brown";
	private double power=7.79;
	private double Torque=8.79;
	private double minPrice=67843;
	private double maxPrice=71089;
	private double FuelCapacity=5.3;
	private double SeatHeight=775;
	private double Weight=107;
	private String image="C:\\Users\\user\\eclipse-workspace\\Bike_Delicatessen\\src\\Images\\Honda_Activa_6G.jpg";
	private String littleInfo="Honda Activa 6G is a scooter available at a price range of Rs. 67,843 to 71,089 in India. It is available in 4 variants and 8 colours. The Activa 6G is a powered by 109cc BS6 engine. This engine of Activa 6G develops a power of 7.79 ps and a torque of 8.79 nm .";
	private String moreInfo="The sixth-generation model, Honda Activa 6G is launched by Honda in India after almost two years of its previous variant Activa 5G, which was launched in the Auto Expo 2018. This scooter meets the new BS6 emission standards and is available in two variants - standard and Deluxe. As Activa is celebrating its 20th anniversary, the company has launched a 20th-anniversary edition for both variants with some great colour options and unique features.\r\n"
			+ "\r\n"
			+ "It is a dual seater scooter, offering sufficient space for both the rider and the pillion and allowing a long comfortable ride. The fuel tank capacity is 5.3 L, and the scooter reaches a mileage of 45-55 km/l.\r\n"
			+ "\r\n"
			+ "Some of the attractive features of Activa 6G are - ACG silent starter motor, fuel-injected engine, new digital instrument panel, telescopic suspension, new external fuel cap, new ISP Technology, dual-function switch, and multifunctional switchgear.\r\n"
			+ "\r\n"
			+ "The ex-showroom price in New Delhi, for the base Standard variant, starts from Rs 69,080 and ranges to Rs 72,325 for the top 20th-anniversary edition of the deluxe variant.";
	
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