package Bikes;

public class Honda implements Showroom
{
	protected String[] subBikes= {"Honda_Activa_6G","Honda_Unicorn","Honda_Highness_CB_350"};
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
	protected String Info="The Honda Motor Company, Ltd. (Japanese: 本田技研工業株式会社, Hepburn: Honda Giken Kōgyō KK, IPA: [honda] (About this soundlisten); /ˈhɒndə/) is a Japanese public multinational conglomerate manufacturer of automobiles, motorcycles, and power equipment, headquartered in Minato, Tokyo, Japan.\r\n"
			+ "\r\n"
			+ "Honda has been the world's largest motorcycle manufacturer since 1959,[2][3] reaching a production of 400 million by the end of 2019,[4] as well as the world's largest manufacturer of internal combustion engines measured by volume, producing more than 14 million internal combustion engines each year.[5] Honda became the second-largest Japanese automobile manufacturer in 2001.[6][7] Honda was the eighth largest automobile manufacturer in the world in 2015.[8]\r\n"
			+ "\r\n"
			+ "Honda was the first Japanese automobile manufacturer to release a dedicated luxury brand, Acura, in 1986. Aside from their core automobile and motorcycle businesses, Honda also manufactures garden equipment, marine engines, personal watercraft and power generators, and other products. Since 1986, Honda has been involved with artificial intelligence/robotics research and released their ASIMO robot in 2000. They have also ventured into aerospace with the establishment of GE Honda Aero Engines in 2004 and the Honda HA-420 HondaJet, which began production in 2012. Honda has two joint-ventures in China: Dongfeng Honda and Guangqi Honda.\r\n"
			+ "\r\n"
			+ "In 2013, Honda invested about 5.7% (US$6.8 billion) of its revenues in research and development.[9] Also in 2013, Honda became the first Japanese automaker to be a net exporter from the United States, exporting 108,705 Honda and Acura models, while importing only 88,357.[10]";
	
	
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
