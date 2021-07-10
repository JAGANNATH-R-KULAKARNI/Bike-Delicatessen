package Parsing;
import SortingAttributes.SortingAttributes;

class InvalidCommandException extends Exception
{
	InvalidCommandException(String message)
	{
		super(message);
	}
}

public class Parsing 
{
 static public SortingAttributes Parse(String command)
 {
	 SortingAttributes refe=new SortingAttributes();
	 String key="sortTheBikeBy";
	 
	 if(command.equals("sortTheBikeBy exit -jagannath"))
	 {
		 return refe;
	 }
	 
	 refe.setMessage("-----------Invalid Command------------");
	 
	 try {
		
		 int i=0;
		 
		 for( ;i<command.length();i++)
		 {
			 if(command.charAt(i) == ' ')
			 {
				 if(i < key.length())
					 throw new InvalidCommandException("Error at "+i+" in command");
				 
				 i++;
				 break;
			 }
			 else if(i >= key.length())
				 throw new InvalidCommandException("Error at "+i+" in command");
			 else if(command.charAt(i) != key.charAt(i))
				 throw new InvalidCommandException("Error at "+i+" in command");
		
		 }
		 
		 if(i >= command.length())
			 throw new InvalidCommandException("Enter the attributes");
		 
		 while(i < command.length() && command.charAt(i) != '-')
		 {
			 String str="";
			 String value="";
			 
			 while(i < command.length() && command.charAt(i) != '_')
			 {
				 str=str+command.charAt(i);
				 i++;
			 }
			 i++;
			 
			 while(i < command.length() && command.charAt(i) != ' ')
			 {
				 value=value+command.charAt(i);
				 i++;
			 }
			 i++;
			 
			 switch(str)
			 {
			 case "engineCapacity":  refe.setEngineCapacity(Double.parseDouble(value));
			 case "mileage":  refe.setMileage(Double.parseDouble(value));;break;
			 case "weight":  refe.setWeight(Double.parseDouble(value));break;
			 case "bikeType":  refe.setBikeType(value);;break;
			 case "color":  refe.setColor(value);break;
			 case "torque":  refe.setTorque(Double.parseDouble(value));break;
			 case "fuelCapacity": refe.setFuelCapacity(Double.parseDouble(value));break;
			 case "seatHeight":  refe.setSeatHeight(Double.parseDouble(value));break;
			 case "minPrice" : refe.setMinPrice(Double.parseDouble(value));break;
			 case "maxPrice" : refe.setMaxPrice(Double.parseDouble(value));break;
			 case "power" : refe.setPower(Double.parseDouble(value));break;
			 case "name" :  refe.setOnlyName(true);refe.setName(value);break;
			 default : throw new InvalidCommandException("Invalid attribute at "+(i-str.length())+" in Command '"+str+"'");
			 }
			 
		 }
		 
		 if(i >= command.length() || command.charAt(i) != '-')
			 throw new InvalidCommandException("Write My Name Properly :)");
		 
		 key="-jagannath";
		 int k=0;
		 
		 while(i < command.length() && k < key.length())
		 {
			if(command.charAt(i) != key.charAt(k))
				throw new InvalidCommandException("Write My Name Properly :)");
			
			i++;
			k++;
		 }
		 
		 if(i < command.length() || k < key.length())
			 throw new InvalidCommandException("Write My Name Properly :)");
		 
		  refe.setMessage("-----------Valid Command----------");
		 
		 return refe;
	 }
	 catch(Exception e){
		 System.out.println(e);
		 System.out.println("Invalid Command :( Try again");
	 }
	 
	 return refe;
 }

}
