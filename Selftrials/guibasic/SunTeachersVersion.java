package guibasic;
import processing.core.*;

public class SunTeachersVersion extends PApplet {

	PImage img;
	
	public void setup(){
		size(400,400);
		background(255);
		stroke(0); //set pen color
	
		
	}
	
	public void draw(){
		
		img=loadImage("http://i.imgur.com/sIuQrEw.jpg","jpg");
		img.resize(width,height);
		image(img,0,0); //display image
		int [] color = sunColor(second()); //calculate color code for sun
		fill(color[0],color[1],color[2]);
		ellipse(width/4,height/5,width/4,height/5);
		
	}
	
	public int[] sunColor(float seconds){
		int[] rgb = new int[3];
		float diff=Math.abs(30-seconds);
		
		float ratio = diff/30;
		rgb[0]=(int)(255* ratio);
		rgb[1]=(int)(255* ratio);
		rgb[2]=0;
			
		return rgb;
	}
	
}
