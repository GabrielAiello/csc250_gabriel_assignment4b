package hwassignment4csc250;

import java.util.Scanner; 

public class driverb 
{
	   public static void main(String[] args) 
	   {
		      Scanner scnr = new Scanner(System.in);
		      int arrowBaseHeight = 0;
		      int arrowBaseWidth  = 0;
		      int arrowHeadWidth = 0;
		      int TBH = 0; // TBH = temporary base height
		      int TBW = 0; // TBW = temporary base width
		      int THW = 0; // same
		      
		      System.out.println("Enter arrow base height: ");
		      arrowBaseHeight = scnr.nextInt();
		      
		      System.out.println("Enter arrow base width: ");
		      arrowBaseWidth = scnr.nextInt();
		      
		      System.out.println("Enter arrow head width: ");
		      arrowHeadWidth = scnr.nextInt();
		      while (arrowHeadWidth <= arrowBaseWidth) 
		      {
		    	   System.out.println("Enter arrow head width: ");
		    	   arrowHeadWidth = scnr.nextInt();
		      }
		      
		      while (TBH < arrowBaseHeight)
		      {
		    	  while (TBW < arrowBaseWidth)
		    	  {
		    		  System.out.print("*");
		    		  TBW = TBW + 1;
		    	  }
		    	  TBW = 0;
		    	  TBH = TBH + 1;
		    	  System.out.println("");
		      }
		      while (arrowHeadWidth > 0)
		      {
		    	  THW = arrowHeadWidth;
		    			  while (THW > 0)
		    			  {
		    				  System.out.print("*");
		    				  THW = THW - 1;
		    			  }
		    			  System.out.println("");
		    			  arrowHeadWidth = arrowHeadWidth - 1;
		      }
		      /*
		      // Draw arrow base (height = 3, width = 2)
		       
		      System.out.println("**");
		      System.out.println("**");
		      System.out.println("**");
		      
		      // Draw arrow head (width = 4)
		      System.out.println("****");
		      System.out.println("***");
		      System.out.println("**");
		      System.out.println("*");
		      */
		      return;
	   }
}