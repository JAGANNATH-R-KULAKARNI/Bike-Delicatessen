package Documentation;
import java.util.concurrent.TimeUnit;

public class Documentation
{
public static void welcomeMessage() throws InterruptedException
{
	    System.out.println("Welcome To Bike Delicatessen");
	    TimeUnit.SECONDS.sleep(2);
	    System.out.println("Do you want to buy a new bike ?  :)");
	    TimeUnit.SECONDS.sleep(2);
	    System.out.println("But don't know how ?   :(");
	    TimeUnit.SECONDS.sleep(2);
	    System.out.println("Don't know what bike is suitable for you according to your height ? weight ? :(");
	    TimeUnit.SECONDS.sleep(2);
	    System.out.println("Do you want to find bikes according to your budget ?  :|");
	    TimeUnit.SECONDS.sleep(2);
	    System.out.println("Do you want to find bikes according to your favorite color ? engine Power? Torque ?  :|");
	    TimeUnit.SECONDS.sleep(3);
	    System.out.println("\n***************************************************************************");
	    System.out.println("THEN YOU ARE AT THE RIGHT PLACE :). THIS JAVA APPLICATION IS FOR YOU ;)");
	    System.out.println("***************************************************************************\n");
	    TimeUnit.SECONDS.sleep(2);
}

public static void commandExplaination() throws InterruptedException
{
	System.out.println("You have to request the program by giving a command. The program will parse it and provides you the desired result just like you do http request");
	TimeUnit.SECONDS.sleep(1);
	System.out.println("\nThe general Syntax is");
	System.out.println("************************************************************************************************************************");
	System.out.println("sortTheBikeBy <attribute(1)>_<value(1)> <attribute(2)>_<value(2)>  .........  <attribute(N)>_<value(N)>  -jagannath");
	System.out.println("************************************************************************************************************************");
	TimeUnit.SECONDS.sleep(2);
}

public static void availableAttributes()
{
	System.out.println("TYPE THE COMMAND");
	System.out.println("Available Attributes to sort are");
	System.out.print("engineCapacity(in CC),power(in PS),mileage(in KMPL),weight(in KG),bikeType(cruiser,standard,sport_bike,scooter),color,torque(in Nm),fuelCapacity(in liter),seatHeight(in mm),minPrice(in rupees),maxPrice(in rupees),name\n");
	System.out.println("************************************************************************************************************************");
	System.out.println("Example command:");
	System.out.println("sortTheBikeBy engineCapacity_350 weight_150 torque_27 seatHeight_750 mileage_40 color_black minPrice_74000 maxPrice_200000 -jagannath");
	System.out.println("************************************************************************************************************************");
	System.out.println("To Print All Bike available in Showroom : ");
	System.out.println("sortTheBikeBy -jagannath");
	System.out.println("To Exit Type : ");
	System.out.println("sortTheBikeBy exit -jagannath");
}
}
