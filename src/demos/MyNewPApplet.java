package demos;

import processing.core.PApplet;
import processing.core.PImage;

public class MyNewPApplet extends PApplet{
	PImage img,mario;
	int mario_x=50,mario_y=700;
	public void setup(){
		sketchFullScreen();
		background(255);
		
	}
	public void draw(){
		img = loadImage("hd_nature_wallpaper.jpg", "jpg");
		img.resize(width, height);
		image(img,0,0);

		mario = loadImage("mario.png", "png");
		mario.resize(60, 130);

		mario_x=getMarioWidth();
		image(mario,mario_x,mario_y);
		int[] color = sunColorSec();		//calculate color code for sun
		fill(color[0],color[1],color[2]);	//set sun color
		ellipse(width/10,height/10,width/10,height/10);	//draw sun
		
		
	}
	
	public int[] sunColorSec()
	{
		int[] rgb = new int[3];
		// Scale the brightness of the yellow based on the seconds.  0 seconds 
		// is bright yellow.  30 seconds is black.
		
		float ratio = hour()/12;
		rgb[0] = (int)(255*ratio);
		rgb[1] = (int)(255*ratio);
		rgb[2] = 0;
		
		//System.out.println("R" + rgb[0] + " G" + rgb[1] + " B" + rgb[2]);
		return rgb;
	}	
	
	public int getMarioWidth(){
		if(second()%2==0){
			mario_x = mario_x+50;
			if(mario_x >= width){
				mario_x = 50;
			}
			return mario_x+50;
		}
		return mario_x;
	}
	
//	public int getMarioHeight(float seconds){
//		if(seconds%30==0){
//			return mario_y+50;
//		}
//		return mario_y;
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyNewPApplet app = new MyNewPApplet();
		PApplet.main(new String[] {"--present", "MyNewPApplet"});
	}

}
