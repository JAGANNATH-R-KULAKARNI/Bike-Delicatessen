package mainFile;
import java.util.*;  
import Documentation.Documentation;
import Parsing.Parsing;
import SortingAttributes.SortingAttributes;
import OutputDesiredBikes.OutputDesiredBikes;

public class mainFile
{
  public static void main (String[] args) throws InterruptedException
  {
	  Scanner sc= new Scanner(System.in);
	    Documentation.welcomeMessage();
	    Documentation.commandExplaination();
	    
	    while(true)
	    {
	    	Documentation.availableAttributes();
	    	String str= sc.nextLine();
	    	SortingAttributes attributesSelected=new SortingAttributes();
	    	attributesSelected=Parsing.Parse(str);
	    	
	    	System.out.println(attributesSelected.getMessage()+"\n");
	    	if(attributesSelected.getMessage().equals("exit"))
	    		break;
	    	
	    	if(attributesSelected.getMessage().equals("-----------Valid Command----------"))
	    	{
	    		System.out.println("*********************************************************************************************************************************************************************************\nOUTPUT : \n");
	    		 OutputDesiredBikes ODB=new OutputDesiredBikes();
	    		  ODB.desiredBikes(attributesSelected);
	    		  System.out.println("*********************************************************************************************************************************************************************************");
	    	}
	    	
	    }
	    
	    System.out.println("Bye");
  }
}
