package Bikes;

public class Yamaha implements Showroom
{
	protected String[] subBikes= {"Yamaha_FZ_X","Yamaha_YZF_R15_V3","Yamaha_Fascino_125"};
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
	protected String Info="Yamaha Motor Co., Ltd. (ヤマハ発動機株式会社, Yamaha Hatsudōki Kabushiki-gaisha) is a Japanese manufacturer of motorcycles, marine products such as boats and outboard motors, and other motorized products. The company was established in 1955 upon separation from Yamaha Corporation (however, Yamaha Corporation is still the largest private company shareholder with 9.92%, as of 2019),[1] and is headquartered in Iwata, Shizuoka, Japan. The company conducts development, production and marketing operations through 109 consolidated subsidiaries as of 2012.[2][3]\r\n"
			+ "\r\n"
			+ "Led by Genichi Kawakami, the company's founder and first president, Yamaha Motor began production of its first product, the YA-1, in 1955. The 125cc motorcycle won the 3rd Mount Fuji Ascent Race in its class.\r\n"
			+ "\r\n"
			+ "The company's products include motorcycles, scooters, motorized bicycles, boats, sail boats, personal water craft, swimming pools, utility boats, fishing boats, outboard motors, 4-wheel ATVs, recreational off-road vehicles, go-kart engines, golf carts, multi-purpose engines, electrical generators, water pumps, snowmobiles, small snow throwers, automobile engines, surface mounters, intelligent machinery, industrial-use unmanned helicopters, electrical power units for wheelchairs and helmets. The company is also involved in the import and sales of various types of products, development of tourist businesses and management of leisure, recreational facilities and related services. Yamaha's motorcycle sales are the second largest in the world[4] and Yamaha is the world leader in water vehicle sales.[5]";
	
	
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
