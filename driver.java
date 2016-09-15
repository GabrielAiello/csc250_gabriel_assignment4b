package hwassignment4csc250;

import java.util.Scanner; 

public class driver 
{
	   public static void main(String[] args) 
	   		{
		      Scanner scnr = new Scanner(System.in);
		      char triangleChar = '-';
		      int triangleHeight = 0;
		      int counter = 0;
		      String s = "";
		      
		      System.out.println("Enter a character: ");
		      triangleChar = scnr.next().charAt(0);   
		      
		      System.out.println("Enter triangle height: ");
		      //triangleHeight = scnr.nextInt();
		      Scanner sc = new Scanner(System.in);
		      int i = sc.nextInt();
		      triangleHeight = i;
		      while (counter < triangleHeight)
		      {
		    	  counter = counter + 1;
		    	  s = "" + s + triangleChar;
		    	  System.out.println("" + s);
		      }
		      /*System.out.println("*" + " ");
		      System.out.println("*" + " " + "*" + " ");
		      System.out.println("*" + " " + "*" + " " + "*" + " ");
		      */
		      return;
		   }

}
