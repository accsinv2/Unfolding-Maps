package guibasic;

import processing.core.PApplet;

public class HappyFace extends PApplet {
	
	
	public void setup(){
		
		size(400,400);
		background(0);
		
	}

	
	public void draw(){
		
		fill(255,255,102);
		ellipse(190,190,380,380);
		fill(0,0,0);
		ellipse(90,130,20,40);
		ellipse(290,130,20,40);
		noFill();
		arc(200, 220, 100, 80, (float)(PI/(2.3)),(float)(PI/(1.2)), OPEN);
		fill(255,192,203);
		arc(180,256,30, 50,(float)(PI/(10)),(float)(PI/(1)));
		
	}
}
