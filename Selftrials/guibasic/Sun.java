package guibasic;

import java.security.Timestamp;
import java.util.Date;
import java.text.SimpleDateFormat;

import processing.core.*;

public class Sun extends PApplet {

	  //  private String url="http://i.imgur.com/yGR8rvb.png";
	int r,g,b;
	 
	String location="http://i.imgur.com/UAJFB1z.jpg";
	private PImage backgroundimage;
	public static void main(String[] args) {
		PApplet.main("guibasic.Sun");
		
		}
	
	 
	    public void setup(){
	    	  size(width+200,height+200); // this rescales the image as user rescales the applet window
	        
	        // Load image from a web server
	    	  //backgroundimage = loadImage(url, "png");
	    	  backgroundimage = loadImage(location, "png");
	    	 // backgroundimage.resize(0,400); // this can be written in setup and also in draw
	    	  // if we include in draw then this image will be resized multiple times in a loop
	        // THIS HAS A BACKDROP
	    	  // IF THE USER RESIZES THE CANVAS, OUR IMAGE WONT BE RESIZED , SO BETTER INCLUDE IN DRAW METHOD
	    	  //THAT WAY THIS IMAGE WILL BE DYNAMIC RESIZE
	    	  
	    	  
	    	  //the code below changes the color of the sun according to the time of day
	    	  int time;
	    	  time=Integer.parseInt(new SimpleDateFormat("HH").format(new Date()));
	    	//  System.out.println(time+" "+r);
	    	  
	    	 if(time > 21 && time < 10){ r=105;
	    			 					 g=105;
	    			 					b=105;}
	    	 if(time >=10 && time <= 17){r=255;
	    	 						     g=205;
	    	 						     b=0;}
	    	 if(time >=17 && time <= 21){r=0;
	    	 							g=128;
	    	 							b=0;}
	    	 
	    
	    }

	    
	    public void draw(){
	  //      ellipse(width/2,height/2,second()+20,second());
	      //  System.out.println(second());
	    	  
	    	background(0,0,0);
	    	  image(backgroundimage, 0, 0);
	    	  backgroundimage.resize(width,height);
	    	  // fill(255,205,0); fill method fills the upcoming line with the color you provide here
	    	
	    	  
	    	  fill(r,g,b);
	    	  ellipse(width/4,height/4,width/6,height/6);// first two are the position then the radius n alll
	    	  
	    }
	    
}
