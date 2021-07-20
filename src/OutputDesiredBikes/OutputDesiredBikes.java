package OutputDesiredBikes;
import Bikes.Showroom;
import SortingAttributes.SortingAttributes;
import java.awt.*;

import javax.swing.JFrame;  
  
class MyCanvas extends Canvas{  
     
	private String imageURL;
	
	MyCanvas(Showroom bike)
	{
		this.imageURL=bike.getImage();
	}
    public void paint(Graphics g) {  
  
        Toolkit t=Toolkit.getDefaultToolkit();  
        Image i=t.getImage(this.imageURL);  
        g.drawImage(i, 120,100,this);  
          
    }   
  
}   

public class OutputDesiredBikes
{
String[] allBikes={"HeroSuperSplendor","Hero_XPulse_200","Hero_Pleasure_Plus","Royal_Enfield_Meteor_350"
		,"Royal_Enfield_Himalayan","Royal_Enfield_Coninental_GT_350","Yamaha_FZ_X","Yamaha_YZF_R15_V3"
		,"Yamaha_Fascino_125","Honda_Activa_6G","Honda_Unicorn","Honda_Highness_CB_350","KTM_390_Duke"};


   private void outputBikeInfo(Showroom bike,int i)
   {
	   System.out.println("---------------------------------------------------- "+(i+1)+" -----------------------------------------------------------------------");
	   System.out.println("Bike Name : "+bike.getBikeName());
	   System.out.println("Bike Type : "+bike.getBikeType());
	   System.out.println("Bike Color : "+bike.getColor());
	   System.out.println("Bike Engine Capacity : "+bike.getEngineCapacity()+" CC");
	   System.out.println("Bike Fuel Capacity : "+bike.getFuelCapacity()+" Liter");
	   System.out.println("Bike Mileage : "+bike.getMileage()+" KMPL");
	   System.out.println("Bike Power : "+bike.getPower()+" PS");
	   System.out.println("Bike Price : "+bike.getMinPrice()+" rupees");
	   System.out.println("Bike Price : "+bike.getMaxPrice()+" rupees");
	   System.out.println("Bike Seat Height : "+bike.getSeatHeight()+" mm");
	   System.out.println("Bike Torque : "+bike.getTorque()+" Nm");
	   System.out.println("Bike Weight : "+bike.getWeight()+" KG");
	   System.out.println("Bike Info : "+bike.getLittleInfo());
	   System.out.println("NOTE : Copy the Name of Bike and use 'sortTheBikeBy name_<BIKE_NAME> -jagannath' to get the image");
	   System.out.println("---------------------------------------------------------------------------------------------------------------------------");
   }
   
   private void outputForOnlyName(Showroom bike)
   {
	   Thread t1=new Thread(new Runnable() {
			 public void run()
			 {	
				   MyCanvas m=new MyCanvas(bike);  
			       JFrame f=new JFrame();  
			       f.add(m);  
			       f.setSize(600,600);  
			       f.setVisible(true);  
			 }
		 },"Shows Image of the bike");
		 
	   Thread t2=new Thread(new Runnable() {
			 public void run()
			 {
	   System.out.println("---------------------------------------------------------------------------------------------------------------------------");
	   System.out.println("Bike Name : "+bike.getBikeName());
	   System.out.println("Bike Type : "+bike.getBikeType());
	   System.out.println("Bike Color : "+bike.getColor());
	   System.out.println("Bike Engine Capacity : "+bike.getEngineCapacity()+" CC");
	   System.out.println("Bike Fuel Capacity : "+bike.getFuelCapacity()+" Liter");
	   System.out.println("Bike Mileage : "+bike.getMileage()+" KMPL");
	   System.out.println("Bike Power : "+bike.getPower()+" PS");
	   System.out.println("Bike Price : "+bike.getMinPrice()+" rupees");
	   System.out.println("Bike Price : "+bike.getMaxPrice()+" rupees");
	   System.out.println("Bike Seat Height : "+bike.getSeatHeight()+" mm");
	   System.out.println("Bike Torque : "+bike.getTorque()+" Nm");
	   System.out.println("Bike Weight : "+bike.getWeight()+" KG");
	   System.out.println("Bike Info : "+bike.getLittleInfo()+"\n"+bike.getMoreInfo());
	   System.out.println("Company Details : "+bike.getInfo());
	   System.out.println("---------------------------------------------------------------------------------------------------------------------------");
			 }
		 },"Pinting details of the bike");
	   	
			 t1.start();
			 t2.start();
			
			 try {
			  t1.join();
			  t2.join();
			 }
			 catch(Exception e)
			 {
				 System.out.println(e);
			 }
   }
   
   public static int stringCompare(String str1, String str2)
   {
 
       int l1 = str1.length();
       int l2 = str2.length();
       int lmin = Math.min(l1, l2);
 
       for (int i = 0; i < lmin; i++) {
           int str1_ch = (int)str1.charAt(i);
           int str2_ch = (int)str2.charAt(i);
 
           if (str1_ch != str2_ch) {
               return str1_ch - str2_ch;
           }
       }
 
       if (l1 != l2) {
           return l1 - l2;
       }
 
       else {
           return 0;
       }
   }
   
   public boolean checkPrintOrNot(Showroom bike,SortingAttributes conditions)
   {
	   
	   if(!conditions.getColor().equals("") && stringCompare(bike.getColor(),conditions.getColor()) != 0)
		   return false;
	   
	   if(!conditions.getBikeType().equals("") && stringCompare(bike.getBikeType(),conditions.getBikeType()) != 0)
		   return false;
	   
	   if(conditions.getEngineCapacity() != 0 && bike.getEngineCapacity() < conditions.getEngineCapacity())
		   return false;

	   if(conditions.getMileage() != 0 && bike.getMileage() < conditions.getMileage())
		   return false;

	   if(conditions.getWeight() != 0 && bike.getWeight() < conditions.getWeight())
		   return false;
	   
	   if(conditions.getTorque() != 0 && bike.getTorque() < conditions.getTorque())
		   return false;
	   
	   if(conditions.getFuelCapacity() != 0 && bike.getFuelCapacity() < conditions.getFuelCapacity())
		   return false;
	   
	   if(conditions.getSeatHeight() != 0 && bike.getSeatHeight() < conditions.getSeatHeight())
		   return false;
	   
	   if(conditions.getMinPrice() != 0 && bike.getMinPrice() < conditions.getMinPrice())
		   return false;
	   
	   if(conditions.getMaxPrice() != 0 && bike.getMaxPrice() > conditions.getMaxPrice())
		   return false;
	   
	   if(conditions.getPower() != 0 && bike.getPower() < conditions.getPower())
	   return false;
	   
	   return true;
   }
   

@SuppressWarnings("deprecation")
public void desiredBikes(SortingAttributes conditions)
   {
	  
	     if(conditions.isOnlyName())
	     {
			 Showroom bike;
			 
			 try {
				 String CLASSNAME="subBikes."+conditions.getName();
				 bike=(Showroom)Class.forName(CLASSNAME).newInstance();
				 outputForOnlyName(bike);
			 }
			 catch(Exception e)
			 {
				 System.out.println(e);
			 }
	     }
	     else
	     {
	    	 
	     for(int i=0;i<allBikes.length;i++)
	     {
	    	 
		 Showroom bike;
		 
		 try {
			 String CLASSNAME="subBikes."+allBikes[i];
			 bike=(Showroom)Class.forName(CLASSNAME).newInstance();
			 
			 if(checkPrintOrNot(bike,conditions))
			 {
			 outputBikeInfo(bike,i);
			 }
		 }
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }
		 
	     }
	     
	     
	     }
	   
   }
}
