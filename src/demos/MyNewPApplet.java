package demos;
import processing.core.*;

// change the color of sun based on hour of the day
public class MyNewPApplet extends PApplet {
PImage img;
	
	public void setup() {
		//Add setup code for MyPApplet
		size(400,400);				//set canvas size
		background(255);			//set canvas color
		stroke(0);				//set pen color
		img = loadImage("palmTrees.jpg", "jpg");
	}
	
	public void draw() {
		//Add drawing code for MyPApplet
		img.resize(0, height);			//resize loaded image to full height of canvas
		image(img, 0, 0);			//display image 
		int[] color = sunColorSec(second());		//calculate color code for sun
		fill(color[0],color[1],color[2]);	//set sun color
		ellipse(width/4,height/5,width/4,height/5);	//draw sun
		
	}
	
	/** Return the RGB color of the sun at this number of seconds in the minute */
	public int[] sunColorSec(float seconds)
	{
		int[] rgb = new int[3];
		// Scale the brightness of the yellow based on the hour.0 hour 
		// is bright yellow.  24 hour is black.
		float diffFrom24 = Math.abs(24-hour()+12);
		System.out.println(hour());
		float ratio = hour()/12;
		rgb[0] = (int)(255*ratio);
		rgb[1] = (int)(255*ratio);
		rgb[2] = 0;
		
		//System.out.println("R" + rgb[0] + " G" + rgb[1] + " B" + rgb[2]);
		return rgb;
	}	
	
	public static void main (String[] args) {
		//Add main method for running as application
		PApplet.main(new String[] {"--present", "MyNewPApplet"});
	}
}


